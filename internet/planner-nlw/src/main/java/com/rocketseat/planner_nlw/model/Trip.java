package com.rocketseat.planner_nlw.model;

import com.rocketseat.planner_nlw.DTO.TripRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String destination;

    @Column(name = "starts_at")
    private LocalDateTime startsAt;

    @Column(name = "ends_at")
    private LocalDateTime endsAt;

    private String ownerEmail;
    private String ownerName;

    @Column(name = "is_confirmed")
    private Boolean isConfirmed;

    public Trip(TripRequestDTO data) {
        this.destination = data.destination();
        this.startsAt = LocalDateTime.parse(data.starts_at());
        this.endsAt = LocalDateTime.parse(data.ends_at());
        this.ownerEmail = data.owner_email();
        this.ownerName = data.owner_name();
        this.isConfirmed = data.is_confirmed() != null ? data.is_confirmed() : false; // Usar valor do DTO ou padrão
    }
}

