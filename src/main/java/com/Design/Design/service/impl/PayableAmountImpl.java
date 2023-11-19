package com.Design.Design.service.impl;

import com.Design.Design.pojo.Request;
import com.Design.Design.service.PayableAmount;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayableAmountImpl implements PayableAmount {

    @Override
    public Map<String, Long> getPayableAmount(Request request) {
        Map<String, Long> map = new HashMap();
        String payable = request.getPercentageBasedEligible();
        Long otherAmount = request.getOtherItemTotal();
        if(payable.equals("storeEmployee")){
            otherAmount -= (otherAmount * 30)/100;
        }else if(payable.equals("affiliateStore")){
            otherAmount -= (otherAmount * 10)/100;
        }else if(payable.equals("customer")){
            otherAmount -= (otherAmount * 5)/100;
        }
        Long sum = otherAmount + request.getGroceryTotal();
        sum -= (sum/100) * 5;
        map.put("Table PayableAmount", sum);
        return map;
    }
}
