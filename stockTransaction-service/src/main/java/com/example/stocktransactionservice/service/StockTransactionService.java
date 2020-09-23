package com.example.stocktransactionservice.service;

import com.example.stocktransactionservice.model.StockTransaction;

import java.util.List;
import java.util.Optional;

public interface StockTransactionService {

    public StockTransaction addStock(StockTransaction stockTransaction);

    public List<StockTransaction> getAllStocks(Long userId);
}
