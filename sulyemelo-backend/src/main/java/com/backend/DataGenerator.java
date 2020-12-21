package com.backend;

import com.backend.entity.*;
import com.backend.service.*;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class DataGenerator {


    private final ClubMemberService clubMemberService;
    private final CompetitionService competitionService;
    private final DocumentService documentService;
    private final EventService eventService;
    private final GalleryService galleryService;
    private final NewsletterService newsletterService;
    private final PostService postService;
    private final ProfileService profileService;


    @Autowired
    public DataGenerator(ClubMemberService clubMemberService, CompetitionService competitionService,
                         DocumentService documentService, EventService eventService,
                         GalleryService galleryService, NewsletterService newsletterService,
                         PostService postService, ProfileService profileService) {
        this.clubMemberService = clubMemberService;
        this.competitionService = competitionService;
        this.documentService = documentService;
        this.eventService = eventService;
        this.galleryService = galleryService;
        this.newsletterService = newsletterService;
        this.postService = postService;
        this.profileService = profileService;
    }

    @GetMapping("generate")
    public String run(){
        generateClubMembers();
        generateCompetitions();
        generateDocuments();
        generateEvents();
        generateGallery();
        generateNewsletterEmail();
        generateProfile();
        return "generálva";
    }

    private void generateEvents(){

        Event event01 = new Event();
        Event event02 = new Event();
        Event event03 = new Event();

        event01.setDateTime(LocalDateTime.of(2020, 10, 06, 18, 00));
        event01.setName("Bemutató");
        event01.setTicketPrice(2000);
        event01.setLocation("Pécsi Súlyemelő Egyesület");
        event01.setContactName("Szabó Szilrád");
        event02.setDateTime(LocalDateTime.of(2021, 03, 22, 17, 00));
        event02.setName("Ifjúsági Bajnokság");
        event02.setTicketPrice(2500);
        event02.setLocation("Pécsi Súlyemelő Egyesület");
        event02.setContactName("Szabó Szilrád");
        event03.setDateTime(LocalDateTime.of(2020, 10, 11, 18, 30));
        event03.setName("Amatőr Bajnokság");
        event03.setTicketPrice(1000);
        event03.setLocation("Pécsi Súlyemelő Egyesület");
        event03.setContactName("Szabó Szilrád");

        ArrayList<Event> events = new ArrayList<>();
        events.add(event01);
        events.add(event02);
        events.add(event03);

        eventService.saveAll(events);
    }

    private void generateClubMembers(){

        ClubMember clubMember01 = new ClubMember();
        ClubMember clubMember02 = new ClubMember();
        ClubMember clubMember03 = new ClubMember();

        clubMember01.setBestCleanAndJerk(140);
        clubMember01.setBestSnatch(121);
        clubMember01.setBirthdate(LocalDate.of(1998,04,23));
        clubMember01.setName("Kiss Zoltán");
        clubMember01.setWeightClass(102);
        clubMember02.setBestCleanAndJerk(97);
        clubMember02.setBestSnatch(80);
        clubMember02.setBirthdate(LocalDate.of(2001,03,13));
        clubMember02.setName("Pataki Péter");
        clubMember02.setWeightClass(102);
        clubMember03.setBestCleanAndJerk(101);
        clubMember03.setBestSnatch(78);
        clubMember03.setBirthdate(LocalDate.of(1988,12,03));
        clubMember03.setName("Márton Katalin");
        clubMember03.setWeightClass(81);

        ArrayList<ClubMember> clubMembers = new ArrayList<>();
        clubMembers.add(clubMember01);
        clubMembers.add(clubMember02);
        clubMembers.add(clubMember03);

        clubMemberService.saveAll(clubMembers);
    }

    private void generateCompetitions(){

        Competition competition01 = new Competition();
        Competition competition02 = new Competition();
        Competition competition03 = new Competition();

        competition01.setAgeGroup("felnőtt");
        competition01.setGender(true);
        competition01.setClassSport("Felnőtt III.");
        competition01.setName("Felnőtt OB");
        competition02.setAgeGroup("Minden korosztálynak.");
        competition02.setGender(true);
        competition02.setClassSport("Minden osztálynak.");
        competition02.setName("NARANCS Kupa");
        competition03.setAgeGroup("Minden korosztálynak.");
        competition03.setGender(false);
        competition03.setClassSport("Minden osztálynak.");
        competition03.setName("Göcsej Kupa");

        ArrayList<Competition> competitions = new ArrayList<>();
        competitions.add(competition01);
        competitions.add(competition02);
        competitions.add(competition03);

        competitionService.saveAll(competitions);
    }

    private void generateDocuments(){

        Document document01 = new Document();
        Document document02 = new Document();

        document01.setDateOfCreation(LocalDateTime.of(2020,11,02,13,24));
        document01.setContent("");
        document01.setTitle("Orvosi igazolás");
        document02.setDateOfCreation(LocalDateTime.of(2020,11,02,13,32));
        document02.setContent("");
        document02.setTitle("Jelentkezési lap");

        ArrayList<Document> documents = new ArrayList<>();
        documents.add(document01);
        documents.add(document02);

        documentService.saveAll(documents);
    }

    private void generateGallery(){

        Gallery gallery01 = new Gallery();
        Gallery gallery02 = new Gallery();

        gallery01.setPath("");
        gallery01.setName("Bemutató 01");
        gallery02.setPath("");
        gallery02.setName("Bemutató 02");

        ArrayList<Gallery> galleries = new ArrayList<>();
        galleries.add(gallery01);
        galleries.add(gallery02);

        galleryService.saveAll(galleries);
    }

    private void generateNewsletterEmail(){

        NewsletterEmail email01 = new NewsletterEmail();
        NewsletterEmail email02 = new NewsletterEmail();
        NewsletterEmail email03 = new NewsletterEmail();

        email01.setEmail("kiss@gmail.com");
        email02.setEmail("szabo@freemail.hu");
        email03.setEmail("lk@gmail.com");

        ArrayList<NewsletterEmail> newsletterEmails = new ArrayList<>();
        newsletterEmails.add(email01);
        newsletterEmails.add(email02);
        newsletterEmails.add(email03);

        newsletterService.saveAll(newsletterEmails);
    }

    private void generatePost(){

        Post post01 = new Post();

        post01.setDateOfCreation(LocalDateTime.of(2020,02,02,15,24));
        post01.setBody(VarcharTypeDescriptor.INSTANCE);
        post01.setTitle("A városi középiskolákban toborzott az egyesület");

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post01);

        postService.saveAll(posts);
    }

    private void generateProfile(){

        Profile profile01 = new Profile();

        profile01.setName("user01");

        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.add(profile01);

        profileService.saveAll(profiles);
    }
}
