package com.mirea.fitness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirea.fitness.models.Type;

@Repository
public interface ITypeRepository extends JpaRepository<Type, Integer> {

}
