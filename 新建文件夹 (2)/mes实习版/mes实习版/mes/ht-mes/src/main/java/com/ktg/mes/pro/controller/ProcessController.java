package com.ktg.mes.pro.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.pro.domain.Workorder;
import com.ktg.mes.pro.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:process:add')")
    @Log(title = "工序编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Process process)
    {
        return processService.insertProcess(process);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:process:list')")
    @GetMapping("/list")
    public Process select(@Validated @RequestParam String process_code)
    {
        return processService.selectProcessByprocesscode(process_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:process:edit')")
    @Log(title = "工序编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Process process)
    {
        return processService.updateProcess(process);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:process:remove')")
    @Log(title = "工序编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{process_code}")
    public int remove(@PathVariable String process_code)
    {
        return processService.deleteProcessByprocesscode(process_code);
    }
}
