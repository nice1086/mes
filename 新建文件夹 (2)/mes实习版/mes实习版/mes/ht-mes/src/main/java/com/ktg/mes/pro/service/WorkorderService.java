package com.ktg.mes.pro.service;

import com.ktg.mes.pro.domain.Workorder;

public interface WorkorderService {
    int insertWorkorder(Workorder workorder);

    Workorder selectWorkorderByworkordercode(String workorder_code);

    int updateWorkorder(Workorder workorder);

    int deleteWorkorderByworkordercode(String workorder_code);
}
