package com.example.stocktransactionservice.repository;

import com.example.stocktransactionservice.model.StockTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockTransactionRepository extends CrudRepository<StockTransaction,Long> {

}
