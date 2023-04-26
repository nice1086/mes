package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;
import com.ktg.common.core.domain.entity.ItemType;

import javax.validation.constraints.NotBlank;

public class MdPro extends ItemType {
    /** 父分类 */
    @Excel(name = "父分类")
    @NotBlank(message = "父分类不允许为空")
    private String parent;

    /** 分类名称 */
    @Excel(name = "分类名称")
    @NotBlank(message = "分类名称不允许为空")
    private String name;

    /** 显示排序 */
    @Excel(name = "显示排序")
    @NotBlank(message = "显示排序不允许为空")
    private Integer sort;

    /** 物料产品 */
    @Excel(name = "物料产品")
    private String product;

    /** 启用状态 */
    @Excel(name = "启用状态")
    private String enableFlag;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String getEnableFlag() {
        return enableFlag;
    }

    @Override
    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    @Override
    public String toString() {
        return "MdPro{" +
                "parent='" + parent + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", product='" + product + '\'' +
                ", enableFlag='" + enableFlag + '\'' +
                '}';
    }
}
