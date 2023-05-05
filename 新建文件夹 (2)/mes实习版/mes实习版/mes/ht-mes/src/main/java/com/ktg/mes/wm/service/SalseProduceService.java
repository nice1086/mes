package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.SalseProduce;

public interface SalseProduceService {
    int insertSalseProduce(SalseProduce salseProduce);

    SalseProduce selectSalseProduceBysalseid(String salse_id);

    int updateSalseProduce(SalseProduce salseProduce);

    int deleteSalseProduceBysalseid(String salse_id);
}
