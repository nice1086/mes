package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.WorkStation;
import com.ktg.mes.md.mapper.WorkStationMapper;
import com.ktg.mes.md.service.WorkStationService;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkStationServiceImpl implements WorkStationService {

    @Autowired
    private WorkStationMapper workStationMapper;

    @Override
    public int insertWorkStation(WorkStation workStation) {
        return workStationMapper.insertWorkStation(workStation);
    }

    @Override
    public WorkStation selectWorkStationByworkstationcode(String workstation_code) {
        return workStationMapper.selectWorkStationByworkstationcode(workstation_code);
    }

    @Override
    public int updateWorkStation(WorkStation workStation) {
        return workStationMapper.updateWorkStation(workStation);
    }

    @Override
    public int deleteWorkStationByworkstationcode(String workstation_code) {
        return workStationMapper.deleteWorkStationByworkstationcode(workstation_code);
    }
}
