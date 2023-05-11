package com.ktg.mes.cal.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.cal.domain.Holiday;
import com.ktg.mes.cal.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/cal/holiday")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:holiday:add')")
    @Log(title = "计划编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Holiday holiday)
    {
        return holidayService.insertHoliday(holiday);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:holiday:list')")
    @GetMapping("/list")
    public Holiday select(@Validated @RequestParam String holiday_id)
    {
        return holidayService.selectHolidayByholidayid(holiday_id);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:holiday:edit')")
    @Log(title = "计划编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Holiday holiday)
    {
        return holidayService.updateHoliday(holiday);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:cal:holiday:remove')")
    @Log(title = "计划编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{holiday_id}")
    public int remove(@PathVariable String holiday_id)
    {
        return holidayService.deleteHolidayByholidayid(holiday_id);
    }
}
