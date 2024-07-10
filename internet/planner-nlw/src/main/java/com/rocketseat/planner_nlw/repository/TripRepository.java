package com.rocketseat.planner_nlw.repository;

import com.rocketseat.planner_nlw.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TripRepository extends JpaRepository<Trip, Long> {
    Optional<Trip> findById(UUID id);
}
