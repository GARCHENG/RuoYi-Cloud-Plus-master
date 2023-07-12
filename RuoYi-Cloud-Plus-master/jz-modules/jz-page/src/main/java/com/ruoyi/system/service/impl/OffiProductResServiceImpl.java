package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductResMapper;
import com.ruoyi.system.domain.OffiProductRes;
import com.ruoyi.system.service.IOffiProductResService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductResServiceImpl extends ServiceImpl<OffiProductResMapper, OffiProductRes> implements IOffiProductResService
{
    @Autowired
    private OffiProductResMapper offiProductResMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productResId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductRes selectOffiProductResById(Long productResId)
    {
        return offiProductResMapper.selectOffiProductResById(productResId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductRes> selectOffiProductResList(OffiProductRes offiProductRes)
    {
        return offiProductResMapper.selectOffiProductResList(offiProductRes);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductRes(OffiProductRes offiProductRes)
    {
        return offiProductResMapper.insertOffiProductRes(offiProductRes);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRes 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductRes(OffiProductRes offiProductRes)
    {
        return offiProductResMapper.updateOffiProductRes(offiProductRes);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productResIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductResByIds(Long[] productResIds)
    {
        return offiProductResMapper.deleteOffiProductResByIds(productResIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productResId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductResById(Long productResId)
    {
        return offiProductResMapper.deleteOffiProductResById(productResId);
    }
}
