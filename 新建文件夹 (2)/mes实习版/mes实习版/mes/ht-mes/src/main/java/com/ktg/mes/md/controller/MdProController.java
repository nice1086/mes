package com.ktg.mes.md.controller;


import com.ktg.common.annotation.Log;
import com.ktg.common.core.controller.BaseController;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.service.MdProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/md/pro")
public class MdProController extends BaseController {

    @Autowired
    private MdProService mdProService;
    /**
     * 新增产品
     */
    @PreAuthorize("@ss.hasPermi('mes:md:pro:add')")
    @Log(title = "父产品", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody MdPro mdPro)
    {
        return mdProService.insertMdPro(mdPro);
    }
    /**
     * 查看产品
     */
    @PreAuthorize("@ss.hasPermi('mes:md:pro:list')")
    @GetMapping("/list")
    public MdPro select(@Validated @RequestParam String parent)
    {
        return mdProService.selectMdProByParent(parent);
    }
    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:md:pro:edit')")
    @Log(title = "父产品", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody MdPro mdPro)
    {
        return mdProService.updateMdPro(mdPro);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:md:pro:remove')")
    @Log(title = "父产品", businessType = BusinessType.DELETE)
    @DeleteMapping("/{parent}")
    public int remove(@PathVariable String parent)
    {
        return mdProService.deleteMdProByParent(parent);
    }
}
