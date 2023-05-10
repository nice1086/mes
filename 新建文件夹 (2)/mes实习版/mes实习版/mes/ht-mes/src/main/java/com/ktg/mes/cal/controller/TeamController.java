package com.ktg.mes.cal.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.cal.domain.Team;
import com.ktg.mes.cal.service.TeamService;
import com.ktg.mes.qc.domain.Defect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/cal/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:team:add')")
    @Log(title = "班组编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Team team) {

        return teamService.insertTeam(team);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:team:list')")
    @GetMapping("/list")
    public Team select(@Validated @RequestParam String team_code)
    {
        return teamService.selectTeamByteamcode(team_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:team:edit')")
    @Log(title = "班组编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Team team)
    {
        return teamService.updateTeam(team);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:team:remove')")
    @Log(title = "班组编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{team_code}")
    public int remove(@PathVariable String team_code)
    {
        return teamService.deleteTeamByteamcode(team_code);
    }
}
