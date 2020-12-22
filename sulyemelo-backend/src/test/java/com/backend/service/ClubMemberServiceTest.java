package com.backend.service;


import com.backend.entity.ClubMember;
import com.backend.repository.ClubMemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClubMemberServiceTest {

    @Autowired
    private ClubMemberService clubMemberService;

    @Test
    void clubMemberSave() {
        ClubMember clubMember = new ClubMember();
        clubMember.setName("neptun");
        final ClubMemberRepository clubMemberRepository = (ClubMemberRepository) clubMemberService.getRepository();
        assertEquals(clubMember, clubMemberRepository.save(clubMember));
    }
}