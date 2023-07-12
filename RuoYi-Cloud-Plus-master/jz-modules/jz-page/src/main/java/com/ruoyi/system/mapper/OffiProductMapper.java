package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OffiProduct;
import com.ruoyi.common.core.web.page.BaseMapperPlus;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface OffiProductMapper extends BaseMapperPlus<OffiProduct> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProduct selectOffiProductById(Long productId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProduct 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProduct> selectOffiProductList(OffiProduct offiProduct);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProduct 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProduct(OffiProduct offiProduct);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProduct 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProduct(OffiProduct offiProduct);

    /**
     * 删除【请填写功能名称】
     *
     * @param productId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductById(Long productId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOffiProductByIds(Long[] productIds);
}
