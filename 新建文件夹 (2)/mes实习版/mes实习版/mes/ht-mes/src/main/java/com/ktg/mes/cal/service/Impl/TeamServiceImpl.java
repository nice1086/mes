package com.ktg.mes.cal.service.Impl;

import com.ktg.mes.cal.domain.Team;
import com.ktg.mes.cal.mapper.TeamMapper;
import com.ktg.mes.cal.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public int insertTeam(Team team) {
        return teamMapper.insertTeam(team);
    }

    @Override
    public Team selectTeamByteamcode(String team_code) {
        return teamMapper.selectTeamByteamcode(team_code);
    }

    @Override
    public int updateTeam(Team team) {
        return teamMapper.updateTeam(team);
    }

    @Override
    public int deleteTeamByteamcode(String team_code) {
        return teamMapper.deleteTeamByteamcode(team_code);
    }
}
