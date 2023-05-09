package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Iqc;
import com.ktg.mes.qc.domain.Oqc;
import com.ktg.mes.qc.service.OqcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/oqc")
public class OqcController {

    @Autowired
    private OqcService oqcService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:oqc:add')")
    @Log(title = "检验单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Oqc oqc)
    {
        return oqcService.insertOqc(oqc);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:oqc:list')")
    @GetMapping("/list")
    public Oqc select(@Validated @RequestParam String oqc_code)
    {
        return oqcService.selectOqcByoqccode(oqc_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:oqc:edit')")
    @Log(title = "检验单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Oqc oqc)
    {
        return oqcService.updateOqc(oqc);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:oqc:remove')")
    @Log(title = "检验单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{oqc_code}")
    public int remove(@PathVariable String oqc_code)
    {
        return oqcService.deleteOqcByoqccode(oqc_code);
    }
}
