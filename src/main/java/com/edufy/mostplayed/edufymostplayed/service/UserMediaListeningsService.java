package com.edufy.mostplayed.edufymostplayed.service;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.repository.MediaRepo;
import com.edufy.mostplayed.edufymostplayed.repository.UserMediaListeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * Klassen UserMediaListeningsService är annoterat med @Service.
 * I klassen har vi två @Autowired annoteringar och hänvisning till relevanta repositories.
 * Metoden getTopMedia returnerar ett Mediaobjekt.
 * @author Matilda Wintence, Linda Djurström.
 */
@Service
public class UserMediaListeningsService {
    @Autowired
    private MediaRepo mediaRepo;
    @Autowired
    private UserMediaListeningRepo userMediaListeningRepo;

    public Media getTopMedia(int userId) {
        return mediaRepo.findMediaById(userMediaListeningRepo.findMediaIdOnUserNative(userId));
    }
}