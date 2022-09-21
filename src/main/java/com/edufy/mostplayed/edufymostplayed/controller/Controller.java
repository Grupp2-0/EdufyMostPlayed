package com.edufy.mostplayed.edufymostplayed.controller;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.service.UserMediaListeningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/listenings")
@RestController
public class Controller {

    @Autowired
    private UserMediaListeningsService userMediaListeningsService;

    @GetMapping("/gettopmedia")
    public Media getTopMedia() {
        return userMediaListeningsService.getTopMedia();
    }


}
