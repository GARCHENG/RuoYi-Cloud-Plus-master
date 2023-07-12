package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductCategoryMapper;
import com.ruoyi.system.domain.OffiProductCategory;
import com.ruoyi.system.service.IOffiProductCategoryService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductCategoryServiceImpl extends ServiceImpl<OffiProductCategoryMapper, OffiProductCategory> implements IOffiProductCategoryService
{
    @Autowired
    private OffiProductCategoryMapper offiProductCategoryMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productCategoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProductCategory selectOffiProductCategoryById(Long productCategoryId)
    {
        return offiProductCategoryMapper.selectOffiProductCategoryById(productCategoryId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProductCategory> selectOffiProductCategoryList(OffiProductCategory offiProductCategory)
    {
        return offiProductCategoryMapper.selectOffiProductCategoryList(offiProductCategory);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProductCategory(OffiProductCategory offiProductCategory)
    {
        return offiProductCategoryMapper.insertOffiProductCategory(offiProductCategory);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProductCategory(OffiProductCategory offiProductCategory)
    {
        return offiProductCategoryMapper.updateOffiProductCategory(offiProductCategory);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productCategoryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductCategoryByIds(Long[] productCategoryIds)
    {
        return offiProductCategoryMapper.deleteOffiProductCategoryByIds(productCategoryIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productCategoryId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductCategoryById(Long productCategoryId)
    {
        return offiProductCategoryMapper.deleteOffiProductCategoryById(productCategoryId);
    }
}
