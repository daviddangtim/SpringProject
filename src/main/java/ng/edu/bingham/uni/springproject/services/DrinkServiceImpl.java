package ng.edu.bingham.uni.springproject.services;

import ng.edu.bingham.uni.springproject.domain.Drink;
import ng.edu.bingham.uni.springproject.repository.DrinkRepository;
import ng.edu.bingham.uni.springproject.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkServiceImpl implements DrinkService{
    @Autowired
    DrinkRepository drinkRepository;

    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        Optional <Drink> drink = drinkRepository.findById(id);
        Drink emptydrink = null;
        if (drink.isPresent()){
            emptydrink = drink.get();
            return emptydrink;

        } else {
            throw new RuntimeException("Drink Not FOund");
        }
    }

    @Override
    public List<Drink> getAllDrink() {

        return drinkRepository.findAll();
    }

    @Override
    public Drink updateDrink(long id) {
        Optional<Drink> optionalDrink = drinkRepository.findById(getDrinkById(id).getId());
        if(drink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink = drink.get();
            updateDrink.setCapacity(updateDrink.getCapacity());
            updateDrink.setColour(updateDrink.getColour());
            updateDrink.setCompany(updateDrink.getCompany());
            updateDrink.setName(updateDrink.getName());
            updateDrink.setType(updateDrink.getType());
            updateDrink.setId(updateDrink.getId());
            updateDrink.setIngredientList(updateDrink.getIngredientList());

            drinkRepository.save(updateDrink);
        }else {
            throw new RuntimeException("Drink does not exist");
        }
        return null;
    }

    @Override
    public void deleteDrink(long id) {
        drinkRepository.deleteById(id);

    }
}
