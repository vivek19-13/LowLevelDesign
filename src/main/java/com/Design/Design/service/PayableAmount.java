package com.Design.Design.service;

import com.Design.Design.pojo.Request;

import java.util.Map;

public interface PayableAmount {
    Map<String, Long> getPayableAmount(Request request);
}
