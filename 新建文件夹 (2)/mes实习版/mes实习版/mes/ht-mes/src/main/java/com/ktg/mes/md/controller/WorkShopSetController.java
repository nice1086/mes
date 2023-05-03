package com.ktg.mes.md.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.WorkShopSet;
import com.ktg.mes.md.service.WorkShopSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/workShopSet")
public class WorkShopSetController {

    @Autowired
    private WorkShopSetService workShopSetService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workShopSet:add')")
    @Log(title = "车间编码", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody WorkShopSet workShopSet) {
        return workShopSetService.insertWorkShopSet(workShopSet);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workShopSet:list')")
    @GetMapping("/list")
    public WorkShopSet select(@Validated @RequestParam String workshop_code)
    {
        return workShopSetService.selectWorkShopSetByworkshopcode(workshop_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workShopSet:edit')")
    @Log(title = "车间编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody WorkShopSet workShopSet)
    {
        return workShopSetService.updateWorkShopSet(workShopSet);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:workShopSet:remove')")
    @Log(title = "车间编码", businessType = BusinessType.DELETE)
    @DeleteMapping("/{workshop_code}")
    public int remove(@PathVariable String workshop_code)
    {
        return workShopSetService.deleteWorkShopSetByworkshopcode(workshop_code);
    }
}
