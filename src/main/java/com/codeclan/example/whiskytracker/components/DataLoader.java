package com.codeclan.example.whiskytracker.components;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import com.codeclan.example.whiskytracker.repository.DistilleryRepository;
import com.codeclan.example.whiskytracker.repository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Distillery distillery1 = new Distillery("Shandy", "Scottish Hills");
        Whisky whisky1 = new Whisky("shandy wye",distillery1, 1999, 18 );
        distilleryRepository.save(distillery1);
        whiskyRepository.save(whisky1);
    }
}
