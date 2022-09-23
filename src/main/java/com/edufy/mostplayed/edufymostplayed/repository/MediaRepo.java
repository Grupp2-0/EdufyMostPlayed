package com.edufy.mostplayed.edufymostplayed.repository;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
 * Interface MediaRepo är annoterat med @Repository och ger oss tillgång till JpaResository via nyckelordet extends.
 * Utöver de metoder som medföljer så har vi skapat en egen named-query.
 * @author Matilda Wintence, Jesper Johansson.
 */
@Repository
public interface MediaRepo extends JpaRepository<Media, Integer> {
    Media findMediaById(int mediaId);
}
