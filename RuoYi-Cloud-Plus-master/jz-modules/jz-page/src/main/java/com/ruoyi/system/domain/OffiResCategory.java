package com.ruoyi.system.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.*;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 offi_res_category
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Accessors(chain = true)
@TableName("offi_res_category")
public class OffiResCategory{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @TableId(value = "res_category_id", type = IdType.AUTO)
    private Long resCategoryId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String resCategoryName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String resCategoryDescribe;


}
