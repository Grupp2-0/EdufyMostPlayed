package com.edufy.mostplayed.edufymostplayed.service;

import com.edufy.mostplayed.edufymostplayed.repository.MediaRepo;
import com.edufy.mostplayed.edufymostplayed.repository.UserMediaListeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    @Autowired
    private MediaRepo mediaRepo;

    @Autowired
    private UserMediaListeningRepo userMediaListeningRepo;


}
