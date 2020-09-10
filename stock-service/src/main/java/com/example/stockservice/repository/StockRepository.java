package com.example.stockservice.repository;

import com.example.stockservice.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock,Integer> {

}
