package com.example.stockservice.controller;

import com.example.stockservice.model.Stock;
import com.example.stockservice.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockServiceImpl stockService;

    @PostMapping("/addstock")
    public Stock addStock(@RequestBody Stock stock){
        return stockService.addStock(stock);
    }

    @GetMapping("/{userId}/getallstocks")
    public List<Stock> getAllStocks(@PathVariable Long userId){
        return stockService.getAllStocks(userId);
    }
}
