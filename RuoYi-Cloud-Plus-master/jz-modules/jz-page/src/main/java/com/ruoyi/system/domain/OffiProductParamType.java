package com.ruoyi.system.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.*;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 offi_product_param_type
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Accessors(chain = true)
@TableName("offi_product_param_type")
public class OffiProductParamType {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @TableId(value = "product_param_type_id", type = IdType.AUTO)
    private Long productParamTypeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productParamName;


}
