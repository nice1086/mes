package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Defect;
import com.ktg.mes.qc.domain.Template;
import com.ktg.mes.qc.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/template")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:template:add')")
    @Log(title = "模板编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Template template)
    {
        return templateService.insertTemplate(template);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:template:list')")
    @GetMapping("/list")
    public Template select(@Validated @RequestParam String template_code)
    {
        return templateService.selectTemplateBytemplatecode(template_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:template:edit')")
    @Log(title = "模板编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Template template)
    {
        return templateService.updateTemplate(template);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:template:remove')")
    @Log(title = "模板编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{template_code}")
    public int remove(@PathVariable String template_code)
    {
        return templateService.deleteTemplateBytemplatecode(template_code);
    }
}
