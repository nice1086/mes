package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Prdproduce {

    /** 生产工单ID */
    @Excel(name = "生产工单ID")
    private BigInteger workorder_id;

    /** 生产工单编码 */
    @Excel(name = "生产工单编码")
    private String workorder_code;

    /** 生产工单名称 */
    @Excel(name = "生产工单名称")
    private String workorder_name;

    /** 生产任务ID */
    @Excel(name = "生产任务ID")
    private BigInteger task_id;

    /** 生产任务编码 */
    @Excel(name = "生产任务编码")
    private String task_code;

    /** 生产任务名称 */
    @Excel(name = "生产任务名称")
    private String task_name;

    /** 工作站ID */
    @Excel(name = "工作站ID")
    private BigInteger workstation_id;

    /** 工作站编号 */
    @Excel(name = "工作站编号")
    private String workstation_code;

    /** 工作站名称 */
    @Excel(name = "工作站名称")
    private String workstation_name;

    /** 工序ID */
    @Excel(name = "工序ID")
    private BigInteger process_id;

    /** 工序编号 */
    @Excel(name = "工序编号")
    private String process_code;

    /** 工序名称 */
    @Excel(name = "工序名称")
    private String process_name;

    /** 生产日期 */
    @Excel(name = "生产日期")
    private Date produce_date;

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

    public BigInteger getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(BigInteger workorder_id) {
        this.workorder_id = workorder_id;
    }

    public String getWorkorder_code() {
        return workorder_code;
    }

    public void setWorkorder_code(String workorder_code) {
        this.workorder_code = workorder_code;
    }

    public String getWorkorder_name() {
        return workorder_name;
    }

    public void setWorkorder_name(String workorder_name) {
        this.workorder_name = workorder_name;
    }

    public BigInteger getTask_id() {
        return task_id;
    }

    public void setTask_id(BigInteger task_id) {
        this.task_id = task_id;
    }

    public String getTask_code() {
        return task_code;
    }

    public void setTask_code(String task_code) {
        this.task_code = task_code;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public BigInteger getWorkstation_id() {
        return workstation_id;
    }

    public void setWorkstation_id(BigInteger workstation_id) {
        this.workstation_id = workstation_id;
    }

    public String getWorkstation_code() {
        return workstation_code;
    }

    public void setWorkstation_code(String workstation_code) {
        this.workstation_code = workstation_code;
    }

    public String getWorkstation_name() {
        return workstation_name;
    }

    public void setWorkstation_name(String workstation_name) {
        this.workstation_name = workstation_name;
    }

    public BigInteger getProcess_id() {
        return process_id;
    }

    public void setProcess_id(BigInteger process_id) {
        this.process_id = process_id;
    }

    public String getProcess_code() {
        return process_code;
    }

    public void setProcess_code(String process_code) {
        this.process_code = process_code;
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    public Date getProduce_date() {
        return produce_date;
    }

    public void setProduce_date(Date produce_date) {
        this.produce_date = produce_date;
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
        return "Prdproduce{" +
                "workorder_id=" + workorder_id +
                ", workorder_code='" + workorder_code + '\'' +
                ", workorder_name='" + workorder_name + '\'' +
                ", task_id=" + task_id +
                ", task_code='" + task_code + '\'' +
                ", task_name='" + task_name + '\'' +
                ", workstation_id=" + workstation_id +
                ", workstation_code='" + workstation_code + '\'' +
                ", workstation_name='" + workstation_name + '\'' +
                ", process_id=" + process_id +
                ", process_code='" + process_code + '\'' +
                ", process_name='" + process_name + '\'' +
                ", produce_date=" + produce_date +
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
