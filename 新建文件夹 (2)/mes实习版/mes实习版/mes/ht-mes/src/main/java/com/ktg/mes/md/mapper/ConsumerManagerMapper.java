package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.ConsumerManager;

public interface ConsumerManagerMapper {
    int insertConsumerManager(ConsumerManager consumerManager);

    ConsumerManager selectConsumerByclientcode(String client_code);

    int deleteMdProByclientcode(String client_code);

    int updateConsumerManager(ConsumerManager consumerManager);
}
