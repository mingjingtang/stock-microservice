package com.example.stocktransactionservice.repository;

import com.example.stocktransactionservice.model.StockTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockTransactionRepository extends CrudRepository<StockTransaction,Long> {

    @Query("FROM StockTransaction WHERE userId = ?1 ORDER BY companyName ASC")
    public List<StockTransaction> findBYUserIdOrderByCompanyName(Long suserId);
}
