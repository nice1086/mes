package com.ktg.mes.pro.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Workorder {
    /** 工单编码 */
    @Excel(name = "工单编码")
    @NotBlank(message = "工单编码不能为空")
    private String workorder_code;

    /** 工单名称 */
    @Excel(name = "工单名称")
    @NotBlank(message = "工单名称不能为空")
    private String workorder_name;

    /** 来源类型 */
    @Excel(name = "来源类型")
    private String order_source;

    /** 来源单据 */
    @Excel(name = "来源单据")
    private String source_code;

    /** 产品ID产品ID */
    @Excel(name = "产品ID")
    private BigInteger product_id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private BigInteger client_id;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String client_code;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String client_name;

    /** 批次号 */
    @Excel(name = "批次号")
    private String batch_code;

    /** 需求日期 */
    @Excel(name = "需求日期")
    private Date request_date;

    /** 父工单 */
    @Excel(name = "父工单")
    private BigInteger parent_id;

    /** 所有父节点ID */
    @Excel(name = "所有父节点ID")
    private String ancestors;

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

    public String getOrder_source() {
        return order_source;
    }

    public void setOrder_source(String order_source) {
        this.order_source = order_source;
    }

    public String getSource_code() {
        return source_code;
    }

    public void setSource_code(String source_code) {
        this.source_code = source_code;
    }

    public BigInteger getProduct_id() {
        return product_id;
    }

    public void setProduct_id(BigInteger product_id) {
        this.product_id = product_id;
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

    public Date getRequest_date() {
        return request_date;
    }

    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }

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
        return "Workorder{" +
                "workorder_code='" + workorder_code + '\'' +
                ", workorder_name='" + workorder_name + '\'' +
                ", order_source='" + order_source + '\'' +
                ", source_code='" + source_code + '\'' +
                ", product_id=" + product_id +
                ", client_id=" + client_id +
                ", client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", batch_code='" + batch_code + '\'' +
                ", request_date=" + request_date +
                ", parent_id=" + parent_id +
                ", ancestors='" + ancestors + '\'' +
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
