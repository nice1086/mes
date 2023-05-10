package com.ktg.mes.cal.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.cal.domain.Plan;
import com.ktg.mes.cal.domain.Team;
import com.ktg.mes.cal.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/cal/plan")
public class PlanController {

    @Autowired
    private PlanService planService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:plan:add')")
    @Log(title = "计划编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Plan plan) {

        return planService.insertPlan(plan);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:plan:list')")
    @GetMapping("/list")
    public Plan select(@Validated @RequestParam String plan_code)
    {
        return planService.selectPlanByplancode(plan_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:plan:edit')")
    @Log(title = "计划编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Plan plan)
    {
        return planService.updatePlan(plan);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:plan:remove')")
    @Log(title = "计划编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{plan_code}")
    public int remove(@PathVariable String plan_code)
    {
        return planService.deletePlanByplancode(plan_code);
    }
}
