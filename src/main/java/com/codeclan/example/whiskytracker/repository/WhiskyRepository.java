package com.codeclan.example.whiskytracker.repository;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
//    List<Whisky> findWhiskiesByYear(int year);
//    public List<Whisky> findWhiskiesFromParticularDistilleryOfSpecificAge(Distillery distillery, int age);
//


}
