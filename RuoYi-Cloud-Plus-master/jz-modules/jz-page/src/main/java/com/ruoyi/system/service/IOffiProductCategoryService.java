package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiProductCategory;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiProductCategoryService extends IServicePlus<OffiProductCategory> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productCategoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductCategory selectOffiProductCategoryById(Long productCategoryId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductCategory> selectOffiProductCategoryList(OffiProductCategory offiProductCategory);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductCategory(OffiProductCategory offiProductCategory);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductCategory(OffiProductCategory offiProductCategory);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productCategoryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductCategoryByIds(Long[] productCategoryIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productCategoryId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductCategoryById(Long productCategoryId);
}
