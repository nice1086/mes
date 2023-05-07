package com.ktg.mes.dv.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Repair {
    /** 维修单编号 */
    @Excel(name = "维修单编号")
    @NotBlank(message = "维修单编号不能为空")
    private String repair_code;

    /** 维修单名称 */
    @Excel(name = "维修单名称")
    @NotBlank(message = "维修单名称不能为空")
    private String repair_name;

    /** 设备ID */
    @Excel(name = "设备ID")
    private BigInteger machinery_id;

    /** 设备编码 */
    @Excel(name = "设备编码")
    private String machinery_code;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String machinery_name;

    /** 品牌 */
    @Excel(name = "品牌")
    private String machinery_brand;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String machinery_spec;

    /** 设备类型ID */
    @Excel(name = "设备类型ID")
    private BigInteger machinery_type_id;

    /** 报修日期 */
    @Excel(name = "报修日期")
    private Date require_date;

    /** 维修完成日期 */
    @Excel(name = "维修完成日期")
    private Date finish_date;

    /** 验收日期 */
    @Excel(name = "验收日期")
    private Date confirm_date;

    /** 维修结果 */
    @Excel(name = "维修结果")
    private String repair_result;

    /** 维修人员 */
    @Excel(name = "维修人员")
    private String accepted_by;

    /** 验收人员 */
    @Excel(name = "验收人员")
    private String confirm_by;

    /** 单据状态 */
    @Excel(name = "单据状态")
    private String status;

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

    public String getRepair_code() {
        return repair_code;
    }

    public void setRepair_code(String repair_code) {
        this.repair_code = repair_code;
    }

    public String getRepair_name() {
        return repair_name;
    }

    public void setRepair_name(String repair_name) {
        this.repair_name = repair_name;
    }

    public BigInteger getMachinery_id() {
        return machinery_id;
    }

    public void setMachinery_id(BigInteger machinery_id) {
        this.machinery_id = machinery_id;
    }

    public String getMachinery_code() {
        return machinery_code;
    }

    public void setMachinery_code(String machinery_code) {
        this.machinery_code = machinery_code;
    }

    public String getMachinery_name() {
        return machinery_name;
    }

    public void setMachinery_name(String machinery_name) {
        this.machinery_name = machinery_name;
    }

    public String getMachinery_brand() {
        return machinery_brand;
    }

    public void setMachinery_brand(String machinery_brand) {
        this.machinery_brand = machinery_brand;
    }

    public String getMachinery_spec() {
        return machinery_spec;
    }

    public void setMachinery_spec(String machinery_spec) {
        this.machinery_spec = machinery_spec;
    }

    public BigInteger getMachinery_type_id() {
        return machinery_type_id;
    }

    public void setMachinery_type_id(BigInteger machinery_type_id) {
        this.machinery_type_id = machinery_type_id;
    }

    public Date getRequire_date() {
        return require_date;
    }

    public void setRequire_date(Date require_date) {
        this.require_date = require_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public Date getConfirm_date() {
        return confirm_date;
    }

    public void setConfirm_date(Date confirm_date) {
        this.confirm_date = confirm_date;
    }

    public String getRepair_result() {
        return repair_result;
    }

    public void setRepair_result(String repair_result) {
        this.repair_result = repair_result;
    }

    public String getAccepted_by() {
        return accepted_by;
    }

    public void setAccepted_by(String accepted_by) {
        this.accepted_by = accepted_by;
    }

    public String getConfirm_by() {
        return confirm_by;
    }

    public void setConfirm_by(String confirm_by) {
        this.confirm_by = confirm_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "Repair{" +
                "repair_code='" + repair_code + '\'' +
                ", repair_name='" + repair_name + '\'' +
                ", machinery_id=" + machinery_id +
                ", machinery_code='" + machinery_code + '\'' +
                ", machinery_name='" + machinery_name + '\'' +
                ", machinery_brand='" + machinery_brand + '\'' +
                ", machinery_spec='" + machinery_spec + '\'' +
                ", machinery_type_id=" + machinery_type_id +
                ", require_date=" + require_date +
                ", finish_date=" + finish_date +
                ", confirm_date=" + confirm_date +
                ", repair_result='" + repair_result + '\'' +
                ", accepted_by='" + accepted_by + '\'' +
                ", confirm_by='" + confirm_by + '\'' +
                ", status='" + status + '\'' +
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
