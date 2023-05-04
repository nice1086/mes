package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Location;
import com.ktg.mes.wm.domain.WareHouse;
import com.ktg.mes.wm.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/Location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:location:add')")
    @Log(title = "入库编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Location location) {

        return locationService.insertLocation(location);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:location:list')")
    @GetMapping("/list")
    public Location select(@Validated @RequestParam String recpt_code)
    {
        return locationService.selectLocationByrecptcode(recpt_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:location:edit')")
    @Log(title = "仓库编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Location location)
    {

        return locationService.updateLocation(location);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:location:remove')")
    @Log(title = "入库编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{recpt_code}")
    public int remove(@PathVariable String recpt_code)
    {
        return locationService.deleteLocationByrecptcode(recpt_code);
    }
}
