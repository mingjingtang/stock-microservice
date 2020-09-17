package com.example.stocktransactionservice.service;

import com.example.stocktransactionservice.model.StockTransaction;
import com.example.stocktransactionservice.model.StockUser;
import com.example.stocktransactionservice.repository.StockTransactionRepository;
import com.example.stocktransactionservice.repository.StockUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockTransactionServiceImpl implements StockTransactionService {

    @Autowired
    StockTransactionRepository stockTransactionRepository;

    @Autowired
    StockUserRepository stockUserRepository;


    @Override
    public Optional<StockTransaction> addStock(StockTransaction stockTransaction) {
        stockTransactionRepository.save(stockTransaction);

        StockUser newTransaction = new StockUser();
        newTransaction.setUserId(stockTransaction.getUserId());
        newTransaction.setStockId(stockTransaction.getId());
        stockUserRepository.save(newTransaction);

        return stockTransactionRepository.findById(stockTransaction.getId());
    }

    
    @Override
    public Optional<StockTransaction> getAllStocks(Long userId) {
        return stockTransactionRepository.findBYUserIdOrderByCompanyName(userId);
    }
}
