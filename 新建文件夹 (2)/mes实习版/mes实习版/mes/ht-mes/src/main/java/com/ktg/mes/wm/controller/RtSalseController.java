package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.RtIssue;
import com.ktg.mes.wm.domain.RtSalse;
import com.ktg.mes.wm.service.RtSalseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/rtSalse")
public class RtSalseController {

    @Autowired
    private RtSalseService rtSalseService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtSalse:add')")
    @Log(title = "退货单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody RtSalse rtSalse) {

        return rtSalseService.insertRtSalse(rtSalse);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtSalse:list')")
    @GetMapping("/list")
    public RtSalse select(@Validated @RequestParam String rt_code)
    {
        return rtSalseService.selectRtSalseByrtcode(rt_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:edit')")
    @Log(title = "退货单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody RtSalse rtSalse)
    {

        return rtSalseService.updateRtSalse(rtSalse);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:remove')")
    @Log(title = "退货单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{rt_code}")
    public int remove(@PathVariable String rt_code)
    {

        return rtSalseService.deleteRtSalseByrtcode(rt_code);
    }
}
