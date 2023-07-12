package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiResCategory;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiResCategoryService extends IServicePlus<OffiResCategory> {
    /**
     * 查询【请填写功能名称】
     *
     * @param resCategoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiResCategory selectOffiResCategoryById(Long resCategoryId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiResCategory> selectOffiResCategoryList(OffiResCategory offiResCategory);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiResCategory(OffiResCategory offiResCategory);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiResCategory(OffiResCategory offiResCategory);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param resCategoryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiResCategoryByIds(Long[] resCategoryIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param resCategoryId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiResCategoryById(Long resCategoryId);
}
