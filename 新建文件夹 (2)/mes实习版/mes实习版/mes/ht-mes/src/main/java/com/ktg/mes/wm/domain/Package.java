package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Package {

    /** 父箱ID */
    @Excel(name = "父箱ID")
    @NotBlank(message = "父箱ID不能为空")
    private BigInteger parent_id;

    /** 所有父节点ID */
    @Excel(name = "所有父节点ID")
    @NotBlank(message = "所有父节点ID不能为空")
    private String ancestors;

    /** 装箱单编号 */
    @Excel(name = "装箱单编号")
    private String package_code;

    /** 条码ID */
    @Excel(name = "条码ID")
    private BigInteger barcode_id;

    /** 条码内容 */
    @Excel(name = "条码内容")
    private String barcode_content;

    /** 条码地址 */
    @Excel(name = "条码地址")
    private String barcode_url;

    /** 装箱日期 */
    @Excel(name = "装箱日期")
    @NotBlank(message = "不能为空")
    private Date package_date;

    /** 销售订单编号 */
    @Excel(name = "销售订单编号")
    private String so_code;

    /** 发票编号 */
    @Excel(name = "发票编号")
    private String invoice_code;

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

    /** 箱长度 */
    @Excel(name = "箱长度")
    private Double package_length;

    /** 箱宽度 */
    @Excel(name = "箱宽度")
    private Double package_width;

    /** 箱高度 */
    @Excel(name = "箱高度")
    private Double package_height;

    /** 尺寸单位 */
    @Excel(name = "尺寸单位")
    private String size_unit;

    /** 净重 */
    @Excel(name = "净重")
    private Double net_weight;

    /** 毛重 */
    @Excel(name = "毛重")
    private Double cross_weight;

    /** 重量单位 */
    @Excel(name = "重量单位")
    private String weight_unit;

    /** 检查员用户名 */
    @Excel(name = "检查员用户名")
    private String inspector;

    /** 检查员名称 */
    @Excel(name = "检查员名称")
    private String inspector_name;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 是否生效 */
    @Excel(name = "是否生效")
    private String enable_flag;

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

    public BigInteger getParent_id() {
        return parent_id;
    }

    public void setParent_id(BigInteger parent_id) {
        this.parent_id = parent_id;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getPackage_code() {
        return package_code;
    }

    public void setPackage_code(String package_code) {
        this.package_code = package_code;
    }

    public BigInteger getBarcode_id() {
        return barcode_id;
    }

    public void setBarcode_id(BigInteger barcode_id) {
        this.barcode_id = barcode_id;
    }

    public String getBarcode_content() {
        return barcode_content;
    }

    public void setBarcode_content(String barcode_content) {
        this.barcode_content = barcode_content;
    }

    public String getBarcode_url() {
        return barcode_url;
    }

    public void setBarcode_url(String barcode_url) {
        this.barcode_url = barcode_url;
    }

    public Date getPackage_date() {
        return package_date;
    }

    public void setPackage_date(Date package_date) {
        this.package_date = package_date;
    }

    public String getSo_code() {
        return so_code;
    }

    public void setSo_code(String so_code) {
        this.so_code = so_code;
    }

    public String getInvoice_code() {
        return invoice_code;
    }

    public void setInvoice_code(String invoice_code) {
        this.invoice_code = invoice_code;
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

    public Double getPackage_length() {
        return package_length;
    }

    public void setPackage_length(Double package_length) {
        this.package_length = package_length;
    }

    public Double getPackage_width() {
        return package_width;
    }

    public void setPackage_width(Double package_width) {
        this.package_width = package_width;
    }

    public Double getPackage_height() {
        return package_height;
    }

    public void setPackage_height(Double package_height) {
        this.package_height = package_height;
    }

    public String getSize_unit() {
        return size_unit;
    }

    public void setSize_unit(String size_unit) {
        this.size_unit = size_unit;
    }

    public Double getNet_weight() {
        return net_weight;
    }

    public void setNet_weight(Double net_weight) {
        this.net_weight = net_weight;
    }

    public Double getCross_weight() {
        return cross_weight;
    }

    public void setCross_weight(Double cross_weight) {
        this.cross_weight = cross_weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getInspector_name() {
        return inspector_name;
    }

    public void setInspector_name(String inspector_name) {
        this.inspector_name = inspector_name;
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
        return "Package{" +
                "parent_id=" + parent_id +
                ", ancestors='" + ancestors + '\'' +
                ", package_code='" + package_code + '\'' +
                ", barcode_id=" + barcode_id +
                ", barcode_content='" + barcode_content + '\'' +
                ", barcode_url='" + barcode_url + '\'' +
                ", package_date=" + package_date +
                ", so_code='" + so_code + '\'' +
                ", invoice_code='" + invoice_code + '\'' +
                ", client_id=" + client_id +
                ", client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_nick='" + client_nick + '\'' +
                ", package_length=" + package_length +
                ", package_width=" + package_width +
                ", package_height=" + package_height +
                ", size_unit='" + size_unit + '\'' +
                ", net_weight=" + net_weight +
                ", cross_weight=" + cross_weight +
                ", weight_unit='" + weight_unit + '\'' +
                ", inspector='" + inspector + '\'' +
                ", inspector_name='" + inspector_name + '\'' +
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
