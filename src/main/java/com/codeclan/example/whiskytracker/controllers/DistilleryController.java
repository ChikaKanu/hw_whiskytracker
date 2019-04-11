package com.codeclan.example.whiskytracker.controllers;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import com.codeclan.example.whiskytracker.repository.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskies/{distillery}/{age}")
    public List<Whisky> searchForWhiskiesByDistilleryAndAge(@PathVariable String name, int age) {
        return distilleryRepository.findWhiskiesFromParticularDistilleryOfSpecificAge(name, age);
    }
}
