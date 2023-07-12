package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiProductParam;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiProductParamService extends IServicePlus<OffiProductParam> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productParamId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductParam selectOffiProductParamById(Long productParamId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductParam> selectOffiProductParamList(OffiProductParam offiProductParam);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductParam(OffiProductParam offiProductParam);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductParam(OffiProductParam offiProductParam);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productParamIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductParamByIds(Long[] productParamIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productParamId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductParamById(Long productParamId);
}
