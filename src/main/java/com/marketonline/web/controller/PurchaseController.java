package com.marketonline.web.controller;

import com.marketonline.domain.Purchase;
import com.marketonline.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

     @Autowired
    private PurchaseService purchaseServiceE;
     @GetMapping("/all")
      public ResponseEntity<List<Purchase>> getAll(){
         return new ResponseEntity<>(purchaseServiceE.getAll(), HttpStatus.OK);

     }
}
