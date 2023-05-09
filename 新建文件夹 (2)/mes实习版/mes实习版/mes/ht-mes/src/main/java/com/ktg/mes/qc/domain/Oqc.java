package com.ktg.mes.qc.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Oqc {
    /** 出货检验单编号 */
    @Excel(name = "出货检验单编号")
    @NotBlank(message = "出货检验单编号不能为空")
    private String oqc_code;

    /** 出货检验单名称 */
    @Excel(name = "出货检验单名称")
    @NotBlank(message = "出货检验单名称不能为空")
    private String oqc_name;

    /** 检验模板ID */
    @Excel(name = "检验模板ID")
    @NotBlank(message = "不能为空")
    private BigInteger template_id;

    /** 客户ID */
    @Excel(name = "客户ID")
    @NotBlank(message = "不能为空")
    private BigInteger client_id;

    /** 客户编码 */
    @Excel(name = "客户编码")
    @NotBlank(message = "不能为空")
    private String client_code;

    /** 客户名称 */
    @Excel(name = "客户名称")
    @NotBlank(message = "不能为空")
    private String client_name;

    /** 批次号 */
    @Excel(name = "批次号")
    private String batch_code;

    /** 产品物料ID */
    @Excel(name = "备产品物料ID注")
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

    /** 最低检测数 */
    @Excel(name = "最低检测数")
    private Double quantity_min_check;

    /** 最大不合格数 */
    @Excel(name = "最大不合格数")
    private Double quantity_max_unqualified;

    /** 发货数量 */
    @Excel(name = "发货数量")
    private Double quantity_out;

    /** 本次检测数量 */
    @Excel(name = "本次检测数量")
    private Double quantity_check;

    /** 不合格数 */
    @Excel(name = "不合格数")
    private Double quantity_unqualified;

    /** 合格数量 */
    @Excel(name = "合格数量")
    private Double quantity_quanlified;

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

    /** 出货日期 */
    @Excel(name = "出货日期")
    private Date out_date;

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
        return "Oqc{" +
                "oqc_code='" + oqc_code + '\'' +
                ", oqc_name='" + oqc_name + '\'' +
                ", template_id=" + template_id +
                ", client_id=" + client_id +
                ", client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", batch_code='" + batch_code + '\'' +
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", specification='" + specification + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", quantity_min_check=" + quantity_min_check +
                ", quantity_max_unqualified=" + quantity_max_unqualified +
                ", quantity_out=" + quantity_out +
                ", quantity_check=" + quantity_check +
                ", quantity_unqualified=" + quantity_unqualified +
                ", quantity_quanlified=" + quantity_quanlified +
                ", cr_rate=" + cr_rate +
                ", maj_rate=" + maj_rate +
                ", min_rate=" + min_rate +
                ", cr_quantity=" + cr_quantity +
                ", maj_quantity=" + maj_quantity +
                ", min_quantity=" + min_quantity +
                ", check_result='" + check_result + '\'' +
                ", out_date=" + out_date +
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

    public String getOqc_code() {
        return oqc_code;
    }

    public void setOqc_code(String oqc_code) {
        this.oqc_code = oqc_code;
    }

    public String getOqc_name() {
        return oqc_name;
    }

    public void setOqc_name(String oqc_name) {
        this.oqc_name = oqc_name;
    }

    public BigInteger getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(BigInteger template_id) {
        this.template_id = template_id;
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

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
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

    public Double getQuantity_min_check() {
        return quantity_min_check;
    }

    public void setQuantity_min_check(Double quantity_min_check) {
        this.quantity_min_check = quantity_min_check;
    }

    public Double getQuantity_max_unqualified() {
        return quantity_max_unqualified;
    }

    public void setQuantity_max_unqualified(Double quantity_max_unqualified) {
        this.quantity_max_unqualified = quantity_max_unqualified;
    }

    public Double getQuantity_out() {
        return quantity_out;
    }

    public void setQuantity_out(Double quantity_out) {
        this.quantity_out = quantity_out;
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

    public Double getQuantity_quanlified() {
        return quantity_quanlified;
    }

    public void setQuantity_quanlified(Double quantity_quanlified) {
        this.quantity_quanlified = quantity_quanlified;
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

    public Date getOut_date() {
        return out_date;
    }

    public void setOut_date(Date out_date) {
        this.out_date = out_date;
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
