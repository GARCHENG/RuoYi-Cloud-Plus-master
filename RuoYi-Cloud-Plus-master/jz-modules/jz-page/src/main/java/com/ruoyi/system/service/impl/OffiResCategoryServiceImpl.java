package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiResCategoryMapper;
import com.ruoyi.system.domain.OffiResCategory;
import com.ruoyi.system.service.IOffiResCategoryService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiResCategoryServiceImpl extends ServiceImpl<OffiResCategoryMapper, OffiResCategory> implements IOffiResCategoryService
{
    @Autowired
    private OffiResCategoryMapper offiResCategoryMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param resCategoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiResCategory selectOffiResCategoryById(Long resCategoryId)
    {
        return offiResCategoryMapper.selectOffiResCategoryById(resCategoryId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiResCategory> selectOffiResCategoryList(OffiResCategory offiResCategory)
    {
        return offiResCategoryMapper.selectOffiResCategoryList(offiResCategory);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiResCategory(OffiResCategory offiResCategory)
    {
        return offiResCategoryMapper.insertOffiResCategory(offiResCategory);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiResCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiResCategory(OffiResCategory offiResCategory)
    {
        return offiResCategoryMapper.updateOffiResCategory(offiResCategory);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param resCategoryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiResCategoryByIds(Long[] resCategoryIds)
    {
        return offiResCategoryMapper.deleteOffiResCategoryByIds(resCategoryIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param resCategoryId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiResCategoryById(Long resCategoryId)
    {
        return offiResCategoryMapper.deleteOffiResCategoryById(resCategoryId);
    }
}
