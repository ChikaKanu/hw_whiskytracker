package com.codeclan.example.whiskytracker.repository;

import com.codeclan.example.whiskytracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
//    List<Distillery> findDistilleryByRegion(String region);
}
