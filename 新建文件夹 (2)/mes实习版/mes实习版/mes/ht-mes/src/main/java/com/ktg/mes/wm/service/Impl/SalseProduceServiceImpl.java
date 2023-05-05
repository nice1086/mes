package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.SalseProduce;
import com.ktg.mes.wm.mapper.SalseProduceMapper;
import com.ktg.mes.wm.service.SalseProduceService;
import org.springframework.beans.factory.annotation.Autowired;

public class SalseProduceServiceImpl implements SalseProduceService {

    @Autowired
    private SalseProduceMapper salseProduceMapper;

    @Override
    public int insertSalseProduce(SalseProduce salseProduce) {
        return salseProduceMapper.insertSalseProduce(salseProduce);
    }

    @Override
    public SalseProduce selectSalseProduceBysalseid(String salse_id) {
        return salseProduceMapper.selectSalseProduceBysalseid(salse_id);
    }

    @Override
    public int updateSalseProduce(SalseProduce salseProduce) {
        return salseProduceMapper.updateSalseProduce(salseProduce);
    }

    @Override
    public int deleteSalseProduceBysalseid(String salse_id) {
        return salseProduceMapper.deleteSalseProduceBysalseid(salse_id);
    }
}
