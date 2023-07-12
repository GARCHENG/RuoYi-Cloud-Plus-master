package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiProductRParam;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiProductRParamService extends IServicePlus<OffiProductRParam> {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductRParam selectOffiProductRParamById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductRParam> selectOffiProductRParamList(OffiProductRParam offiProductRParam);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductRParam(OffiProductRParam offiProductRParam);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductRParam(OffiProductRParam offiProductRParam);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductRParamByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductRParamById(Long id);
}
