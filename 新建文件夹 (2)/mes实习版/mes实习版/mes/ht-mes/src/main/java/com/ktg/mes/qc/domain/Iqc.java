package com.ktg.mes.qc.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Iqc {
    /** 来料检验单编号 */
    @Excel(name = "来料检验单编号")
    @NotBlank(message = "来料检验单编号不能为空")
    private String iqc_code;

    /** 来料检验单名称 */
    @Excel(name = "来料检验单名称")
    @NotBlank(message = "来料检验单名称不能为空")
    private String iqc_name;

    /** 检验模板ID */
    @Excel(name = "检验模板ID")
    @NotBlank(message = "不能为空")
    private BigInteger template_id;

    /** 供应商ID */
    @Excel(name = "供应商ID")
    @NotBlank(message = "不能为空")
    private BigInteger vendor_id;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    @NotBlank(message = "不能为空")
    private String vendor_code;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    @NotBlank(message = "不能为空")
    private String vendor_name;

    /** 供应商简称 */
    @Excel(name = "供应商简称")
    private String vendor_nick;

    /** 供应商批次号 */
    @Excel(name = "供应商批次号")
    private String vendor_batch;

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
    private Integer quantity_min_check;

    /** 最大不合格数 */
    @Excel(name = "最大不合格数")
    private Integer quantity_max_unqualified;

    /** 本次接收数量 */
    @Excel(name = "本次接收数量")
    private Double quantity_recived;

    /** 本次检测数量 */
    @Excel(name = "本次检测数量")
    private Integer quantity_check;

    /** 不合格数 */
    @Excel(name = "不合格数")
    private Integer quantity_unqualified;

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
    private Integer cr_quantity;

    /** 严重缺陷数量 */
    @Excel(name = "严重缺陷数量")
    private Integer maj_quantity;

    /** 轻微缺陷数量 */
    @Excel(name = "轻微缺陷数量")
    private Integer min_quantity;

    /** 检测结果 */
    @Excel(name = "检测结果")
    private String check_result;

    /** 来料日期 */
    @Excel(name = "来料日期")
    private Date recive_date;

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

    public String getIqc_code() {
        return iqc_code;
    }

    public void setIqc_code(String iqc_code) {
        this.iqc_code = iqc_code;
    }

    public String getIqc_name() {
        return iqc_name;
    }

    public void setIqc_name(String iqc_name) {
        this.iqc_name = iqc_name;
    }

    public BigInteger getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(BigInteger template_id) {
        this.template_id = template_id;
    }

    public BigInteger getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(BigInteger vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_code() {
        return vendor_code;
    }

    public void setVendor_code(String vendor_code) {
        this.vendor_code = vendor_code;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_nick() {
        return vendor_nick;
    }

    public void setVendor_nick(String vendor_nick) {
        this.vendor_nick = vendor_nick;
    }

    public String getVendor_batch() {
        return vendor_batch;
    }

    public void setVendor_batch(String vendor_batch) {
        this.vendor_batch = vendor_batch;
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

    public Integer getQuantity_min_check() {
        return quantity_min_check;
    }

    public void setQuantity_min_check(Integer quantity_min_check) {
        this.quantity_min_check = quantity_min_check;
    }

    public Integer getQuantity_max_unqualified() {
        return quantity_max_unqualified;
    }

    public void setQuantity_max_unqualified(Integer quantity_max_unqualified) {
        this.quantity_max_unqualified = quantity_max_unqualified;
    }

    public Double getQuantity_recived() {
        return quantity_recived;
    }

    public void setQuantity_recived(Double quantity_recived) {
        this.quantity_recived = quantity_recived;
    }

    public Integer getQuantity_check() {
        return quantity_check;
    }

    public void setQuantity_check(Integer quantity_check) {
        this.quantity_check = quantity_check;
    }

    public Integer getQuantity_unqualified() {
        return quantity_unqualified;
    }

    public void setQuantity_unqualified(Integer quantity_unqualified) {
        this.quantity_unqualified = quantity_unqualified;
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

    public Integer getCr_quantity() {
        return cr_quantity;
    }

    public void setCr_quantity(Integer cr_quantity) {
        this.cr_quantity = cr_quantity;
    }

    public Integer getMaj_quantity() {
        return maj_quantity;
    }

    public void setMaj_quantity(Integer maj_quantity) {
        this.maj_quantity = maj_quantity;
    }

    public Integer getMin_quantity() {
        return min_quantity;
    }

    public void setMin_quantity(Integer min_quantity) {
        this.min_quantity = min_quantity;
    }

    public String getCheck_result() {
        return check_result;
    }

    public void setCheck_result(String check_result) {
        this.check_result = check_result;
    }

    public Date getRecive_date() {
        return recive_date;
    }

    public void setRecive_date(Date recive_date) {
        this.recive_date = recive_date;
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

    @Override
    public String toString() {
        return "Iqc{" +
                "iqc_code='" + iqc_code + '\'' +
                ", iqc_name='" + iqc_name + '\'' +
                ", template_id=" + template_id +
                ", vendor_id=" + vendor_id +
                ", vendor_code='" + vendor_code + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", vendor_nick='" + vendor_nick + '\'' +
                ", vendor_batch='" + vendor_batch + '\'' +
                ", item_id=" + item_id +
                ", item_code='" + item_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", specification='" + specification + '\'' +
                ", unit_of_measure='" + unit_of_measure + '\'' +
                ", quantity_min_check=" + quantity_min_check +
                ", quantity_max_unqualified=" + quantity_max_unqualified +
                ", quantity_recived=" + quantity_recived +
                ", quantity_check=" + quantity_check +
                ", quantity_unqualified=" + quantity_unqualified +
                ", cr_rate=" + cr_rate +
                ", maj_rate=" + maj_rate +
                ", min_rate=" + min_rate +
                ", cr_quantity=" + cr_quantity +
                ", maj_quantity=" + maj_quantity +
                ", min_quantity=" + min_quantity +
                ", check_result='" + check_result + '\'' +
                ", recive_date=" + recive_date +
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
}
