package com.edufy.mostplayed.edufymostplayed.repository;

import com.edufy.mostplayed.edufymostplayed.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepo extends JpaRepository<Media, Integer> {

    Media findMediaById(int mediaId);

}
