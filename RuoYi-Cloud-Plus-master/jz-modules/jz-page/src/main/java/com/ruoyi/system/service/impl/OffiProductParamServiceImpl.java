package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductParamMapper;
import com.ruoyi.system.domain.OffiProductParam;
import com.ruoyi.system.service.IOffiProductParamService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductParamServiceImpl extends ServiceImpl<OffiProductParamMapper, OffiProductParam> implements IOffiProductParamService
{
    @Autowired
    private OffiProductParamMapper offiProductParamMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productParamId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductParam selectOffiProductParamById(Long productParamId)
    {
        return offiProductParamMapper.selectOffiProductParamById(productParamId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductParam> selectOffiProductParamList(OffiProductParam offiProductParam)
    {
        return offiProductParamMapper.selectOffiProductParamList(offiProductParam);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductParam(OffiProductParam offiProductParam)
    {
        return offiProductParamMapper.insertOffiProductParam(offiProductParam);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductParam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductParam(OffiProductParam offiProductParam)
    {
        return offiProductParamMapper.updateOffiProductParam(offiProductParam);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productParamIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductParamByIds(Long[] productParamIds)
    {
        return offiProductParamMapper.deleteOffiProductParamByIds(productParamIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productParamId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductParamById(Long productParamId)
    {
        return offiProductParamMapper.deleteOffiProductParamById(productParamId);
    }
}
