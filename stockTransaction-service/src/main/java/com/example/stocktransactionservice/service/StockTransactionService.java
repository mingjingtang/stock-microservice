package com.example.stocktransactionservice.service;

import com.example.stocktransactionservice.model.StockTransaction;

import java.util.List;

public interface StockTransactionService {

    public Object addStock(StockTransaction stockTransaction);

    public List<StockTransaction> getAllStocks(Long userId);
}
