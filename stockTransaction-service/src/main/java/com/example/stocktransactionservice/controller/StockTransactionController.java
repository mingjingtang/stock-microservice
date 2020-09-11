package com.example.stocktransactionservice.controller;

import com.example.stocktransactionservice.model.StockTransaction;
import com.example.stocktransactionservice.service.StockTransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockTransactionController {

    @Autowired
    StockTransactionServiceImpl stockService;

    @PostMapping("/addstock")
    public StockTransaction addStock(@RequestBody StockTransaction stockTransaction){
        return stockService.addStock(stockTransaction);
    }

    @GetMapping("/{userId}/getallstocks")
    public List<StockTransaction> getAllStocks(@PathVariable Long userId){
        return stockService.getAllStocks(userId);
    }
}
