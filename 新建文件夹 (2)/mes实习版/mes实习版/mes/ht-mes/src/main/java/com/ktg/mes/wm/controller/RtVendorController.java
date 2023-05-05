package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.RtVendor;
import com.ktg.mes.wm.domain.WareHouse;
import com.ktg.mes.wm.service.RtVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/rtVendor")
public class RtVendorController {

    @Autowired
    private RtVendorService rtVendorService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:rtVendor:add')")
    @Log(title = "退货单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody RtVendor rtVendor) {

        return rtVendorService.insertRtVendor(rtVendor);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:rtVendor:list')")
    @GetMapping("/list")
    public RtVendor select(@Validated @RequestParam String rt_code)
    {
        return rtVendorService.selectRtVendorByrtcode(rt_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:rtVendor:edit')")
    @Log(title = "退货单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody RtVendor rtVendor)
    {

        return rtVendorService.updateRtVendor(rtVendor);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:rtVendor:remove')")
    @Log(title = "退货单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{rt_code}")
    public int remove(@PathVariable String rt_code)
    {
        return rtVendorService.deleteRtVendorByrtcode(rt_code);
    }
}
