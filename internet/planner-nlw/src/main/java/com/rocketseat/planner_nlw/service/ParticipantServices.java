package com.rocketseat.planner_nlw.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantServices {
    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID id){}
    public void triggerConfirmationEmailToParticipants(UUID tripId){}
}
