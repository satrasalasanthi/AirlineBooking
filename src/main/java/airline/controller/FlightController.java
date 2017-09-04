package airline.controller;

import airline.model.Flight;
import airline.services.FlightSearchService;
import airline.services.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@SpringBootApplication

public class FlightController
{

    private FlightService flightService;
    public FlightSearchService flightSearch;

    public FlightController()
    {
        flightService=new FlightService();
        flightSearch=new FlightSearchService();
    }

    public static void main(String []args) {
        SpringApplication.run(FlightController.class,args);
    }

    @RequestMapping(value = "/flightSearch", method = RequestMethod.POST)
    public String flightSearch(@ModelAttribute(value="flight") Flight flight, Model model)
    {
        int seats= flight.getSeats();
        if(seats == 0)
        {
            seats =1;
        }
        List<Flight> flightList=flightSearch.getAllTheFlights(flight.getSource(),flight.getDestination(),seats);
        model.addAttribute("flightList",flightList);
        return  "flightSearchResults";
    }

}
