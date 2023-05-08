package com.ktg.mes.pro.service.Impl;

import com.ktg.mes.pro.domain.Quantity;
import com.ktg.mes.pro.mapper.QuantityMapper;
import com.ktg.mes.pro.service.QuantityService;
import org.springframework.beans.factory.annotation.Autowired;

public class QuantityServiceImpl implements QuantityService {

    @Autowired
    private QuantityMapper quantityMapper;

    @Override
    public int insertQuantity(Quantity quantity) {
        return quantityMapper.insertQuantity(quantity);
    }

    @Override
    public Quantity selectQuantityBytaskcode(String task_code) {
        return quantityMapper.selectQuantityBytaskcode(task_code);
    }

    @Override
    public int updateQuantity(Quantity quantity) {
        return quantityMapper.updateQuantity(quantity);
    }

    @Override
    public int deleteQuantityBytaskcode(String task_code) {
        return quantityMapper.deleteQuantityBytaskcode(task_code);
    }
}
