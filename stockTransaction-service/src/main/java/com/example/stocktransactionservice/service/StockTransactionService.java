package com.example.stocktransactionservice.service;

import com.example.stocktransactionservice.model.StockTransaction;

import java.util.Optional;

public interface StockTransactionService {

    public Object addStock(StockTransaction stockTransaction);

    public Optional<StockTransaction> getAllStocks(Long userId);
}
