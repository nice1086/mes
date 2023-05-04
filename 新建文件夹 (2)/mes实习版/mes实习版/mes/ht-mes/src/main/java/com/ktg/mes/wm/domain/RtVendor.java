package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class RtVendor {
    /** 退货单编号 */
    @Excel(name = "退货单编号")
    @NotBlank(message = "退货单编号不能为空")
    private String rt_code;

    /** 退货单名称 */
    @Excel(name = "退货单名称")
    @NotBlank(message = "退货单名称不能为空")
    private String rt_name;

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

    /** 批次号 */
    @Excel(name = "批次号")
    private String batch_code;

    /** 退货日期 */
    @Excel(name = "退货日期")
    @NotBlank(message = "不能为空")
    private Date rt_date;

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

    public String getRt_code() {
        return rt_code;
    }

    public void setRt_code(String rt_code) {
        this.rt_code = rt_code;
    }

    public String getRt_name() {
        return rt_name;
    }

    public void setRt_name(String rt_name) {
        this.rt_name = rt_name;
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

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
    }

    public Date getRt_date() {
        return rt_date;
    }

    public void setRt_date(Date rt_date) {
        this.rt_date = rt_date;
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
        return "RtVendor{" +
                "rt_code='" + rt_code + '\'' +
                ", rt_name='" + rt_name + '\'' +
                ", po_code='" + po_code + '\'' +
                ", vendor_id=" + vendor_id +
                ", vendor_code='" + vendor_code + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", vendor_nick='" + vendor_nick + '\'' +
                ", batch_code='" + batch_code + '\'' +
                ", rt_date=" + rt_date +
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
