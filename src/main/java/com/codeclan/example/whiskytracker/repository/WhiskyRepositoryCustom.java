package com.codeclan.example.whiskytracker.repository;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> findWhiskiesFromParticularDistilleryOfSpecificAge(Distillery distillery, int age);
}
