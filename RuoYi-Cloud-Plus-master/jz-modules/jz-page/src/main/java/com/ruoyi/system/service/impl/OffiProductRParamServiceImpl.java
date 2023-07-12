package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductRParamMapper;
import com.ruoyi.system.domain.OffiProductRParam;
import com.ruoyi.system.service.IOffiProductRParamService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductRParamServiceImpl extends ServiceImpl<OffiProductRParamMapper, OffiProductRParam> implements IOffiProductRParamService
{
    @Autowired
    private OffiProductRParamMapper offiProductRParamMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductRParam selectOffiProductRParamById(Long id)
    {
        return offiProductRParamMapper.selectOffiProductRParamById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductRParam> selectOffiProductRParamList(OffiProductRParam offiProductRParam)
    {
        return offiProductRParamMapper.selectOffiProductRParamList(offiProductRParam);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductRParam(OffiProductRParam offiProductRParam)
    {
        return offiProductRParamMapper.insertOffiProductRParam(offiProductRParam);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRParam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductRParam(OffiProductRParam offiProductRParam)
    {
        return offiProductRParamMapper.updateOffiProductRParam(offiProductRParam);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductRParamByIds(Long[] ids)
    {
        return offiProductRParamMapper.deleteOffiProductRParamByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductRParamById(Long id)
    {
        return offiProductRParamMapper.deleteOffiProductRParamById(id);
    }
}
