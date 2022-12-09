package com.programming.springbootjpapostgres.service;

import com.programming.springbootjpapostgres.dto.StoreDTO;
import com.programming.springbootjpapostgres.model.Store;

public interface StoreService {
    Store addStore(Long merchantId,Store store);

    Store mapToEntity(StoreDTO storeDTO);
    StoreDTO mapToDto(Store store);
}
