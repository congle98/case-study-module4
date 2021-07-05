package com.app.service.product;

import com.app.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductService implements IProductService{
    @Autowired
    IProductService productService;
    @Override
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productService.findById(id);
    }

    @Override
    public void save(Product product) {
        productService.save(product);
    }

    @Override
    public void remove(Long id) {
        productService.remove(id);
    }
}
