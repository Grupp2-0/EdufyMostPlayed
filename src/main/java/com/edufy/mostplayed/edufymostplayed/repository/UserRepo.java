package com.edufy.mostplayed.edufymostplayed.repository;

import com.edufy.mostplayed.edufymostplayed.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
