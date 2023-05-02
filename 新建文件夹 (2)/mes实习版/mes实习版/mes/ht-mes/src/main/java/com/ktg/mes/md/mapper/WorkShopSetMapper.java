package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.WorkShopSet;

public interface WorkShopSetMapper {
    int insertWorkShopSet(WorkShopSet workShopSet);

    WorkShopSet selectWorkShopSetByworkshopcode(String workshop_code);

    int updateWorkShopSet(WorkShopSet workShopSet);

    int deleteWorkShopSetByworkshopcode(String workshop_code);
}
