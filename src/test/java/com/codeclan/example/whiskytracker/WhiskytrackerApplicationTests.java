package com.codeclan.example.whiskytracker;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import com.codeclan.example.whiskytracker.repository.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.whiskytracker.repository.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskytrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskiesFromParticularDistilleryOfSpecificAge() {
		List<Whisky> found = distilleryRepository.findWhiskiesFromParticularDistilleryOfSpecificAge("Glendronach", 12);
		assertEquals("The Glendronach Original", found.get(3).getName());
	}

	@Test
	public void CreateDistilleryAndWhiskySave() {

		Distillery distillery1 = new Distillery("Glendronach", "Highland");
		distilleryRepository.save(distillery1);


		Whisky whisky1 = new Whisky("The Glendronach Revival", 15, 2018, distillery1);
		whiskyRepository.save(whisky1);

		Distillery distillery2 = new Distillery("Rosebank", "Lowland");
		distilleryRepository.save(distillery2);

		Whisky whisky2 = new Whisky("The Rosebank 12 - Flora and Fona", 12, 1991, distillery2);
		whiskyRepository.save(whisky2);


		Distillery distillery3 = new Distillery("Macallan", "Speyside");
		distilleryRepository.save(distillery3);

	}

	@Test
	public void findWhiskiesByYear() { List<Whisky> found = whiskyRepository.findWhiskiesByYear(2018);

	}

	@Test
	public void findDistilleryByRegion() {List<Distillery> found = distilleryRepository.findDistilleryByRegion("Lowland");

	}

}
