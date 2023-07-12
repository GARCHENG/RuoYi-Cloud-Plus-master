package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OffiProductGroup;
import com.ruoyi.common.core.web.page.IServicePlus;
/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IOffiProductGroupService extends IServicePlus<OffiProductGroup> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productGroupId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductGroup selectOffiProductGroupById(Long productGroupId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductGroup> selectOffiProductGroupList(OffiProductGroup offiProductGroup);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductGroup(OffiProductGroup offiProductGroup);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductGroup(OffiProductGroup offiProductGroup);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productGroupIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductGroupByIds(Long[] productGroupIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productGroupId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductGroupById(Long productGroupId);
}
