package fact.it.restaurant.controller;

import fact.it.restaurant.model.Reservation;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Controller
public class MainController {
    private ArrayList<String> restaurantList = new ArrayList<>();
    private ArrayList<Reservation> reservationList = new ArrayList<>();
    @RequestMapping("/reservation")
    public String reservation


}
