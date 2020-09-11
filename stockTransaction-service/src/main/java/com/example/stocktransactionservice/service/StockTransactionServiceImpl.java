package com.example.stocktransactionservice.service;

import com.example.stocktransactionservice.model.StockTransaction;
import com.example.stocktransactionservice.repository.StockTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockTransactionServiceImpl implements StockTransactionService {

    @Autowired
    StockTransactionRepository stockTransactionRepository;


    @Override
    public StockTransaction addStock(StockTransaction stockTransaction) {
        return stockTransactionRepository.save(stockTransaction);
    }

    //not yet done, need to connect with user repository to get user information, and linked two table together
    @Override
    public List<StockTransaction> getAllStocks(Long userId) {
        
    }
}
