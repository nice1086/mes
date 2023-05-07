package com.ktg.mes.dv.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.dv.domain.Machine;
import com.ktg.mes.dv.domain.Subject;
import com.ktg.mes.dv.service.SubjectService;
import com.ktg.mes.wm.domain.Issue;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:add')")
    @Log(title = "项目编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Subject subject) {

        return subjectService.insertSubject(subject);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:list')")
    @GetMapping("/list")
    public Subject select(@Validated @RequestParam String subject_code)
    {
        return subjectService.selectSubjectBysubjectcode(subject_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:edit')")
    @Log(title = "项目编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Subject subject)
    {
        return subjectService.updateSubject(subject);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:dv:subject:remove')")
    @Log(title = "项目编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{subject_code}")
    public int remove(@PathVariable String subject_code)
    {
        return subjectService.deleteSubjectBysubjectcode(subject_code);
    }
}
