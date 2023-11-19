package com.Design.Design.controller;

import com.Design.Design.pojo.Request;
import com.Design.Design.service.PayableAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/billingSystem")
public class DiscountController {

    @Autowired
    PayableAmount payableAmount;
    @PostMapping("/getPayableAmount")
    public ResponseEntity<?> getPayableAmount(@RequestBody Request request){
        Map<String, Long> totalPayableAmount = payableAmount.getPayableAmount(request);
        return ResponseEntity.ok(totalPayableAmount);
    }
}
