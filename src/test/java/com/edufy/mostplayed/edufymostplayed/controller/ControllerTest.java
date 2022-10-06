package com.edufy.mostplayed.edufymostplayed.controller;

import com.edufy.mostplayed.edufymostplayed.model.Media;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerTest {

    @Mock
    private Controller controller;

    @Test
    void shouldGetTopMedia() {
        Media testMedia = new Media(2, "url", LocalDate.of(2022, 10, 22), "Woho");
        Mockito.when(controller.getTopMedia(3))
                .thenReturn(testMedia);
        assertEquals(2, controller.getTopMedia(3).getId());
    }
}