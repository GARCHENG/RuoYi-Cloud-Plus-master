package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductParamTypeMapper;
import com.ruoyi.system.domain.OffiProductParamType;
import com.ruoyi.system.service.IOffiProductParamTypeService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductParamTypeServiceImpl extends ServiceImpl<OffiProductParamTypeMapper, OffiProductParamType> implements IOffiProductParamTypeService
{
    @Autowired
    private OffiProductParamTypeMapper offiProductParamTypeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productParamTypeId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductParamType selectOffiProductParamTypeById(Long productParamTypeId)
    {
        return offiProductParamTypeMapper.selectOffiProductParamTypeById(productParamTypeId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductParamType> selectOffiProductParamTypeList(OffiProductParamType offiProductParamType)
    {
        return offiProductParamTypeMapper.selectOffiProductParamTypeList(offiProductParamType);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductParamType(OffiProductParamType offiProductParamType)
    {
        return offiProductParamTypeMapper.insertOffiProductParamType(offiProductParamType);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductParamType(OffiProductParamType offiProductParamType)
    {
        return offiProductParamTypeMapper.updateOffiProductParamType(offiProductParamType);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productParamTypeIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductParamTypeByIds(Long[] productParamTypeIds)
    {
        return offiProductParamTypeMapper.deleteOffiProductParamTypeByIds(productParamTypeIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productParamTypeId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductParamTypeById(Long productParamTypeId)
    {
        return offiProductParamTypeMapper.deleteOffiProductParamTypeById(productParamTypeId);
    }
}
