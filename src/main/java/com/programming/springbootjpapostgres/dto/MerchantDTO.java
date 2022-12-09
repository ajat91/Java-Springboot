package com.programming.springbootjpapostgres.dto;

import com.programming.springbootjpapostgres.model.Store;

import java.util.List;

public record MerchantDTO(Long id, String name, List <StoreDTO> stores) {
}
