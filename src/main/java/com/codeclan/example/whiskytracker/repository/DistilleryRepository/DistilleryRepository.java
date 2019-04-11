package com.codeclan.example.whiskytracker.repository.DistilleryRepository;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {

    List<Distillery> findDistilleryByRegion(String region);
public List<Whisky> findWhiskiesFromParticularDistilleryOfSpecificAge(String name, int age);
}
