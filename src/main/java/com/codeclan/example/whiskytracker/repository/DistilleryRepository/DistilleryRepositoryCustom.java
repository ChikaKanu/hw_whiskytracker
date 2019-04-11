package com.codeclan.example.whiskytracker.repository.DistilleryRepository;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {
    public List<Whisky> findWhiskiesFromParticularDistilleryOfSpecificAge(String name, int age);
}
