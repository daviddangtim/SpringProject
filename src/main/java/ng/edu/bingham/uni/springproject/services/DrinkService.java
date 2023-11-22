package ng.edu.bingham.uni.springproject.services;

import ng.edu.bingham.uni.springproject.domain.Drink;


import java.util.List;

public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List <Drink> getAllDrink();
    Drink updateDrink(long id);
    void deleteDrink(long id);
}
