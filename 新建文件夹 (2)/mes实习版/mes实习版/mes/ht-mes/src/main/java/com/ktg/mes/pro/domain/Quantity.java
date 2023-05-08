package com.ktg.mes.pro.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Quantity {
    /** 任务编号 */
    @Excel(name = "任务编号")
    @NotBlank(message = "任务编号不能为空")
    private String task_code;

    /** 任务名称 */
    @Excel(name = "任务名称")
    @NotBlank(message = "任务名称不能为空")
    private String task_name;

    /** 生产工单ID */
    @Excel(name = "生产工单ID")
    @NotBlank(message = "不能为空")
    private BigInteger workorder_id;

    /** 生产工单编号 */
    @Excel(name = "生产工单编号")
    @NotBlank(message = "不能为空")
    private String workorder_code;

    /** 工单名称 */
    @Excel(name = "工单名称")
    @NotBlank(message = "不能为空")
    private String workorder_name;

    /** 工作站ID */
    @Excel(name = "工作站ID")
    @NotBlank(message = "不能为空")
    private BigInteger workstation_id;

    /** 工作站编号 */
    @Excel(name = "工作站编号")
    @NotBlank(message = "不能为空")
    private String workstation_code;

    /** 工作站名称 */
    @Excel(name = "工作站名称")
    @NotBlank(message = "不能为空")
    private String workstation_name;

    /** 工序ID */
    @Excel(name = "工序ID")
    @NotBlank(message = "不能为空")
    private BigInteger process_id;

    /** 工序编码 */
    @Excel(name = "工序编码")
    private String process_code;

    /** 工序名称 */
    @Excel(name = "工序名称")
    private String process_name;

    /** 产品物料ID */
    @Excel(name = "产品物料ID")
    @NotBlank(message = "不能为空")
    private BigInteger item_id;

    /** 产品物料编码 */
    @Excel(name = "产品物料编码")
    @NotBlank(message = "不能为空")
    private String item_code;

    /** 产品物料名称 */
    @Excel(name = "产品物料名称")
    @NotBlank(message = "不能为空")
    private String item_name;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specification;

    /** 单位 */
    @Excel(name = "单位")
    @NotBlank(message = "不能为空")
    private String unit_of_measure;

    /** 排产数量 */
    @Excel(name = "排产数量")
    @NotBlank(message = "不能为空")
    private Double quantity;

    /** 已生产数量 */
    @Excel(name = "已生产数量")
    private Double quantity_produced;

    /** 合格品数量 */
    @Excel(name = "合格品数量")
    private Double quantity_quanlify;

    /** 不良品数量 */
    @Excel(name = "不良品数量")
    private Double quantity_unquanlify;

    /** 调整数量 */
    @Excel(name = "调整数量")
    private Double quantity_changed;

    /** 客户ID */
    @Excel(name = "客户ID")
    private BigInteger client_id;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String client_code;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String client_name;

    /** 客户简称 */
    @Excel(name = "客户简称")
    private String client_nick;

    /** 开始生产时间 */
    @Excel(name = "开始生产时间")
    private Date start_time;

    /** 生产时长 */
    @Excel(name = "生产时长")
    private Integer duration;

    /** 完成生产时间 */
    @Excel(name = "完成生产时间")
    private Date end_time;

    /** 甘特图显示颜色 */
    @Excel(name = "甘特图显示颜色")
    private String color_code;

    /** 需求日期 */
    @Excel(name = "需求日期")
    private Date request_date;

    /** 生产状态 */
    @Excel(name = "生产状态")
    private String status;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private String enable_flag;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

    /** 预留字段1 */
    @Excel(name = "预留字段1")
    @NotBlank(message = "不能为空")
    private String attr1;

    /** 预留字段2 */
    @Excel(name = "预留字段2")
    @NotBlank(message = "不能为空")
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantity_produced() {
        return quantity_produced;
    }

    public void setQuantity_produced(Double quantity_produced) {
        this.quantity_produced = quantity_produced;
    }

    public Double getQuantity_quanlify() {
        return quantity_quanlify;
    }

    public void setQuantity_quanlify(Double quantity_quanlify) {
        this.quantity_quanlify = quantity_quanlify;
    }

    public Double getQuantity_unquanlify() {
        return quantity_unquanlify;
    }

    public void setQuantity_unquanlify(Double quantity_unquanlify) {
        this.quantity_unquanlify = quantity_unquanlify;
    }

    public Double getQuantity_changed() {
        return quantity_changed;
    }

    public void setQuantity_changed(Double quantity_changed) {
        this.quantity_changed = quantity_changed;
    }

    public BigInteger getClient_id() {
        return client_id;
    }

    public void setClient_id(BigInteger client_id) {
        this.client_id = client_id;
    }

    public String getClient_code() {
        return client_code;
    }

    public void setClient_code(String client_code) {
        this.client_code = client_code;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_nick() {
        return client_nick;
    }

    public void setClient_nick(String client_nick) {
        this.client_nick = client_nick;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }

    public Date getRequest_date() {
        return request_date;
    }

    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "Quantity{" +
                "task_code='" + task_code + '\'' +
                ", task_name='" + task_name + '\'' +
                ", workorder_id=" + workorder_id +
                ", workorder_code='" + workorder_code + '\'' +
                ", workorder_name='" + workorder_name + '\'' +
                ", workstation_id=" + workstation_id +
                ", workstation_code='" + workstation_code + '\'' +
                ", workstation_name='" + workstation_name + '\'' +
                ", process_id=" + process_id +
                ", process_code='" + process_code + '\'' +
                ", process_name='" + process_name + '\'' +
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", specification='" + specification + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", quantity=" + quantity +
                ", quantity_produced=" + quantity_produced +
                ", quantity_quanlify=" + quantity_quanlify +
                ", quantity_unquanlify=" + quantity_unquanlify +
                ", quantity_changed=" + quantity_changed +
                ", client_id=" + client_id +
                ", client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_nick='" + client_nick + '\'' +
                ", start_time=" + start_time +
                ", duration=" + duration +
                ", end_time=" + end_time +
                ", color_code='" + color_code + '\'' +
                ", request_date=" + request_date +
                ", status='" + status + '\'' +
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
