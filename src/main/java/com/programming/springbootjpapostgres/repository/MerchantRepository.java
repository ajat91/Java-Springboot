package com.programming.springbootjpapostgres.repository;

import com.programming.springbootjpapostgres.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository <Merchant,Long> {


}
