package com.rocketseat.planner_nlw.controller;

import com.rocketseat.planner_nlw.DTO.TripRequestDTO;
import com.rocketseat.planner_nlw.DTO.TripResponseDTO;
import com.rocketseat.planner_nlw.model.Trip;
import com.rocketseat.planner_nlw.repository.TripRepository;
import com.rocketseat.planner_nlw.service.ParticipantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    @PutMapping("/{id}")
    public ResponseEntity<Trip> updateTrip(@PathVariable UUID id, @RequestBody TripRequestDTO data){
        Optional<Trip> trip = this.repository.findById(id);

        if(trip.isPresent()){
            Trip rawTrip = trip.get();
            rawTrip.setEndsAt(LocalDateTime.parse(data.starts_at(), DateTimeFormatter.ISO_DATE_TIME));
            rawTrip.setStartsAt(LocalDateTime.parse(data.ends_at(), DateTimeFormatter.ISO_DATE_TIME));
            rawTrip.setDestination(data.destination());

            this.repository.save(rawTrip);

            return ResponseEntity.ok(rawTrip);
        }
        return ResponseEntity.notFound().build();
    }
}