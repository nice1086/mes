package com.ktg.mes.dv.service.Impl;

import com.ktg.mes.dv.domain.Repair;
import com.ktg.mes.dv.mapper.RepairMapper;
import com.ktg.mes.dv.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;

public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairMapper repairMapper;

    @Override
    public int insertRepair(Repair repair) {
        return repairMapper.insertRepair(repair);
    }

    @Override
    public Repair selectRepairByrepaircode(String repair_code) {
        return repairMapper.selectRepairByrepaircode(repair_code);
    }

    @Override
    public int updateRepair(Repair repair) {
        return repairMapper.updateRepair(repair);
    }

    @Override
    public int deleteRepairByrepaircode(String repair_code) {
        return repairMapper.deleteRepairByrepaircode(repair_code);
    }
}
