package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.ConsumerManager;
import com.ktg.mes.md.mapper.ConsumerManagerMapper;
import com.ktg.mes.md.service.ConsumerManagerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerManagerServiceImpl implements ConsumerManagerService {
    @Autowired
    private ConsumerManagerMapper consumerManagerMapper;

    @Override
    public int insertConsumerManager(ConsumerManager consumerManager) {
        return consumerManagerMapper.insertConsumerManager(consumerManager);
    }

    @Override
    public ConsumerManager selectConsumerByclientcode(String client_code) {
        return consumerManagerMapper.selectConsumerByclientcode(client_code);
    }

    @Override
    public int deleteConsumerByclientcode(String client_code) {
        return consumerManagerMapper.deleteConsumerByclientcode(client_code);
    }

    @Override
    public int updateConsumerManager(ConsumerManager consumerManager) {
        return consumerManagerMapper.updateConsumerManager(consumerManager);
    }
}
