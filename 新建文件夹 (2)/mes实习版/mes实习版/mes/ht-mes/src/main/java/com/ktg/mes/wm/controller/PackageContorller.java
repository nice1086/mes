package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Package;
import com.ktg.mes.wm.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/package")
public class PackageContorller {

    @Autowired
    private PackageService packageService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:package:add')")
    @Log(title = "装箱单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Package pacKage) {

        return packageService.insertPackage(pacKage);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:package:list')")
    @GetMapping("/list")
    public Package select(@Validated @RequestParam String package_code)
    {
        return packageService.selectPackageBypackagecode(package_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:package:edit')")
    @Log(title = "装箱单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Package pacKage)
    {

        return packageService.updatePackage(pacKage);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:package:remove')")
    @Log(title = "装箱单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{package_code}")
    public int remove(@PathVariable String package_code)
    {
        return packageService.deletePackageBypackagecode(package_code);
    }
}
