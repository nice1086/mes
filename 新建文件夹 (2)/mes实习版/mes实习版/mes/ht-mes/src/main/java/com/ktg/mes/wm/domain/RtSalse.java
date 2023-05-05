package com.ktg.mes.wm.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class RtSalse {
    /** 退货单编号 */
    @Excel(name = "退货单编号")
    @NotBlank(message = "退货单编号不能为空")
    private String rt_code;

    /** 退货单名称 */
    @Excel(name = "退货单名称")
    @NotBlank(message = "退货单名称不能为空")
    private String rt_name;

    /** 销售订单编号 */
    @Excel(name = "销售订单编号")
    private String so_code;

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

    /** 仓库ID */
    @Excel(name = "仓库ID")
    private BigInteger warehouse_id;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String warehouse_code;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouse_name;

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

    /** 退货日期 */
    @Excel(name = "退货日期")
    private Date rt_date;

    /** 退货原因 */
    @Excel(name = "退货原因")
    private String rt_reason;

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

    public String getSo_code() {
        return so_code;
    }

    public void setSo_code(String so_code) {
        this.so_code = so_code;
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

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
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

    public Date getRt_date() {
        return rt_date;
    }

    public void setRt_date(Date rt_date) {
        this.rt_date = rt_date;
    }

    public String getRt_reason() {
        return rt_reason;
    }

    public void setRt_reason(String rt_reason) {
        this.rt_reason = rt_reason;
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
        return "RtSalse{" +
                "rt_code='" + rt_code + '\'' +
                ", rt_name='" + rt_name + '\'' +
                ", so_code='" + so_code + '\'' +
                ", client_id=" + client_id +
                ", client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_nick='" + client_nick + '\'' +
                ", warehouse_id=" + warehouse_id +
                ", warehouse_code='" + warehouse_code + '\'' +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", location_id=" + location_id +
                ", location_code='" + location_code + '\'' +
                ", location_name='" + location_name + '\'' +
                ", area_id=" + area_id +
                ", area_code='" + area_code + '\'' +
                ", area_name='" + area_name + '\'' +
                ", rt_date=" + rt_date +
                ", rt_reason='" + rt_reason + '\'' +
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
