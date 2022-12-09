package com.programming.springbootjpapostgres.repository;
import com.programming.springbootjpapostgres.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository <Store,Long> {
}
