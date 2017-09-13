package airline.controller;

import airline.model.Flight;
import airline.services.FlightSearchService;
import airline.services.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
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


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("flight",new Flight());
        return "flightSearch";
    }

    @RequestMapping(value = "/flightSearch",  method = RequestMethod.POST)
    public String flightSearch(@ModelAttribute(value="flight") Flight flight, BindingResult bindingResult, Model model) throws ParseException {
        int seats= flight.getSeats();
        if(seats == 0)
        {
            seats =1;
        }
        List<Flight> flightList=flightSearch.getAllTheFlights(flight);//Calling the all flights in DB
        model.addAttribute("flightList",flightList);
        return  "flightSearchResults";
}

}
