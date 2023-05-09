package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Defect;
import com.ktg.mes.qc.domain.Iqc;
import com.ktg.mes.qc.service.IqcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/iqc")
public class IqcContorller {

    @Autowired
    private IqcService iqcService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:iqc:add')")
    @Log(title = "检验单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Iqc iqc)
    {
        return iqcService.insertIqc(iqc);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:iqc:list')")
    @GetMapping("/list")
    public Iqc select(@Validated @RequestParam String iqc_code)
    {
        return iqcService.selectIqcByiqccode(iqc_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:iqc:edit')")
    @Log(title = "检验单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Iqc iqc)
    {
        return iqcService.updateIqc(iqc);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:iqc:remove')")
    @Log(title = "检验单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{iqc_code}")
    public int remove(@PathVariable String iqc_code)
    {
        return iqcService.deleteIqcByiqccode(iqc_code);
    }
}
