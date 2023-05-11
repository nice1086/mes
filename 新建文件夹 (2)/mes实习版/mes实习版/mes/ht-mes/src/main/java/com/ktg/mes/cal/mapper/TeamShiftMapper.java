package com.ktg.mes.cal.mapper;

import com.ktg.mes.cal.domain.TeamShift;

public interface TeamShiftMapper {
    int insertTeamShift(TeamShift teamShift);

    TeamShift selectTeamShiftByrecordid(String record_id);

    int updateTeamShift(TeamShift teamShift);

    int deleteTeamShiftByrecordid(String record_id);
}
