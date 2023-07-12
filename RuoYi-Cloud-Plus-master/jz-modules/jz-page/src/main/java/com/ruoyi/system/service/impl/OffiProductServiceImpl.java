package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiProductMapper;
import com.ruoyi.system.domain.OffiProduct;
import com.ruoyi.system.service.IOffiProductService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiProductServiceImpl extends ServiceImpl<OffiProductMapper, OffiProduct> implements IOffiProductService
{
    @Autowired
    private OffiProductMapper offiProductMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param productId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OffiProduct selectOffiProductById(Long productId)
    {
        return offiProductMapper.selectOffiProductById(productId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProduct 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OffiProduct> selectOffiProductList(OffiProduct offiProduct)
    {
        return offiProductMapper.selectOffiProductList(offiProduct);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProduct 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOffiProduct(OffiProduct offiProduct)
    {
        return offiProductMapper.insertOffiProduct(offiProduct);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProduct 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOffiProduct(OffiProduct offiProduct)
    {
        return offiProductMapper.updateOffiProduct(offiProduct);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductByIds(Long[] productIds)
    {
        return offiProductMapper.deleteOffiProductByIds(productIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param productId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOffiProductById(Long productId)
    {
        return offiProductMapper.deleteOffiProductById(productId);
    }
}
