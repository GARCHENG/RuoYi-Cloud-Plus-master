package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductRResourceMapper;
import com.ruoyi.system.domain.OffiProductRResource;
import com.ruoyi.system.service.IOffiProductRResourceService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductRResourceServiceImpl extends ServiceImpl<OffiProductRResourceMapper, OffiProductRResource> implements IOffiProductRResourceService
{
    @Autowired
    private OffiProductRResourceMapper offiProductRResourceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductRResource selectOffiProductRResourceById(Long id)
    {
        return offiProductRResourceMapper.selectOffiProductRResourceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductRResource> selectOffiProductRResourceList(OffiProductRResource offiProductRResource)
    {
        return offiProductRResourceMapper.selectOffiProductRResourceList(offiProductRResource);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductRResource(OffiProductRResource offiProductRResource)
    {
        return offiProductRResourceMapper.insertOffiProductRResource(offiProductRResource);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductRResource(OffiProductRResource offiProductRResource)
    {
        return offiProductRResourceMapper.updateOffiProductRResource(offiProductRResource);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductRResourceByIds(Long[] ids)
    {
        return offiProductRResourceMapper.deleteOffiProductRResourceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductRResourceById(Long id)
    {
        return offiProductRResourceMapper.deleteOffiProductRResourceById(id);
    }
}
