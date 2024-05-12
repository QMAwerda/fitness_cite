package com.mirea.fitness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirea.fitness.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    Long deleteById(int id);
}
