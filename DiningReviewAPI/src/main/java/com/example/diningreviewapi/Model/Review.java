package com.example.diningreviewapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String submittedBy;
    private String restaurantId;
    private String commentary;

    private Integer peanutScore;
    private Integer dairyScore;
    private Integer eggScore;

    private ReviewStatus status;
}
