package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.WorkStation;

public interface WorkStationService {
    int insertWorkStation(WorkStation workStation);

    WorkStation selectWorkStationByworkstationcode(String workstation_code);

    int updateWorkStation(WorkStation workStation);

    int deleteWorkStationByworkstationcode(String workstation_code);
}
