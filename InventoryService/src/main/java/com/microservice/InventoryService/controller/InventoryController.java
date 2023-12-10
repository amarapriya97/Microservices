package com.microservice.InventoryService.controller;

import com.microservice.InventoryService.dto.InventoryResponse;
import com.microservice.InventoryService.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    // http://localhost:8082/api/inventory/iphone-13,iphone13-red

    // http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone13-red
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> isInStock(@PathVariable("sku-code") String skuCode) {
        log.debug("Received inventory check request for skuCode: {}", skuCode);
//         if(inventoryService.isInStock("iphone_14"))
        	 return new ResponseEntity<String>("In Stock.!", HttpStatus.OK);
//         else 
//        	 return new ResponseEntity<String>("Not in Stock...!", HttpStatus.OK);
    }
}