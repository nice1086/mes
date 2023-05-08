package com.ktg.mes.pro.service;

import com.ktg.mes.pro.domain.Quantity;

public interface QuantityService {
    int insertQuantity(Quantity quantity);

    Quantity selectQuantityBytaskcode(String task_code);

    int updateQuantity(Quantity quantity);

    int deleteQuantityBytaskcode(String task_code);
}
