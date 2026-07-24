package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ExpenseController {
    @PostMapping("/expense")
    public String addExpense(
            @RequestParam String category,
            @RequestParam double amount) {

        return "Expense added successfully!\n" +
               "Category: " + category +
               "\nAmount: Ksh " + amount;
    }
}
