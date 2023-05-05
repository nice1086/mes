package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.Prdproduce;

public interface PrdProduceMapper {

    int insertPrdPoduce(Prdproduce prdproduce);

    Prdproduce selectPrdProduceByworkordercode(String workorder_code);

    int updatePrdProduce(Prdproduce prdproduce);

    int deletePrdProduceByworkordercode(String workorder_code);
}
