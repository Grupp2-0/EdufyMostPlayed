package com.edufy.mostplayed.edufymostplayed.controller;

import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.model.User;
import com.edufy.mostplayed.edufymostplayed.model.UserMediaListening;
import com.edufy.mostplayed.edufymostplayed.service.UserMediaListeningsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerTest {

    @MockBean
    private UserMediaListeningsService userMediaListeningsService;


    @Test
    void shouldGetTopMediaOnUserId() {
        //User testUser = new User(3, "MatWin", "User", "Lösenord");
        Media testMedia = new Media(2, "url", LocalDate.of(2022, 10, 22), "Woho");
        //UserMediaListening userMediaListening = new UserMediaListening(1, testUser, testMedia);
        Mockito.when(userMediaListeningsService.getTopMedia(3))
                        .thenReturn(testMedia);
        assertEquals(testMedia, userMediaListeningsService.getTopMedia(3));
    }
}