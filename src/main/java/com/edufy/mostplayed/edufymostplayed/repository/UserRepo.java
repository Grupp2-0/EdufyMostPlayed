package com.edufy.mostplayed.edufymostplayed.repository;
import com.edufy.mostplayed.edufymostplayed.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
 * Interface UserRepo är annoterat med @Repository och ger oss tillgång till JpaResository via nyckelordet extends.
 * @author Matilda Wintence, Jesper Johansson.
 */
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
