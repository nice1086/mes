package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Location {

    /** 入库单编号 */
    @Excel(name = "入库单编号")
    @NotBlank(message = "入库单编号不能为空")
    private String recpt_code;

    /** 入库单名称 */
    @Excel(name = "入库单名称")
    @NotBlank(message = "入库单名称不能为空")
    private String recpt_name;

    /** 来料检验单ID */
    @Excel(name = "来料检验单ID")
    private BigInteger iqc_id;

    /** 来料检验单编号 */
    @Excel(name = "来料检验单编号")
    private String iqc_code;

    /** 采购订单编号 */
    @Excel(name = "采购订单编号")
    private String po_code;

    /** 供应商ID */
    @Excel(name = "供应商ID")
    private BigInteger vendor_id;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendor_code;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendor_name;

    /** 供应商简称 */
    @Excel(name = "供应商简称")
    private String vendor_nick;

    /** 仓库ID */
    @Excel(name = "仓库ID")
    private BigInteger warehouse_id;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String warehouse_code;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private BigInteger warehouse_name;

    /** 库区ID */
    @Excel(name = "库区ID")
    private BigInteger location_id;

    /** 库区编码 */
    @Excel(name = "库区编码")
    private String location_code;

    /** 库区名称 */
    @Excel(name = "库区名称")
    private String location_name;

    /** 库位ID */
    @Excel(name = "库位ID")
    private BigInteger area_id;

    /** 库位编码 */
    @Excel(name = "库位编码")
    private String area_code;

    /** 库位名称 */
    @Excel(name = "库位名称")
    private String area_name;

    /** 入库日期 */
    @Excel(name = "入库日期")
    @NotBlank(message = "不能为空")
    private Date recpt_date;

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

    public String getRecpt_code() {
        return recpt_code;
    }

    public void setRecpt_code(String recpt_code) {
        this.recpt_code = recpt_code;
    }

    public String getRecpt_name() {
        return recpt_name;
    }

    public void setRecpt_name(String recpt_name) {
        this.recpt_name = recpt_name;
    }

    public BigInteger getIqc_id() {
        return iqc_id;
    }

    public void setIqc_id(BigInteger iqc_id) {
        this.iqc_id = iqc_id;
    }

    public String getIqc_code() {
        return iqc_code;
    }

    public void setIqc_code(String iqc_code) {
        this.iqc_code = iqc_code;
    }

    public String getPo_code() {
        return po_code;
    }

    public void setPo_code(String po_code) {
        this.po_code = po_code;
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

    public BigInteger getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(BigInteger warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_code() {
        return warehouse_code;
    }

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public BigInteger getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(BigInteger warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public BigInteger getLocation_id() {
        return location_id;
    }

    public void setLocation_id(BigInteger location_id) {
        this.location_id = location_id;
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public BigInteger getArea_id() {
        return area_id;
    }

    public void setArea_id(BigInteger area_id) {
        this.area_id = area_id;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public Date getRecpt_date() {
        return recpt_date;
    }

    public void setRecpt_date(Date recpt_date) {
        this.recpt_date = recpt_date;
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
        return "Location{" +
                "recpt_code='" + recpt_code + '\'' +
                ", recpt_name='" + recpt_name + '\'' +
                ", iqc_id=" + iqc_id +
                ", iqc_code='" + iqc_code + '\'' +
                ", po_code='" + po_code + '\'' +
                ", vendor_id=" + vendor_id +
                ", vendor_code='" + vendor_code + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", vendor_nick='" + vendor_nick + '\'' +
                ", warehouse_id=" + warehouse_id +
                ", warehouse_code='" + warehouse_code + '\'' +
                ", warehouse_name=" + warehouse_name +
                ", location_id=" + location_id +
                ", location_code='" + location_code + '\'' +
                ", location_name='" + location_name + '\'' +
                ", area_id=" + area_id +
                ", area_code='" + area_code + '\'' +
                ", area_name='" + area_name + '\'' +
                ", recpt_date=" + recpt_date +
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
