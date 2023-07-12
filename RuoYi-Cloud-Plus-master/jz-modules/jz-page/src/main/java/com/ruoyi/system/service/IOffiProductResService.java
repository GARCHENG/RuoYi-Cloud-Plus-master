package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiProductRes;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiProductResService extends IServicePlus<OffiProductRes> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productResId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductRes selectOffiProductResById(Long productResId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductRes> selectOffiProductResList(OffiProductRes offiProductRes);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductRes(OffiProductRes offiProductRes);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductRes(OffiProductRes offiProductRes);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productResIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductResByIds(Long[] productResIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productResId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductResById(Long productResId);
}
