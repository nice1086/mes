package com.ktg.mes.pro.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Feedback {
    /** 报工类型 */
    @Excel(name = "报工类型")
    @NotBlank(message = "报工类型不能为空")
    private String feedback_type;

    /** 工作站ID */
    @Excel(name = "工作站ID")
    @NotBlank(message = "工作站ID不能为空")
    private BigInteger workstation_id;

    /** 工作站编号 */
    @Excel(name = "工作站编号")
    private String workstation_code;

    /** 工作站名称 */
    @Excel(name = "工作站名称")
    @NotBlank(message = "不能为空")
    private String workstation_name;

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

    /** 生产任务ID */
    @Excel(name = "生产任务ID")
    private BigInteger task_id;

    /** 生产任务编号 */
    @Excel(name = "生产任务编号")
    private String task_code;

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

    /** 单位 */
    @Excel(name = "单位")
    @NotBlank(message = "不能为空")
    private String unit_of_measure;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specification;

    /** 排产数量 */
    @Excel(name = "排产数量")
    @NotBlank(message = "不能为空")
    private Double quantity;

    /** 本次报工数量 */
    @Excel(name = "本次报工数量")
    private Double quantity_feedback;

    /** 合格品数量 */
    @Excel(name = "合格品数量")
    private Double quantity_qualified;

    /** 不良品数量 */
    @Excel(name = "不良品数量")
    private Double quantity_unquanlified;

    /** 报工用户名 */
    @Excel(name = "报工用户名")
    private BigInteger user_name;

    /** 昵称 */
    @Excel(name = "昵称")
    private String nick_name;

    /** 报工途径 */
    @Excel(name = "报工途径")
    private String feedback_channel;

    /** 报工时间 */
    @Excel(name = "报工时间")
    private Date feedback_time;

    /** 记录人 */
    @Excel(name = "记录人")
    private String record_user;

    /** 记录人名称 */
    @Excel(name = "记录人名称")
    private String record_nick;

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

    public String getFeedback_type() {
        return feedback_type;
    }

    public void setFeedback_type(String feedback_type) {
        this.feedback_type = feedback_type;
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

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantity_feedback() {
        return quantity_feedback;
    }

    public void setQuantity_feedback(Double quantity_feedback) {
        this.quantity_feedback = quantity_feedback;
    }

    public Double getQuantity_qualified() {
        return quantity_qualified;
    }

    public void setQuantity_qualified(Double quantity_qualified) {
        this.quantity_qualified = quantity_qualified;
    }

    public Double getQuantity_unquanlified() {
        return quantity_unquanlified;
    }

    public void setQuantity_unquanlified(Double quantity_unquanlified) {
        this.quantity_unquanlified = quantity_unquanlified;
    }

    public BigInteger getUser_name() {
        return user_name;
    }

    public void setUser_name(BigInteger user_name) {
        this.user_name = user_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getFeedback_channel() {
        return feedback_channel;
    }

    public void setFeedback_channel(String feedback_channel) {
        this.feedback_channel = feedback_channel;
    }

    public Date getFeedback_time() {
        return feedback_time;
    }

    public void setFeedback_time(Date feedback_time) {
        this.feedback_time = feedback_time;
    }

    public String getRecord_user() {
        return record_user;
    }

    public void setRecord_user(String record_user) {
        this.record_user = record_user;
    }

    public String getRecord_nick() {
        return record_nick;
    }

    public void setRecord_nick(String record_nick) {
        this.record_nick = record_nick;
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
        return "Feedback{" +
                "feedback_type='" + feedback_type + '\'' +
                ", workstation_id=" + workstation_id +
                ", workstation_code='" + workstation_code + '\'' +
                ", workstation_name='" + workstation_name + '\'' +
                ", workorder_id=" + workorder_id +
                ", workorder_code='" + workorder_code + '\'' +
                ", workorder_name='" + workorder_name + '\'' +
                ", process_id=" + process_id +
                ", process_code='" + process_code + '\'' +
                ", process_name='" + process_name + '\'' +
                ", task_id=" + task_id +
                ", task_code='" + task_code + '\'' +
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", specification='" + specification + '\'' +
                ", quantity=" + quantity +
                ", quantity_feedback=" + quantity_feedback +
                ", quantity_qualified=" + quantity_qualified +
                ", quantity_unquanlified=" + quantity_unquanlified +
                ", user_name=" + user_name +
                ", nick_name='" + nick_name + '\'' +
                ", feedback_channel='" + feedback_channel + '\'' +
                ", feedback_time=" + feedback_time +
                ", record_user='" + record_user + '\'' +
                ", record_nick='" + record_nick + '\'' +
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
