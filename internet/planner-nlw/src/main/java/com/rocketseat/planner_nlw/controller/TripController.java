package com.rocketseat.planner_nlw.controller;

import com.rocketseat.planner_nlw.DTO.TripRequestDTO;
import com.rocketseat.planner_nlw.DTO.TripResponseDTO;
import com.rocketseat.planner_nlw.model.Trip;
import com.rocketseat.planner_nlw.repository.TripRepository;
import com.rocketseat.planner_nlw.service.ParticipantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ParticipantServices participantService;

    @Autowired
    private TripRepository repository;

    @PostMapping
    public ResponseEntity<TripResponseDTO> createTrip(@RequestBody TripRequestDTO data) {
        Trip newTrip = new Trip(data);

        this.repository.save(newTrip);
        this.participantService.registerParticipantsToEvent(data.emails_to_invite(), newTrip.getId());

        return ResponseEntity.ok(new TripResponseDTO(newTrip.getId()));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Trip> getTripDetails(@PathVariable UUID id){
        Optional<Trip> trip = this.repository.findById(id);
        return trip.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}