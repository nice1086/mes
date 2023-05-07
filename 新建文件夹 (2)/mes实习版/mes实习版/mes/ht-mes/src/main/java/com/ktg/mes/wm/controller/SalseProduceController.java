package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Prdproduce;
import com.ktg.mes.wm.domain.SalseProduce;
import com.ktg.mes.wm.service.SalseProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/salseProduce")
public class SalseProduceController {

    @Autowired
    private SalseProduceService salseProduceService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:salseProduce:add')")
    @Log(title = "出库单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody SalseProduce salseProduce) {

        return salseProduceService.insertSalseProduce(salseProduce);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:salseProduce:list')")
    @GetMapping("/list")
    public SalseProduce select(@Validated @RequestParam String salse_id)
    {
        return salseProduceService.selectSalseProduceBysalseid(salse_id);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:salseProduce:edit')")
    @Log(title = "出库单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody SalseProduce salseProduce)
    {

        return salseProduceService.updateSalseProduce(salseProduce);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:wm:salseProduce:remove')")
    @Log(title = "出库单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{salse_id}")
    public int remove(@PathVariable String salse_id)
    {
        return salseProduceService.deleteSalseProduceBysalseid(salse_id);
    }
}
