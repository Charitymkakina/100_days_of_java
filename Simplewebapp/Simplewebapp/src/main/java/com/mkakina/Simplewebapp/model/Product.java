package com.mkakina.Simplewebapp.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int proId;
    private String prodName;
    private int price;

}
