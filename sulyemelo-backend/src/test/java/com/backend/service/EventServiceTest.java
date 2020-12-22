package com.backend.service;

import com.backend.entity.Event;
import com.backend.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class EventServiceTest {
    @Autowired
    private EventService eventService;

    @Test
    void eventSave() {
        Event event = new Event();
        event.setName("neptun");
        final EventRepository eventRepository = (EventRepository) eventService.getRepository();
        assertEquals(event, eventRepository.save(event));
    }
}