package com.mirea.fitness.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirea.fitness.models.Product;
import com.mirea.fitness.repositories.IProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private IProductRepository iProductRepository;

    @Autowired
    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    public List<Product> getAllProductsByTypeId(int typeId) {
        if (typeId != 0)
            return iProductRepository.findAllByTypeId(typeId);
        else
            return getAllProducts();
    }

    public List<Product> getAllProducts() {
        return iProductRepository.findAll();
    }

    public Product getProductById(int id) {
        return iProductRepository.findById(id);
    }
}
