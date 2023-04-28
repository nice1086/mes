package com.ktg.mes.md.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.domain.MdProManager;
import com.ktg.mes.md.service.MdProManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/proManager")
public class MdProManagerController {

    @Autowired
    private MdProManagerService mdProManagerService;

    /**
     * 新增产品
     */
    @PreAuthorize("@ss.hasPermi('mes:md:promanager:add')")
    @Log(title = "物料编码", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody MdProManager mdProManager) {
        return mdProManagerService.insertMdProManager(mdProManager);
    }
    /**
     * 查看产品
     */
    @PreAuthorize("@ss.hasPermi('mes:md:promanager:list')")
    @GetMapping("/list")
    public MdPro select(@Validated @RequestParam String item_code)
    {
        return mdProManagerService.selectMdProByitemcode(item_code);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:promanager:edit')")
    @Log(title = "物料编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody MdProManager mdProManager)
    {
        return mdProManagerService.updateMdProManager(mdProManager);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:promanager:remove')")
    @Log(title = "物料编码", businessType = BusinessType.DELETE)
    @DeleteMapping("/{item_code}")
    public int remove(@PathVariable String item_code)
    {
        return mdProManagerService.deleteMdProByitemcode(item_code);
    }
}
