package airline.services;

import airline.model.Flight;

import java.io.Console;
import java.text.ParseException;
import java.util.ArrayList;
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
    public List<Flight> getAllTheFlights(final String source, final String destination,final int seats, Date departureDate, String flightClass) throws ParseException {
        if(seats ==0)
        {
            //seats =1;
        }
        boolean hasDepartureDate=false;
        hasDepartureDate = departureDate != null;

       flightList=  flightService.getFlightList().stream()
                .filter(x -> x.getSourceCity().equals(source))
                .filter(x -> x.getDestination().equals(destination))
                .collect(Collectors.toList());

        if(hasDepartureDate) {
            flightList = flightList.stream()
                    .filter(x -> x.getDepartureDate().compareTo(departureDate) == 0)
                    .collect(Collectors.toList());
        }
        flightList =flightList.stream()
                .filter(x-> x.getFlightClassCategories().stream()
//                        .filter(x.className == flightClass && y.noOfSeats >= seats)
                        .collect(Collectors.toList()).size() > 0)
                .collect(Collectors.toList());

        return flightList;
    }

}
