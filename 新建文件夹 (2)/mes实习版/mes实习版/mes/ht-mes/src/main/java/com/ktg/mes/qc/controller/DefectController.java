package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Defect;
import com.ktg.mes.qc.service.DefectService;
import com.ktg.mes.wm.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/defect")
public class DefectController {

    @Autowired
    private DefectService defectService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:defect:add')")
    @Log(title = "缺陷编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Defect defect) {

        return defectService.insertDefect(defect);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:defect:list')")
    @GetMapping("/list")
    public Defect select(@Validated @RequestParam String defect_code)
    {
        return defectService.selectDefectBydefectcode(defect_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:defect:edit')")
    @Log(title = "缺陷编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Defect defect)
    {
        return defectService.updateDefect(defect);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:defect:remove')")
    @Log(title = "缺陷编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{defect_code}")
    public int remove(@PathVariable String defect_code)
    {
        return defectService.deleteDefectBydefectcode(defect_code);
    }
}
