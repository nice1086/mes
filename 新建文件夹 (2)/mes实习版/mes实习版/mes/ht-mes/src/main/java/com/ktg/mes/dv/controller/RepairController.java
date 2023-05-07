package com.ktg.mes.dv.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.dv.domain.Plan;
import com.ktg.mes.dv.domain.Repair;
import com.ktg.mes.dv.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/repair")
public class RepairController {

    @Autowired
    private RepairService repairService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:repair:add')")
    @Log(title = "计划编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Repair repair)
    {
        return repairService.insertRepair(repair);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:plan:list')")
    @GetMapping("/list")
    public Repair select(@Validated @RequestParam String repair_code)
    {
        return repairService.selectRepairByrepaircode(repair_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:edit')")
    @Log(title = "计划编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Repair repair)
    {
        return repairService.updateRepair(repair);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:remove')")
    @Log(title = "计划编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{repair_code}")
    public int remove(@PathVariable String repair_code)
    {
        return repairService.deleteRepairByrepaircode(repair_code);
    }
}
