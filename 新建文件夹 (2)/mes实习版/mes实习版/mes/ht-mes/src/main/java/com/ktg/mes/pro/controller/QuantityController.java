package com.ktg.mes.pro.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.pro.domain.Quantity;
import com.ktg.mes.pro.service.QuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/quantity")
public class QuantityController {

    @Autowired
    private QuantityService quantityService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:quantity:add')")
    @Log(title = "任务编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Quantity quantity)
    {
        return quantityService.insertQuantity(quantity);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:quantity:list')")
    @GetMapping("/list")
    public Quantity select(@Validated @RequestParam String task_code)
    {
        return quantityService.selectQuantityBytaskcode(task_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:quantity:edit')")
    @Log(title = "任务编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Quantity quantity)
    {
        return quantityService.updateQuantity(quantity);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:quantity:remove')")
    @Log(title = "任务编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{task_code}")
    public int remove(@PathVariable String task_code)
    {
        return quantityService.deleteQuantityBytaskcode(task_code);
    }
}
