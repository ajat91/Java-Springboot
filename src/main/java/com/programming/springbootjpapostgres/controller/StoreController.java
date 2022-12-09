package com.programming.springbootjpapostgres.controller;


import com.programming.springbootjpapostgres.dto.StoreDTO;
import com.programming.springbootjpapostgres.model.Store;
import com.programming.springbootjpapostgres.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;
    @PostMapping("/add/{merchantId}")
   public StoreDTO addStoreMerchant(@PathVariable Long merchantId, @RequestBody StoreDTO request){
        final Store store=storeService.mapToEntity(request);
        final Store result=storeService.addStore(merchantId,store);
        return storeService.mapToDto(result);
   }
}

