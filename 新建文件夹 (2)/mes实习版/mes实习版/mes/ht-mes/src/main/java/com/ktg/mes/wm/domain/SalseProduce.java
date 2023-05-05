package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class SalseProduce {

    /** 出库记录ID */
    @Excel(name = "出库记录ID")
    private BigInteger salse_id;

    /** 产品物料ID */
    @Excel(name = "产品物料ID")
    private BigInteger material_stock_id;

    /** 批次号 */
    @Excel(name = "批次号")
    private BigInteger item_id;

    /** 产品物料编码 */
    @Excel(name = "产品物料编码")
    private String item_code;

    /** 产品物料名称 */
    @Excel(name = "产品物料名称")
    private String item_name;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specification;

    /** 单位 */
    @Excel(name = "单位")
    private String unit_of_measure;

    /** 出库数量 */
    @Excel(name = "出库数量")
    private String quantity_salse;

    /** 批次号 */
    @Excel(name = "批次号")
    private String batch_code;

    /** 仓库ID */
    @Excel(name = "仓库ID")
    private BigInteger warehouse_id;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String warehouse_code;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private BigInteger warehouse_name;

    /** 库区ID */
    @Excel(name = "库区ID")
    private BigInteger location_id;

    /** 库区编码 */
    @Excel(name = "库区编码")
    private String location_code;

    /** 库区名称 */
    @Excel(name = "库区名称")
    private String location_name;

    /** 库位ID */
    @Excel(name = "库位ID")
    private BigInteger area_id;

    /** 库位编码 */
    @Excel(name = "库位编码")
    private String area_code;

    /** 库位名称 */
    @Excel(name = "库位名称")
    private String area_name;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

    /** 预留字段1 */
    @Excel(name = "预留字段1")
    private String attr1;

    /** 预留字段2 */
    @Excel(name = "预留字段2")
    private String attr2;

    /** 预留字段3 */
    @Excel(name = "预留字段3")
    private Integer attr3;

    /** 预留字段4 */
    @Excel(name = "预留字段4")
    private Integer attr4;

    /** 创建者 */
    @Excel(name = "创建者")
    private String create_by;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Date create_time;

    /** 更新者 */
    @Excel(name = "更新者")
    private String update_by;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private Date update_time;

    public BigInteger getSalse_id() {
        return salse_id;
    }

    public void setSalse_id(BigInteger salse_id) {
        this.salse_id = salse_id;
    }

    public BigInteger getMaterial_stock_id() {
        return material_stock_id;
    }

    public void setMaterial_stock_id(BigInteger material_stock_id) {
        this.material_stock_id = material_stock_id;
    }

    public BigInteger getItem_id() {
        return item_id;
    }

    public void setItem_id(BigInteger item_id) {
        this.item_id = item_id;
    }

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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public String getQuantity_salse() {
        return quantity_salse;
    }

    public void setQuantity_salse(String quantity_salse) {
        this.quantity_salse = quantity_salse;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
    }

    public BigInteger getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(BigInteger warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_code() {
        return warehouse_code;
    }

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public BigInteger getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(BigInteger warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public BigInteger getLocation_id() {
        return location_id;
    }

    public void setLocation_id(BigInteger location_id) {
        this.location_id = location_id;
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public BigInteger getArea_id() {
        return area_id;
    }

    public void setArea_id(BigInteger area_id) {
        this.area_id = area_id;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public Integer getAttr3() {
        return attr3;
    }

    public void setAttr3(Integer attr3) {
        this.attr3 = attr3;
    }

    public Integer getAttr4() {
        return attr4;
    }

    public void setAttr4(Integer attr4) {
        this.attr4 = attr4;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "SalseProduce{" +
                "salse_id=" + salse_id +
                ", material_stock_id=" + material_stock_id +
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", specification='" + specification + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", quantity_salse='" + quantity_salse + '\'' +
                ", batch_code='" + batch_code + '\'' +
                ", warehouse_id=" + warehouse_id +
                ", warehouse_code='" + warehouse_code + '\'' +
                ", warehouse_name=" + warehouse_name +
                ", location_id=" + location_id +
                ", location_code='" + location_code + '\'' +
                ", location_name='" + location_name + '\'' +
                ", area_id=" + area_id +
                ", area_code='" + area_code + '\'' +
                ", area_name='" + area_name + '\'' +
                ", remark='" + remark + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3=" + attr3 +
                ", attr4=" + attr4 +
                ", create_by='" + create_by + '\'' +
                ", create_time=" + create_time +
                ", update_by='" + update_by + '\'' +
                ", update_time=" + update_time +
                '}';
    }
}
