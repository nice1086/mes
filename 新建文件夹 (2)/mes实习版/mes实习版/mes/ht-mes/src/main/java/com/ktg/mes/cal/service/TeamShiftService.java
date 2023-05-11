package com.ktg.mes.cal.service;

import com.ktg.mes.cal.domain.TeamShift;

public interface TeamShiftService {
    int insertTeamShift(TeamShift teamShift);

    TeamShift selectTeamShiftByrecordid(String record_id);

    int updateTeamShift(TeamShift teamShift);

    int deleteTeamShiftByrecordid(String record_id);
}
