package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ConsumerManager {
    /** 客户编码 */
    @Excel(name = "客户编码")
    @NotBlank(message = "客户编码不允许为空")
    private String client_code;

    /** 客户名称 */
    @Excel(name = "客户名称")
    @NotBlank(message = "客户名称不允许为空")
    private String client_name;

    /** 客户简称 */
    @Excel(name = "客户简称")
    private String client_nick;

    /** 客户英文名称 */
    @Excel(name = "客户英文名称")
    private String client_en;

    /** 客户简介 */
    @Excel(name = "客户简介")
    private String client_des;

    /** 客户LOGO地址 */
    @Excel(name = "客户LOGO地址")
    private String client_logo;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String client_type;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String address;

    /** 客户官网地址 */
    @Excel(name = "客户官网地址")
    private String website;

    /** 客户邮箱地址 */
    @Excel(name = "客户邮箱地址")
    private String email;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String tel;

    /** 联系人1 */
    @Excel(name = "联系人1")
    private String contact1;

    /** 联系人1-电话 */
    @Excel(name = "联系人1-电话")
    private String contact1_tel;

    /** 联系人1-邮箱 */
    @Excel(name = "联系人1-邮箱")
    private String contact1_email;

    /** 联系人2 */
    @Excel(name = "联系人2")
    private String contact2;

    /** 联系人2-电话 */
    @Excel(name = "联系人2-电话")
    private String contact2_tel;

    /** 联系人2-邮箱 */
    @Excel(name = "联系人2-邮箱")
    private String contact2_email;

    /** 统一社会信用代码 */
    @Excel(name = "统一社会信用代码")
    private String credit_code;

    /** 是否启用 */
    @Excel(name = "是否启用")
    @NotBlank(message = "不能为空")
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

    public String getClient_en() {
        return client_en;
    }

    public void setClient_en(String client_en) {
        this.client_en = client_en;
    }

    public String getClient_des() {
        return client_des;
    }

    public void setClient_des(String client_des) {
        this.client_des = client_des;
    }

    public String getClient_logo() {
        return client_logo;
    }

    public void setClient_logo(String client_logo) {
        this.client_logo = client_logo;
    }

    public String getClient_type() {
        return client_type;
    }

    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact1_tel() {
        return contact1_tel;
    }

    public void setContact1_tel(String contact1_tel) {
        this.contact1_tel = contact1_tel;
    }

    public String getContact1_email() {
        return contact1_email;
    }

    public void setContact1_email(String contact1_email) {
        this.contact1_email = contact1_email;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContact2_tel() {
        return contact2_tel;
    }

    public void setContact2_tel(String contact2_tel) {
        this.contact2_tel = contact2_tel;
    }

    public String getContact2_email() {
        return contact2_email;
    }

    public void setContact2_email(String contact2_email) {
        this.contact2_email = contact2_email;
    }

    public String getCredit_code() {
        return credit_code;
    }

    public void setCredit_code(String credit_code) {
        this.credit_code = credit_code;
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
        return "ConsumerManager{" +
                "client_code='" + client_code + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_nick='" + client_nick + '\'' +
                ", client_en='" + client_en + '\'' +
                ", client_des='" + client_des + '\'' +
                ", client_logo='" + client_logo + '\'' +
                ", client_type='" + client_type + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", contact1='" + contact1 + '\'' +
                ", contact1_tel='" + contact1_tel + '\'' +
                ", contact1_email='" + contact1_email + '\'' +
                ", contact2='" + contact2 + '\'' +
                ", contact2_tel='" + contact2_tel + '\'' +
                ", contact2_email='" + contact2_email + '\'' +
                ", credit_code='" + credit_code + '\'' +
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
