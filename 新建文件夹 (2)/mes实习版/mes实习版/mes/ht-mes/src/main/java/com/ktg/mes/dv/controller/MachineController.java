package com.ktg.mes.dv.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.dv.domain.Machine;
import com.ktg.mes.dv.service.MachineService;
import com.ktg.mes.wm.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/machine")
public class MachineController {

    @Autowired
    private MachineService machineService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:machine:add')")
    @Log(title = "设备编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Machine machine) {

        return machineService.insertMachine(machine);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:machine:list')")
    @GetMapping("/list")
    public Machine select(@Validated @RequestParam String machinery_type_code)
    {
        return machineService.selectMachineBymachinerytypecode(machinery_type_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:machine:edit')")
    @Log(title = "设备编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Machine machine)
    {
        return machineService.updateMachine(machine);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:machine:remove')")
    @Log(title = "设备编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{machinery_type_code}")
    public int remove(@PathVariable String machinery_type_code)
    {
        return machineService.deleteMachineBymachinerytypecode(machinery_type_code);
    }
}
