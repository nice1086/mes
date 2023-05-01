package com.ktg.mes.md.controller;


import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.ConsumerManager;
import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.domain.MdProManager;
import com.ktg.mes.md.service.ConsumerManagerService;
import com.ktg.mes.md.service.MdProManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/consumerManager")
public class ConsumerManagerController {

    @Autowired
    private ConsumerManagerService consumerManagerService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:consumerManager:add')")
    @Log(title = "客户编码", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody ConsumerManager consumerManager) {
        return consumerManagerService.insertConsumerManager(consumerManager);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:consumerManager:list')")
    @GetMapping("/list")
    public ConsumerManager select(@Validated @RequestParam String client_code)
    {
        return consumerManagerService.selectConsumerByclientcode(client_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:consumerManager:edit')")
    @Log(title = "客户编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody ConsumerManager consumerManager)
    {
        return consumerManagerService.updateConsumerManager(consumerManager);
}

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:consumerManager:remove')")
    @Log(title = "客户编码", businessType = BusinessType.DELETE)
    @DeleteMapping("/{client_code}")
    public int remove(@PathVariable String client_code)
    {
        return consumerManagerService.deleteConsumerByclientcode(client_code);
    }
}
