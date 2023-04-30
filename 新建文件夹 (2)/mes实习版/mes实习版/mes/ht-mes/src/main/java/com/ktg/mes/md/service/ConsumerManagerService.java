package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.ConsumerManager;

public interface ConsumerManagerService {
    int insertConsumerManager(ConsumerManager consumerManager);

    ConsumerManager selectConsumerByclientcode(String client_code);

    int deleteMdProByclientcode(String client_code);

    int updateConsumerManager(ConsumerManager consumerManager);
}
