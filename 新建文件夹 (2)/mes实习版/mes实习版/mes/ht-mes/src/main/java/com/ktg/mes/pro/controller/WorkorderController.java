package com.ktg.mes.pro.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.pro.domain.Workorder;
import com.ktg.mes.pro.service.WorkorderService;
import com.ktg.mes.wm.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/workorder")
public class WorkorderController {

    @Autowired
    private WorkorderService workorderService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:workorder:add')")
    @Log(title = "工单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Workorder workorder)
    {
        return workorderService.insertWorkorder(workorder);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:workorder:list')")
    @GetMapping("/list")
    public Workorder select(@Validated @RequestParam String workorder_code)
    {
        return workorderService.selectWorkorderByworkordercode(workorder_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:workorder:edit')")
    @Log(title = "工单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Workorder workorder)
    {
        return workorderService.updateWorkorder(workorder);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:workorder:remove')")
    @Log(title = "工单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{workorder_code}")
    public int remove(@PathVariable String workorder_code)
    {
        return workorderService.deleteWorkorderByworkordercode(workorder_code);
    }
}
