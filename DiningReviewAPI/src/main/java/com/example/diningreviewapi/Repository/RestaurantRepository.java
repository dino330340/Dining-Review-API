package com.example.diningreviewapi.Repository;

import com.example.diningreviewapi.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    Iterable<Restaurant> findRestaurantsByZipCodeAndPeanutScoreNotNullOrderByPeanutScore(String zipcode);

    Iterable<Restaurant> findRestaurantsByZipCodeAndDairyScoreNotNullOrderByDairyScore(String zipcode);

    Iterable<Restaurant> findRestaurantsByZipCodeAndEggScoreNotNullOrderByEggScore(String zipcode);

    Optional<Restaurant> findRestaurantsByNameAndZipCode(String name, String zipCode);
}
