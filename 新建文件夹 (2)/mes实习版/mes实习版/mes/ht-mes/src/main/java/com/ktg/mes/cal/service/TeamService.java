package com.ktg.mes.cal.service;

import com.ktg.mes.cal.domain.Team;

public interface TeamService {
    int insertTeam(Team team);

    Team selectTeamByteamcode(String team_code);

    int updateTeam(Team team);

    int deleteTeamByteamcode(String team_code);
}
