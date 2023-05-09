package com.ktg.mes.qc.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Ipqc {
    /** 检验单编号 */
    @Excel(name = "检验单编号")
    @NotBlank(message = "检验单编号不能为空")
    private String ipqc_code;

    /** 检验单名称 */
    @Excel(name = "检验单名称")
    @NotBlank(message = "检验单名称不能为空")
    private String ipqc_name;

    /** 检验类型 */
    @Excel(name = "检验类型")
    @NotBlank(message = "不能为空")
    private String ipqc_type;

    /** 检验模板ID */
    @Excel(name = "检验模板ID")
    @NotBlank(message = "不能为空")
    private BigInteger template_id;

    /** 工单ID */
    @Excel(name = "工单ID")
    @NotBlank(message = "不能为空")
    private BigInteger workorder_id;

    /** 工单编码 */
    @Excel(name = "工单编码")
    private String workorder_code;

    /** 工单名称 */
    @Excel(name = "工单名称")
    private String workorder_name;

    /** 任务ID */
    @Excel(name = "任务ID")
    private BigInteger task_id;

    /** 任务编号 */
    @Excel(name = "任务编号")
    private String task_code;

    /** 任务名称 */
    @Excel(name = "任务名称")
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

    /** 工序编码 */
    @Excel(name = "工序编码")
    private String process_code;

    /** 工序名称 */
    @Excel(name = "工序名称")
    private String process_name;

    /** 产品物料ID */
    @Excel(name = "产品物料ID")
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

    /** 本次检测数量 */
    @Excel(name = "本次检测数量")
    private Double quantity_check;

    /** 不合格数 */
    @Excel(name = "不合格数")
    private Double quantity_unqualified;

    /** 合格品数量 */
    @Excel(name = "合格品数量")
    private Double quantity_qualified;

    /** 致命缺陷率 */
    @Excel(name = "致命缺陷率")
    private Double cr_rate;

    /** 严重缺陷率 */
    @Excel(name = "严重缺陷率")
    private Double maj_rate;

    /** 轻微缺陷率 */
    @Excel(name = "轻微缺陷率")
    private Double min_rate;

    /** 致命缺陷数量 */
    @Excel(name = "致命缺陷数量")
    private Double cr_quantity;

    /** 严重缺陷数量 */
    @Excel(name = "严重缺陷数量")
    private Double maj_quantity;

    /** 轻微缺陷数量 */
    @Excel(name = "轻微缺陷数量")
    private Double min_quantity;

    /** 检测结果 */
    @Excel(name = "检测结果")
    private String check_result;

    /** 检测日期 */
    @Excel(name = "检测日期")
    private Date inspect_date;

    /** 检测人员 */
    @Excel(name = "检测人员")
    private String inspector;

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

    @Override
    public String toString() {
        return "Ipqc{" +
                "ipqc_code='" + ipqc_code + '\'' +
                ", ipqc_name='" + ipqc_name + '\'' +
                ", ipqc_type='" + ipqc_type + '\'' +
                ", template_id=" + template_id +
                ", workorder_id=" + workorder_id +
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
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", specification='" + specification + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", quantity_check=" + quantity_check +
                ", quantity_unqualified=" + quantity_unqualified +
                ", quantity_qualified=" + quantity_qualified +
                ", cr_rate=" + cr_rate +
                ", maj_rate=" + maj_rate +
                ", min_rate=" + min_rate +
                ", cr_quantity=" + cr_quantity +
                ", maj_quantity=" + maj_quantity +
                ", min_quantity=" + min_quantity +
                ", check_result='" + check_result + '\'' +
                ", inspect_date=" + inspect_date +
                ", inspector='" + inspector + '\'' +
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

    public String getIpqc_code() {
        return ipqc_code;
    }

    public void setIpqc_code(String ipqc_code) {
        this.ipqc_code = ipqc_code;
    }

    public String getIpqc_name() {
        return ipqc_name;
    }

    public void setIpqc_name(String ipqc_name) {
        this.ipqc_name = ipqc_name;
    }

    public String getIpqc_type() {
        return ipqc_type;
    }

    public void setIpqc_type(String ipqc_type) {
        this.ipqc_type = ipqc_type;
    }

    public BigInteger getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(BigInteger template_id) {
        this.template_id = template_id;
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

    public Double getQuantity_check() {
        return quantity_check;
    }

    public void setQuantity_check(Double quantity_check) {
        this.quantity_check = quantity_check;
    }

    public Double getQuantity_unqualified() {
        return quantity_unqualified;
    }

    public void setQuantity_unqualified(Double quantity_unqualified) {
        this.quantity_unqualified = quantity_unqualified;
    }

    public Double getQuantity_qualified() {
        return quantity_qualified;
    }

    public void setQuantity_qualified(Double quantity_qualified) {
        this.quantity_qualified = quantity_qualified;
    }

    public Double getCr_rate() {
        return cr_rate;
    }

    public void setCr_rate(Double cr_rate) {
        this.cr_rate = cr_rate;
    }

    public Double getMaj_rate() {
        return maj_rate;
    }

    public void setMaj_rate(Double maj_rate) {
        this.maj_rate = maj_rate;
    }

    public Double getMin_rate() {
        return min_rate;
    }

    public void setMin_rate(Double min_rate) {
        this.min_rate = min_rate;
    }

    public Double getCr_quantity() {
        return cr_quantity;
    }

    public void setCr_quantity(Double cr_quantity) {
        this.cr_quantity = cr_quantity;
    }

    public Double getMaj_quantity() {
        return maj_quantity;
    }

    public void setMaj_quantity(Double maj_quantity) {
        this.maj_quantity = maj_quantity;
    }

    public Double getMin_quantity() {
        return min_quantity;
    }

    public void setMin_quantity(Double min_quantity) {
        this.min_quantity = min_quantity;
    }

    public String getCheck_result() {
        return check_result;
    }

    public void setCheck_result(String check_result) {
        this.check_result = check_result;
    }

    public Date getInspect_date() {
        return inspect_date;
    }

    public void setInspect_date(Date inspect_date) {
        this.inspect_date = inspect_date;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
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
