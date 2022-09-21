package com.edufy.mostplayed.edufymostplayed.repository;
import com.edufy.mostplayed.edufymostplayed.model.UserMediaListening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMediaListeningRepo extends JpaRepository<UserMediaListening, Integer> {

    @Query (value = "SELECT mediamediaid, COUNT(mediamediaid) FROM user_media_listenings WHERE useruserid = ?1 GROUP BY mediamediaid ORDER BY COUNT(mediamediaid) DESC LIMIT 1",
    nativeQuery = true)
    int findMediaOnUserNative(int useruserid);
}
