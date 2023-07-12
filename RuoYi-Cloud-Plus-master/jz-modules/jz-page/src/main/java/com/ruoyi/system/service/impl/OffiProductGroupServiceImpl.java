package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductGroupMapper;
import com.ruoyi.system.domain.OffiProductGroup;
import com.ruoyi.system.service.IOffiProductGroupService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductGroupServiceImpl extends ServiceImpl<OffiProductGroupMapper, OffiProductGroup> implements IOffiProductGroupService
{
    @Autowired
    private OffiProductGroupMapper offiProductGroupMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productGroupId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductGroup selectOffiProductGroupById(Long productGroupId)
    {
        return offiProductGroupMapper.selectOffiProductGroupById(productGroupId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductGroup> selectOffiProductGroupList(OffiProductGroup offiProductGroup)
    {
        return offiProductGroupMapper.selectOffiProductGroupList(offiProductGroup);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductGroup(OffiProductGroup offiProductGroup)
    {
        return offiProductGroupMapper.insertOffiProductGroup(offiProductGroup);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductGroup 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductGroup(OffiProductGroup offiProductGroup)
    {
        return offiProductGroupMapper.updateOffiProductGroup(offiProductGroup);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productGroupIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductGroupByIds(Long[] productGroupIds)
    {
        return offiProductGroupMapper.deleteOffiProductGroupByIds(productGroupIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productGroupId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductGroupById(Long productGroupId)
    {
        return offiProductGroupMapper.deleteOffiProductGroupById(productGroupId);
    }
}
