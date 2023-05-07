package com.ktg.mes.dv.service;

import com.ktg.mes.dv.domain.Repair;

public interface RepairService {
    int insertRepair(Repair repair);

    Repair selectRepairByrepaircode(String repair_code);

    int updateRepair(Repair repair);

    int deleteRepairByrepaircode(String repair_code);
}
