package com.ktg.mes.qc.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.qc.domain.Defect;
import com.ktg.mes.qc.domain.Index;
import com.ktg.mes.qc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/qc/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:index:add')")
    @Log(title = "质检编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Index index)
    {
        return indexService.insertIndex(index);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:index:list')")
    @GetMapping("/list")
    public Index select(@Validated @RequestParam String index_code)
    {
        return indexService.selectIndexByindexcode(index_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:index:edit')")
    @Log(title = "质检编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Index index)
    {
        return indexService.updateIndex(index);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:qc:index:remove')")
    @Log(title = "质检编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{index_code}")
    public int remove(@PathVariable String index_code)
    {
        return indexService.deleteIndexByindexcode(index_code);
    }
}
