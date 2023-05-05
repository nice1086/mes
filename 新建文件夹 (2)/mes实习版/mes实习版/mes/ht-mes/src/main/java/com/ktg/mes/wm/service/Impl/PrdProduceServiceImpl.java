package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.Prdproduce;
import com.ktg.mes.wm.mapper.PrdProduceMapper;
import com.ktg.mes.wm.service.PrdProduceService;
import org.springframework.beans.factory.annotation.Autowired;

public class PrdProduceServiceImpl implements PrdProduceService {

    @Autowired
    private PrdProduceMapper prdProduceMapper;

    @Override
    public int insertPrdPoduce(Prdproduce prdproduce) {
        return prdProduceMapper.insertPrdPoduce(prdproduce);
    }

    @Override
    public Prdproduce selectPrdProduceByworkordercode(String workorder_code) {
        return prdProduceMapper.selectPrdProduceByworkordercode(workorder_code);
    }

    @Override
    public int updatePrdProduce(Prdproduce prdproduce) {
        return prdProduceMapper.updatePrdProduce(prdproduce);
    }

    @Override
    public int deletePrdProduceByworkordercode(String workorder_code) {
        return prdProduceMapper.deletePrdProduceByworkordercode(workorder_code);
    }
}
