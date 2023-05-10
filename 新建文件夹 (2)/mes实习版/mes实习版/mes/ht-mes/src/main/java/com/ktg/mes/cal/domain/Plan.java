package com.ktg.mes.cal.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Plan {
    /** 计划编号 */
    @Excel(name = "计划编号")
    @NotBlank(message = "计划编号不能为空")
    private String plan_code;

    /** 计划名称 */
    @Excel(name = "计划名称")
    @NotBlank(message = "计划名称不能为空")
    private String plan_name;

    /** 班组类型 */
    @Excel(name = "班组类型")
    private String calendar_type;

    /** 开始日期 */
    @Excel(name = "开始日期")
    private Date start_date;

    /** 结束日期 */
    @Excel(name = "结束日期")
    private Date end_date;

    /** 轮班方式 */
    @Excel(name = "轮班方式")
    private String shift_type;

    /** 倒班方式 */
    @Excel(name = "倒班方式")
    private String shift_method;

    /** 数 */
    @Excel(name = "数")
    private String shift_count;

    /** 状态 */
    @Excel(name = "状态")
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
}
