package com.edufy.mostplayed.edufymostplayed.service;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.repository.MediaRepo;
import com.edufy.mostplayed.edufymostplayed.repository.UserMediaListeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/*
 * Klassen UserMediaListeningsService är annoterat med @Service.
 * I klassen har vi två @Autowired annoteringar och hänvisning till relevanta repositories.
 * Metoden getTopMedia returnerar en lista av Mediaobjekt. Vi skapar en imaginaryUser och sätter denne till userId 3 för
 *  testning av funktionen innan vi satt upp inloggning.
 * @author Matilda Wintence, Linda Djurström.
 */
@Service
public class UserMediaListeningsService {
    @Autowired
    private MediaRepo mediaRepo;
    @Autowired
    private UserMediaListeningRepo userMediaListeningRepo;

    public List<Media> getTopMedia() {
        int imaginaryUserId = 3;
        // TODO:Get real logged-in user
        return mediaRepo.findMediaById(userMediaListeningRepo.findMediaOnUserNative(imaginaryUserId));
    }
}