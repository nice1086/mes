package com.ktg.mes.cal.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class TeamShift {
    /** 日期 */
    @Excel(name = "日期")
    @NotBlank(message = "日期不能为空")
    private String the_day;

    /** 班组ID */
    @Excel(name = "班组ID")
    @NotBlank(message = "班组ID不能为空")
    private BigInteger team_id;

    /** 班组名称 */
    @Excel(name = "班组名称")
    private String team_name;

    /** 班次ID */
    @Excel(name = "班次ID")
    private BigInteger shift_id;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String shift_name;

    /** 序号 */
    @Excel(name = "序号")
    private Integer order_num;

    /** 计划ID */
    @Excel(name = "计划ID")
    private BigInteger plan_id;

    /** 班组类型 */
    @Excel(name = "班组类型")
    private String calendar_type;

    /** 轮班方式 */
    @Excel(name = "轮班方式")
    private String shift_type;

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
        return "TeamShift{" +
                "the_day='" + the_day + '\'' +
                ", team_id=" + team_id +
                ", team_name='" + team_name + '\'' +
                ", shift_id=" + shift_id +
                ", shift_name='" + shift_name + '\'' +
                ", order_num=" + order_num +
                ", plan_id=" + plan_id +
                ", calendar_type='" + calendar_type + '\'' +
                ", shift_type='" + shift_type + '\'' +
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

    public String getThe_day() {
        return the_day;
    }

    public void setThe_day(String the_day) {
        this.the_day = the_day;
    }

    public BigInteger getTeam_id() {
        return team_id;
    }

    public void setTeam_id(BigInteger team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public BigInteger getShift_id() {
        return shift_id;
    }

    public void setShift_id(BigInteger shift_id) {
        this.shift_id = shift_id;
    }

    public String getShift_name() {
        return shift_name;
    }

    public void setShift_name(String shift_name) {
        this.shift_name = shift_name;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public BigInteger getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(BigInteger plan_id) {
        this.plan_id = plan_id;
    }

    public String getCalendar_type() {
        return calendar_type;
    }

    public void setCalendar_type(String calendar_type) {
        this.calendar_type = calendar_type;
    }

    public String getShift_type() {
        return shift_type;
    }

    public void setShift_type(String shift_type) {
        this.shift_type = shift_type;
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
