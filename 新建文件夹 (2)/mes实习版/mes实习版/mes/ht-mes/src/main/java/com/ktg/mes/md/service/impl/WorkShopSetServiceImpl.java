package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.WorkShopSet;
import com.ktg.mes.md.mapper.WorkShopSetMapper;
import com.ktg.mes.md.service.WorkShopSetService;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkShopSetServiceImpl implements WorkShopSetService {

    @Autowired
    private WorkShopSetMapper workShopSetMapper;

    @Override
    public int insertWorkShopSet(WorkShopSet workShopSet) {
        return workShopSetMapper.insertWorkShopSet(workShopSet);
    }

    @Override
    public WorkShopSet selectWorkShopSetByworkshopcode(String workshop_code) {
        return workShopSetMapper.selectWorkShopSetByworkshopcode(workshop_code);
    }

    @Override
    public int updateWorkShopSet(WorkShopSet workShopSet) {
        return workShopSetMapper.updateWorkShopSet(workShopSet);
    }

    @Override
    public int deleteWorkShopSetByworkshopcode(String workshop_code) {
        return workShopSetMapper.deleteWorkShopSetByworkshopcode(workshop_code);
    }
}
