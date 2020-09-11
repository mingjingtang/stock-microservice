package com.example.stocktransactionservice.repository;

import com.example.stocktransactionservice.model.StockUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockUserRepository extends JpaRepository<StockUser, Long> {
}
