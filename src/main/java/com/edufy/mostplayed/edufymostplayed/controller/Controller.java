package com.edufy.mostplayed.edufymostplayed.controller;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.service.UserMediaListeningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* Klassen Controller sköter @GetMapping anropet från endpointen /listenings/gettopmedia som returnerar den inloggade användarens mest lyssnade låt genom userMediaListeningsService.
* @author Matilda Wintence, Jesper Johansson, Linda Djurström
* Metoden getTopMedia returnerar en lista av Mediaobjekt.
*/
@RequestMapping("/listenings")
@RestController
public class Controller {
    @Autowired
    private UserMediaListeningsService userMediaListeningsService;

    @GetMapping("/gettopmedia")
    public Media getTopMedia(int userId) {
        return userMediaListeningsService.getTopMedia(userId);
    }
}
