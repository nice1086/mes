package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class WorkStation {
    /** 工作站编码 */
    @Excel(name = "工作站编码")
    @NotBlank(message = "工作站编码不允许为空")
    private String workstation_code;

    /** 工作站名称 */
    @Excel(name = "工作站名称")
    @NotBlank(message = "工作站名称不允许为空")
    private String workstation_name;

    /** 工作站地点 */
    @Excel(name = "工作站地点")
    private String workstation_address;

    /** 所在车间ID */
    @Excel(name = "所在车间ID")
    private BigInteger workshop_id;

    /** 所在车间编码 */
    @Excel(name = "所在车间编码")
    private String workshop_code;

    /** 所在车间名称 */
    @Excel(name = "所在车间名称")
    private String workshop_name;

    /** 工序ID */
    @Excel(name = "工序ID")
    private BigInteger process_id;

    /** 工序编码 */
    @Excel(name = "工序编码")
    private String process_code;

    /** 线边库ID */
    @Excel(name = "线边库ID")
    private BigInteger warehouse_id;

    /** 线边库编码 */
    @Excel(name = "线边库编码")
    private String warehouse_code;

    /** 线边库名称 */
    @Excel(name = "线边库名称")
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

    public String getWorkstation_address() {
        return workstation_address;
    }

    public void setWorkstation_address(String workstation_address) {
        this.workstation_address = workstation_address;
    }

    public BigInteger getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(BigInteger workshop_id) {
        this.workshop_id = workshop_id;
    }

    public String getWorkshop_code() {
        return workshop_code;
    }

    public void setWorkshop_code(String workshop_code) {
        this.workshop_code = workshop_code;
    }

    public String getWorkshop_name() {
        return workshop_name;
    }

    public void setWorkshop_name(String workshop_name) {
        this.workshop_name = workshop_name;
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
        return "WorkStation{" +
                "workstation_code='" + workstation_code + '\'' +
                ", workstation_name='" + workstation_name + '\'' +
                ", workstation_address='" + workstation_address + '\'' +
                ", workshop_id=" + workshop_id +
                ", workshop_code='" + workshop_code + '\'' +
                ", workshop_name='" + workshop_name + '\'' +
                ", process_id=" + process_id +
                ", process_code='" + process_code + '\'' +
                ", warehouse_id=" + warehouse_id +
                ", warehouse_code='" + warehouse_code + '\'' +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", location_id=" + location_id +
                ", location_code='" + location_code + '\'' +
                ", location_name='" + location_name + '\'' +
                ", area_id=" + area_id +
                ", area_code='" + area_code + '\'' +
                ", area_name='" + area_name + '\'' +
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
