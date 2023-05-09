package com.ktg.mes.qc.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Defect {
    /** 缺陷编码 */
    @Excel(name = "缺陷编码")
    @NotBlank(message = "缺陷编码不能为空")
    private String defect_code;

    /** 缺陷描述 */
    @Excel(name = "缺陷描述")
    @NotBlank(message = "缺陷描述不能为空")
    private String defect_name;

    /** 检测项类型 */
    @Excel(name = "检测项类型")
    private String index_type;

    /** 工作站编号 */
    @Excel(name = "工作站编号")
    private String workstation_code;

    /** 缺陷等级 */
    @Excel(name = "缺陷等级")
    private String defect_level;

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

    public String getDefect_code() {
        return defect_code;
    }

    public void setDefect_code(String defect_code) {
        this.defect_code = defect_code;
    }

    public String getDefect_name() {
        return defect_name;
    }

    public void setDefect_name(String defect_name) {
        this.defect_name = defect_name;
    }

    public String getIndex_type() {
        return index_type;
    }

    public void setIndex_type(String index_type) {
        this.index_type = index_type;
    }

    public String getWorkstation_code() {
        return workstation_code;
    }

    public void setWorkstation_code(String workstation_code) {
        this.workstation_code = workstation_code;
    }

    public String getDefect_level() {
        return defect_level;
    }

    public void setDefect_level(String defect_level) {
        this.defect_level = defect_level;
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
    public String
    toString() {
        return "Defect{" +
                "defect_code='" + defect_code + '\'' +
                ", defect_name='" + defect_name + '\'' +
                ", index_type='" + index_type + '\'' +
                ", workstation_code='" + workstation_code + '\'' +
                ", defect_level='" + defect_level + '\'' +
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
