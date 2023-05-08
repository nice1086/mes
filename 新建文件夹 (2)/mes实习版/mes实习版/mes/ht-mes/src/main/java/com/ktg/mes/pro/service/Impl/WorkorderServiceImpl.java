package com.ktg.mes.pro.service.Impl;

import com.ktg.mes.pro.domain.Workorder;
import com.ktg.mes.pro.mapper.WorkorderMapper;
import com.ktg.mes.pro.service.WorkorderService;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkorderServiceImpl implements WorkorderService {

    @Autowired
    private WorkorderMapper workorderMapper;

    @Override
    public int insertWorkorder(Workorder workorder) {
        return workorderMapper.insertWorkorder(workorder);
    }

    @Override
    public Workorder selectWorkorderByworkordercode(String workorder_code) {
        return workorderMapper.selectWorkorderByworkordercode(workorder_code);
    }

    @Override
    public int updateWorkorder(Workorder workorder) {
        return workorderMapper.updateWorkorder(workorder);
    }

    @Override
    public int deleteWorkorderByworkordercode(String workorder_code) {
        return workorderMapper.deleteWorkorderByworkordercode(workorder_code);
    }
}
