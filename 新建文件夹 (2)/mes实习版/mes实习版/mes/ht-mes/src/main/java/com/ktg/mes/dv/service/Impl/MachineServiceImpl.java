package com.ktg.mes.dv.service.Impl;

import com.ktg.mes.dv.domain.Machine;
import com.ktg.mes.dv.mapper.MachineMapper;
import com.ktg.mes.dv.service.MachineService;
import com.ktg.mes.wm.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;

public class MachineServiceImpl implements MachineService {

    @Autowired
    private MachineMapper machineMapper;

    @Override
    public int insertMachine(Machine machine) {
        return machineMapper.insertMachine(machine);
    }

    @Override
    public Machine selectMachineBymachinerytypecode(String machinery_type_code) {
        return machineMapper.selectMachineBymachinerytypecode(machinery_type_code);
    }

    @Override
    public int updateMachine(Machine machine) {
        return machineMapper.updateMachine(machine);
    }

    @Override
    public int deleteMachineBymachinerytypecode(String machinery_type_code) {
        return machineMapper.deleteMachineBymachinerytypecode(machinery_type_code);
    }
}
