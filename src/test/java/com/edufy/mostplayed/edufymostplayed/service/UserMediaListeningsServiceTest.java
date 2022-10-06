package com.edufy.mostplayed.edufymostplayed.service;

import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.model.User;
import com.edufy.mostplayed.edufymostplayed.model.UserMediaListening;
import com.edufy.mostplayed.edufymostplayed.repository.MediaRepo;
import com.edufy.mostplayed.edufymostplayed.repository.UserMediaListeningRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMediaListeningsServiceTest {

    @MockBean
    private UserMediaListeningRepo userMediaListeningRepo;
    @MockBean
    private MediaRepo mediaRepo;

    @Test
    void shouldGetTopMedia() {
        //User testUser = new User(3, "MatWin", "User", "Lösenord");
        Media testMedia = new Media(5, "url", LocalDate.of(1990, 12, 06), "Yaaa");
        Mockito.when(mediaRepo.findMediaById(userMediaListeningRepo.findMediaIdOnUserNative(3)))
                        .thenReturn(testMedia);
        assertEquals(testMedia, mediaRepo.findMediaById(userMediaListeningRepo.findMediaIdOnUserNative(3)));
    }
    }
