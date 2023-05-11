package com.ktg.mes.cal.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.cal.domain.Team;
import com.ktg.mes.cal.domain.TeamShift;
import com.ktg.mes.cal.service.TeamShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/cal/teamshift")
public class TeamShiftController {

    @Autowired
    private TeamShiftService teamShiftService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:teamshift:add')")
    @Log(title = "流水号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody TeamShift teamShift)
    {
        return teamShiftService.insertTeamShift(teamShift);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:teamshift:list')")
    @GetMapping("/list")
    public TeamShift select(@Validated @RequestParam String record_id)
    {
        return teamShiftService.selectTeamShiftByrecordid(record_id);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:teamshift:edit')")
    @Log(title = "流水号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody TeamShift teamShift)
    {
        return teamShiftService.updateTeamShift(teamShift);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:teamshift:remove')")
    @Log(title = "流水号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{record_id}")
    public int remove(@PathVariable String record_id)
    {
        return teamShiftService.deleteTeamShiftByrecordid(record_id);
    }

}
