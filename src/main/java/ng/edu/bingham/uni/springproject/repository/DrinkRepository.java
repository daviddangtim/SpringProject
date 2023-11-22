package ng.edu.bingham.uni.springproject.repository;

import ng.edu.bingham.uni.springproject.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrinkRepository extends JpaRepository <Drink, Long> {
//    @Query("")
//    List<Drinks> findDrinksByPriceGreaterThan(int price);

}
