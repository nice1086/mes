package com.ktg.mes.md.controller;


import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.ConsumerManager;
import com.ktg.mes.md.domain.ProviderManager;
import com.ktg.mes.md.service.ProviderManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/providerManager")
public class ProviderManagerController {

    @Autowired
    private ProviderManagerService providerManagerService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:providerManager:add')")
    @Log(title = "供应商编码", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody ProviderManager providerManager) {
        return providerManagerService.insertProviderManager(providerManager);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:providerManager:list')")
    @GetMapping("/list")
    public ProviderManager select(@Validated @RequestParam String vendor_code)
    {
        return providerManagerService.selectProviderByvendorcode(vendor_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:providerManager:edit')")
    @Log(title = "客户编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody ProviderManager providerManager)
    {
        return providerManagerService.updateProviderManager(providerManager);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:providerManager:remove')")
    @Log(title = "供应商编码", businessType = BusinessType.DELETE)
    @DeleteMapping("/{vendor_code}")
    public int remove(@PathVariable String vendor_code)
    {
        return providerManagerService.deleteProviderByvendorcode(vendor_code);
    }
}
