package com.ktg.mes.dv.domain;

import com.ktg.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.Date;

public class Machine {
    /** 设备类型编码 */
    @Excel(name = "设备类型编码")
    @NotBlank(message = "设备类型编码不能为空")
    private String machinery_type_code;

    /** 设备类型名称 */
    @Excel(name = "设备类型名称")
    @NotBlank(message = "设备类型名称不能为空")
    private String machinery_type_name;

    /** 父类型ID */
    @Excel(name = "父类型ID")
    private BigInteger parent_type_id;

    /** 所有父节点ID */
    @Excel(name = "所有父节点ID")
    private String ancestors;

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
}
