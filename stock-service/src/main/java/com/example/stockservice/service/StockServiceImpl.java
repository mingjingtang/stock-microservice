package com.example.stockservice.service;

import com.example.stockservice.model.Stock;
import com.example.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockRepository stockRepository;


    @Override
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    //not yet done, need to connect with user repository to get user information, and linked two table together
    @Override
    public List<Stock> getAllStocks(Long userId) {
        return null;
    }
}
