package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Ipqc;
import com.ktg.mes.qc.domain.Iqc;
import com.ktg.mes.qc.service.IpqcService;
import com.ktg.mes.qc.service.IqcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/ipqc")
public class IpqcController {

    @Autowired
    private IpqcService ipqcService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:ipqc:add')")
    @Log(title = "检验单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Ipqc ipqc)
    {
        return ipqcService.insertIpqc(ipqc);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:ipqc:list')")
    @GetMapping("/list")
    public Ipqc select(@Validated @RequestParam String ipqc_code)
    {
        return ipqcService.selectIqcByiqccode(ipqc_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:ipqc:edit')")
    @Log(title = "检验单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Ipqc ipqc)
    {
        return ipqcService.updateIpqc(ipqc);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:ipqc:remove')")
    @Log(title = "检验单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ipqc_code}")
    public int remove(@PathVariable String ipqc_code)
    {
        return ipqcService.deleteIpqcByipqccode(ipqc_code);
    }

}
