package com.ktg.mes.wm.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.wm.domain.Prdproduce;
import com.ktg.mes.wm.domain.RtIssue;
import com.ktg.mes.wm.service.PrdProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/wm/prdProduce")
public class PrdProduceController {

    @Autowired
    private PrdProduceService prdProduceService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:md:prdProduce:add')")
    @Log(title = "入库单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Prdproduce prdproduce) {

        return prdProduceService.insertPrdPoduce(prdproduce);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:md:prdProduce:list')")
    @GetMapping("/list")
    public Prdproduce select(@Validated @RequestParam String workorder_code)
    {
        return prdProduceService.selectPrdProduceByworkordercode(workorder_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:prdProduce:edit')")
    @Log(title = "仓库编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Prdproduce prdproduce)
    {

        return prdProduceService.updatePrdProduce(prdproduce);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:prdProduce:remove')")
    @Log(title = "入库单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{workorder_code}")
    public int remove(@PathVariable String workorder_code)
    {
        return prdProduceService.deletePrdProduceByworkordercode(workorder_code);
    }
}
