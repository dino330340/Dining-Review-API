package com.example.diningreviewapi.Repository;

import com.example.diningreviewapi.Model.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByRestaurantIdAndStatus(Long restaurantId, String reviewStatus);
    List<Review> findReviewsByStatus(String reviewStatus);
}
