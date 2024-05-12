package com.mirea.fitness.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirea.fitness.models.Type;
import com.mirea.fitness.repositories.ITypeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeService {
    private ITypeRepository iTypeRepository;

    @Autowired
    public TypeService(ITypeRepository iTypeRepository) {
        this.iTypeRepository = iTypeRepository;
    }

    public List<Type> getAllTypes() {
        return iTypeRepository.findAll();
    }

}
