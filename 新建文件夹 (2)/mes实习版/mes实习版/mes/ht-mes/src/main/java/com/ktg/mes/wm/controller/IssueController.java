package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Issue;
import com.ktg.mes.wm.domain.RtVendor;
import com.ktg.mes.wm.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/issue")
public class IssueController {

    @Autowired
    private IssueService issueService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:issue:add')")
    @Log(title = "退货单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Issue issue) {

        return issueService.insertIssue(issue);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:issue:list')")
    @GetMapping("/list")
    public Issue select(@Validated @RequestParam String issue_code)
    {
        return issueService.selectIssueByissuecode(issue_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:issue:edit')")
    @Log(title = "仓库编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Issue issue)
    {

        return issueService.updateIssue(issue);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:issue:remove')")
    @Log(title = "退货单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{issue_code}")
    public int remove(@PathVariable String issue_code)
    {
        return issueService.deleteIssueByissuecode(issue_code);
    }
}
