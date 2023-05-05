package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.Prdproduce;

public interface PrdProduceService {
    int insertPrdPoduce(Prdproduce prdproduce);

    Prdproduce selectPrdProduceByworkordercode(String workorder_code);

    int updatePrdProduce(Prdproduce prdproduce);

    int deletePrdProduceByworkordercode(String workorder_code);
}
