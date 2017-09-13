package airline.services;

import airline.model.Flight;
import airline.model.FlightClassCategory;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;


public class FlightSearchService {

    private FlightService flightService;
    private List<Flight> flightList;

    public FlightSearchService()
    {
        flightList=new ArrayList<Flight>();
        flightService =new FlightService();
    }
    public List<Flight> getAllTheFlights(Flight flight) throws ParseException {
        if(flight.getSeats()==0)
        {
            //seats =1;
        }
        boolean hasDepartureDate=false;
        hasDepartureDate = flight.getDepartureDate()!= null;

       flightList=  flightService.getFlightList().stream()
                .filter(flt ->flt.getSourceCity().equals(flight.getSourceCity()))
                .filter(flt -> flt.getDestination().equals(flight.getDestination()))
                .collect(Collectors.toList());

        if(hasDepartureDate) {
            flightList = flightList.stream()
                    .filter(flt -> flt .getDepartureDate().compareTo(flight.getDepartureDate()) == 0)
                    .collect(Collectors.toList());
        }

        for (Flight flt:flightList) {
            for (FlightClassCategory fltClass: flt.getFlightClassCategories()) {
                if(fltClass.noOfSeats >= flight.getSeats() && fltClass.className.toLowerCase() == flight.getFlightClass().toLowerCase())
                {
                    Double surgePrice=0.00;

                    switch (fltClass.className)
                    {
                        case "Economy":
                            int bookedPercent =0;
                            bookedPercent = (fltClass.bookedSeats / fltClass.noOfSeats)*100;
                            if( bookedPercent >=90)
                            {
                                surgePrice = (fltClass.basePrice *60)/100;
                            }
                            else if(bookedPercent >= 40 )
                            {
                                surgePrice = (fltClass.basePrice *30)/100;
                            }

                       case "Business":
                           SimpleDateFormat departureDayFormat = new SimpleDateFormat("EEEE");
                           String departureDay= departureDayFormat.format(flt.getDepartureDate());
                            if(departureDay == "Monday" || departureDay == "Friday" || departureDay == "Saturday")
                            {
                                surgePrice = (fltClass.basePrice *40)/100;

                            }
                        case "First":
                            int dateMargin = getZeroTimeDate(new Date()).compareTo(getZeroTimeDate(flt.getDepartureDate()));
                            if(dateMargin <=10)
                            {
                                surgePrice = (fltClass.basePrice * dateMargin *10)/100;
                            }
                            else
                            {
                                break;
                            }
                        default:
                                flt.setFare(fltClass.basePrice * flight.getSeats());

                    }
                    flt.setFare((fltClass.basePrice + surgePrice) * flight.getSeats());

                    flt.setSeats(flight.getSeats());
                    flt.setFlightClass(fltClass.className);
                    break;
                }

            }

        }

        return flightList.stream().filter(flt->flt.getFare() >0).collect(Collectors.toList());
    }
    public static Date getZeroTimeDate(Date fecha) {
        Date res = fecha;
        Calendar calendar = Calendar.getInstance();

        calendar.setTime( fecha );
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        res = calendar.getTime();

        return res;
    }

}
