package com.ktg.mes.cal.mapper;

import com.ktg.mes.cal.domain.Team;

public interface TeamMapper {
    int insertTeam(Team team);

    Team selectTeamByteamcode(String team_code);

    int updateTeam(Team team);

    int deleteTeamByteamcode(String team_code);
}
