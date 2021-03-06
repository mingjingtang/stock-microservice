package com.example.stocktransactionservice.controller;

import com.example.stocktransactionservice.model.StockTransaction;
import com.example.stocktransactionservice.service.StockTransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StockTransactionController {

    @Autowired
    StockTransactionServiceImpl stockTransactionService;

    @PostMapping("/addstock")
    public StockTransaction addStock(@RequestBody StockTransaction stockTransaction){
        return stockTransactionService.addStock(stockTransaction);
    }

    @GetMapping("/{userId}/getallstocks")
    public List<StockTransaction> getAllStocks(@PathVariable Long userId){
        return stockTransactionService.getAllStocks(userId);
    }
}
