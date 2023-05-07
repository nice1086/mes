package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.WorkStation;
import com.ktg.mes.wm.domain.WareHouse;
import com.ktg.mes.wm.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/wareHouse")
public class WareHousecontroller {

    @Autowired
    private WareHouseService wareHouseService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:wareHouse:add')")
    @Log(title = "仓库编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody WareHouse wareHouse) {
        return wareHouseService.insertWareHouse(wareHouse);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:wareHouse:list')")
    @GetMapping("/list")
    public WareHouse select(@Validated @RequestParam String workstation_code)
    {
        return wareHouseService.selectWareHouseBywarehousecode(workstation_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:wareHouse:edit')")
    @Log(title = "仓库编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody WareHouse wareHouse)
    {
        return wareHouseService.updateWareHouse(wareHouse);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:wareHouse:remove')")
    @Log(title = "仓库编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{warehouse_code}")
    public int remove(@PathVariable String warehouse_code)
    {
        return wareHouseService.deleteWareHouseBywarehousecode(warehouse_code);
    }
}
