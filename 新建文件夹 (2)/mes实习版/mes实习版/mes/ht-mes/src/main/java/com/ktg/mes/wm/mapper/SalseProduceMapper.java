package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.SalseProduce;

public interface SalseProduceMapper {
    int insertSalseProduce(SalseProduce salseProduce);

    SalseProduce selectSalseProduceBysalseid(String salse_id);

    int updateSalseProduce(SalseProduce salseProduce);

    int deleteSalseProduceBysalseid(String salse_id);
}
