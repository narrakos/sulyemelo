package com.backend.service;

import com.backend.entity.Competition;
import com.backend.repository.CompetitionRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CompetitionServiceTest {

    @Autowired
    private CompetitionService competitionService;

    @Test
    public void competitionSave() {
        Competition competition = new Competition();
        competition.setName("neptun");
        final CompetitionRepository competitionRepository = (CompetitionRepository) competitionService.getRepository();
        assertEquals(competition, competitionRepository.save(competition));
    }

}