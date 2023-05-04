package com.ktg.mes.md.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.WorkStation;
import com.ktg.mes.md.service.WorkStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/workStation")
public class WorkStationController {

    @Autowired
    private WorkStationService workStationService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workStation:add')")
    @Log(title = "工作站编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody WorkStation workStation) {
        return workStationService.insertWorkStation(workStation);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workStation:list')")
    @GetMapping("/list")
    public WorkStation select(@Validated @RequestParam String workstation_code)
    {
        return workStationService.selectWorkStationByworkstationcode(workstation_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workStation:edit')")
    @Log(title = "工作站编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody WorkStation workStation)
    {
        return workStationService.updateWorkStation(workStation);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workStation:remove')")
    @Log(title = "工作站编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{workstation_code}")
    public int remove(@PathVariable String workstation_code)
    {
        return workStationService.deleteWorkStationByworkstationcode(workstation_code);
    }
}
