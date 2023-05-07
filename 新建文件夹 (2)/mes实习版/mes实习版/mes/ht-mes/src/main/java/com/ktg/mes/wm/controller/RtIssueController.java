package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Issue;
import com.ktg.mes.wm.domain.RtIssue;
import com.ktg.mes.wm.service.RtIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/rtIssue")
public class RtIssueController {

    @Autowired
    private RtIssueService rtIssueService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:add')")
    @Log(title = "退料单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody RtIssue rtIssue) {

        return rtIssueService.insertRtIssue(rtIssue);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:list')")
    @GetMapping("/list")
    public RtIssue select(@Validated @RequestParam String rt_code)
    {
        return rtIssueService.selectRtIssueByrtcode(rt_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:edit')")
    @Log(title = "退料单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody RtIssue rtIssue)
    {

        return rtIssueService.updateRtIssue(rtIssue);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:rtIssue:remove')")
    @Log(title = "退料单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{rt_code}")
    public int remove(@PathVariable String rt_code)
    {
        return rtIssueService.deleteRtIssueByrtcode(rt_code);
    }
}
