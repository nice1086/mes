package com.ktg.mes.dv.mapper;

import com.ktg.mes.dv.domain.Machine;
import com.ktg.mes.wm.domain.Issue;

public interface MachineMapper {
    int insertMachine(Machine machine);

    Machine selectMachineBymachinerytypecode(String machinery_type_code);

    int updateMachine(Machine machine);

    int deleteMachineBymachinerytypecode(String machinery_type_code);
}
