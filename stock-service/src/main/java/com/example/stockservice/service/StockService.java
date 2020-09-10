package com.example.stockservice.service;

import com.example.stockservice.model.Stock;

import java.util.List;

public interface StockService {

    public Object addStock(Stock stock);

    public List<Stock> getAllStocks(Long userId);
}
