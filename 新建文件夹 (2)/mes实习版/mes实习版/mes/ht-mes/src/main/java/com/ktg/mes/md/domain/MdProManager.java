package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;

public class MdProManager extends MdPro{
    /** 物料编码 */
    @Excel(name = "物料编码")
    @NotBlank(message = "物料编码不允许为空")
    private String item_code;

    /** 物料名称 */
    @Excel(name = "物料名称")
    @NotBlank(message = "物料名称不允许为空")
    private String item_name;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String item_spc;

    /** 单位 */
    @Excel(name = "单位")
    @NotBlank(message = "单位不允许为空")
    private String unit_of_measure;

    /** 物料或产品 */
    @Excel(name = "物料/产品")
    private String item_or_product;

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_spc() {
        return item_spc;
    }

    public void setItem_spc(String item_spc) {
        this.item_spc = item_spc;
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public String getItem_or_product() {
        return item_or_product;
    }

    public void setItem_or_product(String item_or_product) {
        this.item_or_product = item_or_product;
    }

    @Override
    public String toString() {
        return "MdProManager{" +
                "item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_spc='" + item_spc + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", item_or_product='" + item_or_product + '\'' +
                '}';
    }
}
