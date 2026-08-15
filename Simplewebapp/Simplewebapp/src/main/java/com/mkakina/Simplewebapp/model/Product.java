package com.mkakina.Simplewebapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int proId;
    private String prodName;
    private int price;

}
