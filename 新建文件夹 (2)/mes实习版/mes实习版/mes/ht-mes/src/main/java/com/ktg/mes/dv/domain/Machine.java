package com.ktg.mes.dv.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Machine {
    /** 设备类型编码 */
    @Excel(name = "设备类型编码")
    @NotBlank(message = "设备类型编码不能为空")
    private String machinery_type_code;

    /** 设备类型名称 */
    @Excel(name = "设备类型名称")
    @NotBlank(message = "设备类型名称不能为空")
    private String machinery_type_name;

    /** 父类型ID */
    @Excel(name = "父类型ID")
    private BigInteger parent_type_id;

    /** 所有父节点ID */
    @Excel(name = "所有父节点ID")
    private String ancestors;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private String enable_flag;

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

    public String getMachinery_type_code() {
        return machinery_type_code;
    }

    public void setMachinery_type_code(String machinery_type_code) {
        this.machinery_type_code = machinery_type_code;
    }

    public String getMachinery_type_name() {
        return machinery_type_name;
    }

    public void setMachinery_type_name(String machinery_type_name) {
        this.machinery_type_name = machinery_type_name;
    }

    public BigInteger getParent_type_id() {
        return parent_type_id;
    }

    public void setParent_type_id(BigInteger parent_type_id) {
        this.parent_type_id = parent_type_id;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getEnable_flag() {
        return enable_flag;
    }

    public void setEnable_flag(String enable_flag) {
        this.enable_flag = enable_flag;
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
        return "Machine{" +
                "machinery_type_code='" + machinery_type_code + '\'' +
                ", machinery_type_name='" + machinery_type_name + '\'' +
                ", parent_type_id=" + parent_type_id +
                ", ancestors='" + ancestors + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
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
