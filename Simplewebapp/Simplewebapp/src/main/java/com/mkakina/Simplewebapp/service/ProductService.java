package com.mkakina.Simplewebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkakina.Simplewebapp.model.Product;

@Service
public class ProductService {
    List <Product> products = Arrays.asList(
        new Product(101, "Iphone", 50000), 
        new Product(102,"Samsung",45000));
    public List<Product> getProduct(){
        return null;
    }
}
