package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ProviderManager {

    /** 客户编码 */
    @Excel(name = "客户编码")
    @NotBlank(message = "客户编码不允许为空")
    private String client_code;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    @NotBlank(message = "供应商编码不允许为空")
    private String vendor_code;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    @NotBlank(message = "供应商名称不允许为空")
    private String vendor_name;

    /** 供应商简称 */
    @Excel(name = "供应商简称")
    private String vendor_nick;

    /** 供应商英文名称 */
    @Excel(name = "供应商英文名称")
    private String vendor_en;

    /** 供应商简介 */
    @Excel(name = "供应商简介")
    private String vendor_des;

    /** 供应商LOGO地址 */
    @Excel(name = "供应商LOGO地址")
    private String vendor_logo;

    /** 供应商等级 */
    @Excel(name = "供应商等级")
    private String vendor_level;

    /** 供应商评分 */
    @Excel(name = "供应商评分")
    private int vendor_score;

    /** 供应商地址 */
    @Excel(name = "供应商地址")
    private String address;

    /** 供应商官网地址 */
    @Excel(name = "供应商官网地址")
    private String website;

    /** 供应商邮箱地址 */
    @Excel(name = "供应商邮箱地址")
    private String email;

    /** 供应商电话 */
    @Excel(name = "供应商电话")
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

    public String getVendor_en() {
        return vendor_en;
    }

    public void setVendor_en(String vendor_en) {
        this.vendor_en = vendor_en;
    }

    public String getVendor_des() {
        return vendor_des;
    }

    public void setVendor_des(String vendor_des) {
        this.vendor_des = vendor_des;
    }

    public String getVendor_logo() {
        return vendor_logo;
    }

    public void setVendor_logo(String vendor_logo) {
        this.vendor_logo = vendor_logo;
    }

    public String getVendor_level() {
        return vendor_level;
    }

    public void setVendor_level(String vendor_level) {
        this.vendor_level = vendor_level;
    }

    public int getVendor_score() {
        return vendor_score;
    }

    public void setVendor_score(int vendor_score) {
        this.vendor_score = vendor_score;
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
        return "ProviderManager{" +
                "client_code='" + client_code + '\'' +
                ", vendor_code='" + vendor_code + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", vendor_nick='" + vendor_nick + '\'' +
                ", vendor_en='" + vendor_en + '\'' +
                ", vendor_des='" + vendor_des + '\'' +
                ", vendor_logo='" + vendor_logo + '\'' +
                ", vendor_level='" + vendor_level + '\'' +
                ", vendor_score=" + vendor_score +
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
