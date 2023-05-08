package com.ktg.mes.pro.mapper;

import com.ktg.mes.pro.domain.Quantity;

public interface QuantityMapper {
    int insertQuantity(Quantity quantity);

    Quantity selectQuantityBytaskcode(String task_code);

    int updateQuantity(Quantity quantity);

    int deleteQuantityBytaskcode(String task_code);
}
