package com.ktg.mes.cal.service.Impl;

import com.ktg.mes.cal.domain.TeamShift;
import com.ktg.mes.cal.mapper.TeamShiftMapper;
import com.ktg.mes.cal.service.TeamService;
import com.ktg.mes.cal.service.TeamShiftService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamShiftServiceImpl implements TeamShiftService {

    @Autowired
    private TeamShiftMapper teamShiftMapper;


    @Override
    public int insertTeamShift(TeamShift teamShift) {
        return teamShiftMapper.insertTeamShift(teamShift);
    }

    @Override
    public TeamShift selectTeamShiftByrecordid(String record_id) {
        return teamShiftMapper.selectTeamShiftByrecordid(record_id);
    }

    @Override
    public int updateTeamShift(TeamShift teamShift) {
        return teamShiftMapper.updateTeamShift(teamShift);
    }

    @Override
    public int deleteTeamShiftByrecordid(String record_id) {
        return teamShiftMapper.deleteTeamShiftByrecordid(record_id);
    }
}
