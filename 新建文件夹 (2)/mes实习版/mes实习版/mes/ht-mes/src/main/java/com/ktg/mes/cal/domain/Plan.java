package com.ktg.mes.cal.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Plan {
    /** 计划编号 */
    @Excel(name = "计划编号")
    @NotBlank(message = "计划编号不能为空")
    private String plan_code;

    /** 计划名称 */
    @Excel(name = "计划名称")
    @NotBlank(message = "计划名称不能为空")
    private String plan_name;

    /** 班组类型 */
    @Excel(name = "班组类型")
    private String calendar_type;

    /** 开始日期 */
    @Excel(name = "开始日期")
    private Date start_date;

    /** 结束日期 */
    @Excel(name = "结束日期")
    private Date end_date;

    /** 轮班方式 */
    @Excel(name = "轮班方式")
    private String shift_type;

    /** 倒班方式 */
    @Excel(name = "倒班方式")
    private String shift_method;

    /** 数 */
    @Excel(name = "数")
    private String shift_count;

    /** 状态 */
    @Excel(name = "状态")
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

    @Override
    public String toString() {
        return "Plan{" +
                "plan_code='" + plan_code + '\'' +
                ", plan_name='" + plan_name + '\'' +
                ", calendar_type='" + calendar_type + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", shift_type='" + shift_type + '\'' +
                ", shift_method='" + shift_method + '\'' +
                ", shift_count='" + shift_count + '\'' +
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

    public String getPlan_code() {
        return plan_code;
    }

    public void setPlan_code(String plan_code) {
        this.plan_code = plan_code;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getCalendar_type() {
        return calendar_type;
    }

    public void setCalendar_type(String calendar_type) {
        this.calendar_type = calendar_type;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getShift_type() {
        return shift_type;
    }

    public void setShift_type(String shift_type) {
        this.shift_type = shift_type;
    }

    public String getShift_method() {
        return shift_method;
    }

    public void setShift_method(String shift_method) {
        this.shift_method = shift_method;
    }

    public String getShift_count() {
        return shift_count;
    }

    public void setShift_count(String shift_count) {
        this.shift_count = shift_count;
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
}
