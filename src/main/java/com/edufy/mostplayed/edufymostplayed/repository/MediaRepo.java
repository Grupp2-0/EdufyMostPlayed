package com.edufy.mostplayed.edufymostplayed.repository;
import com.edufy.mostplayed.edufymostplayed.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
/*
 * Interface MediaRepo är annoterat med @Repository och ger oss tillgång till JpaResository via nyckelordet extends.
 * Utöver de metoder som medföljer så har vi skapat en egen named query som genom sitt namn skapar en query till databasen.
 * @author Matilda Wintence, Jesper Johansson.
 */
@Repository
public interface MediaRepo extends JpaRepository<Media, Integer> {
    List<Media> findMediaById(int mediaId);
}
