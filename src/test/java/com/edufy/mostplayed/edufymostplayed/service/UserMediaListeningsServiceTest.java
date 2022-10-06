package com.edufy.mostplayed.edufymostplayed.service;

import com.edufy.mostplayed.edufymostplayed.model.Media;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMediaListeningsServiceTest {

    @Mock
    private UserMediaListeningsService userMediaListeningsService;

    @Test
    void shouldGetTopMedia() {
        Media testMedia = new Media(2, "url", LocalDate.of(2022, 10, 22), "Woho");
        Mockito.when(userMediaListeningsService.getTopMedia(5))
                .thenReturn(testMedia);
        assertEquals(testMedia, userMediaListeningsService.getTopMedia(5));
    }

    // Tester som jag är osäker på..

    /*@Test
    void shouldGetTopMedia() {
        //User testUser = new User(3, "MatWin", "User", "Lösenord");
        Media testMedia = new Media(5, "url", LocalDate.of(1990, 12, 06), "Yaaa");
        Mockito.when(mediaRepo.findMediaById(userMediaListeningRepo.findMediaIdOnUserNative(3)))
                        .thenReturn(testMedia);
        assertEquals(testMedia, mediaRepo.findMediaById(userMediaListeningRepo.findMediaIdOnUserNative(3)));
    }

    @Test
    void shouldGetTopMediaOnUserId() {
        //User testUser = new User(3, "MatWin", "User", "Lösenord");
        Media testMedia = new Media(2, "url", LocalDate.of(2022, 10, 22), "Woho");
        //UserMediaListening userMediaListening = new UserMediaListening(1, testUser, testMedia);
        Mockito.when(userMediaListeningsService.getTopMedia(3))
                .thenReturn(testMedia);
        assertEquals("Woh", userMediaListeningsService.getTopMedia(3).getMedianame());
    }*/
    }
