package airline.services;

import airline.model.Flight;
import airline.model.FlightTicketBooking;
import java.util.ArrayList;
import java.util.List;


public class FlightSearchService {

    private FlightService flightService;
    private List<Flight> flightList;

    public FlightSearchService()
    {
        flightList=new ArrayList<Flight>();
        flightService =new FlightService();
    }
    public List<Flight> getAllTheFlights(String source,String destination,int seats)
    {
        if(seats ==0)
        {
            seats =1;
        }
        for(Flight flight:flightService.getFlightList())
        {
            if(source.equals(flight.getSource()) && destination.equals(flight.getDestination()) && flight.getSeats()>= seats) {
                    flightList.add(flight);
            }
        }
        return flightList;
    }

}
