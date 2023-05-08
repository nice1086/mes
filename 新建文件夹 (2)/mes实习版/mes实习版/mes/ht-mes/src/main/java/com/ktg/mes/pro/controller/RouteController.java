package com.ktg.mes.pro.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.pro.domain.Route;
import com.ktg.mes.pro.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:route:add')")
    @Log(title = "工艺编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Route route)
    {
        return routeService.insertRoute(route);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:route:list')")
    @GetMapping("/list")
    public Route select(@Validated @RequestParam String route_code)
    {
        return routeService.selectRouteByroutecode(route_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:route:edit')")
    @Log(title = "工艺编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Route route)
    {
        return routeService.updateRoute(route);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:route:remove')")
    @Log(title = "工艺编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{route_code}")
    public int remove(@PathVariable String route_code)
    {
        return routeService.deleteRouteByroutecode(route_code);
    }
}
