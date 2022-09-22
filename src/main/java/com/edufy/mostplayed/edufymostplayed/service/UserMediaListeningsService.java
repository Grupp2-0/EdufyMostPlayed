package com.edufy.mostplayed.edufymostplayed.service;

import com.edufy.mostplayed.edufymostplayed.exception.ResourceNotFoundException;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import com.edufy.mostplayed.edufymostplayed.model.UserMediaListening;
import com.edufy.mostplayed.edufymostplayed.repository.MediaRepo;
import com.edufy.mostplayed.edufymostplayed.repository.UserMediaListeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMediaListeningsService {

    @Autowired
    private MediaRepo mediaRepo;

    @Autowired
    private UserMediaListeningRepo userMediaListeningRepo;

    //TODO: If user has no listenings then handle this null exception. Extenda/implementera exception och returnera något annat än Media

    public Media getTopMedia() {
        int imaginaryUserId = 1;
        // Get real logged-in user
        int mediaIdTemp = userMediaListeningRepo.findMediaOnUserNative(imaginaryUserId);
        return mediaRepo.findMediaById(mediaIdTemp);
    }

/*    @Override
    public void deleteBooking(int id) {
        bookingRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking", "Id", id));
        logger.info("Deleting booking");
        bookingRepo.deleteById(id);
    }*/

  /*  .orElseThrow(() -> new ResourceNotFoundException("Media", "Id", mediaIdTemp));*/




}
    //SELECT  mediamediaid, COUNT(mediamediaid) NumberOfListenings FROM user_media_listenings WHERE useruserid = 1
     //   GROUP BY mediamediaid ORDER BY COUNT(mediamediaid) DESC LIMIT 1;