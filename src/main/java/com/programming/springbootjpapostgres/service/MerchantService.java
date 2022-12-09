package com.programming.springbootjpapostgres.service;

import com.programming.springbootjpapostgres.dto.MerchantDTO;
import com.programming.springbootjpapostgres.model.Merchant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MerchantService {

    Merchant create (Merchant merchant);
    Merchant update (Long id,Merchant merchant);
    Boolean delete (Long id);
    List<Merchant> findAll();
    Merchant findById(Long id);
    Page<Merchant> findAll(Pageable pageable);
    MerchantDTO mapToDto(Merchant merchant);
    Merchant mapToEntity (MerchantDTO merchantDTO);
}
