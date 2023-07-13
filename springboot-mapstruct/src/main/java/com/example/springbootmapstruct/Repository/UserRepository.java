package com.example.springbootmapstruct.Repository;

import com.example.springbootmapstruct.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
