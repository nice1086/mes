package com.ktg.mes.md.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class WorkShopSet {
    /** 车间编码 */
    @Excel(name = "车间编码")
    @NotBlank(message = "车间编码不允许为空")
    private String workshop_code;

    /** 车间名称 */
    @Excel(name = "车间名称")
    @NotBlank(message = "车间名称不允许为空")
    private String workshop_name;

    /** 面积 */
    @Excel(name = "面积")
    private String area;

    /** 负责人 */
    @Excel(name = "负责人")
    private String charge;

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

}
