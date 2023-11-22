package ng.edu.bingham.uni.springproject.controller.api;

import ng.edu.bingham.uni.springproject.repository.DrinkRepository;
import ng.edu.bingham.uni.springproject.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DrinkAPI {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;
}
