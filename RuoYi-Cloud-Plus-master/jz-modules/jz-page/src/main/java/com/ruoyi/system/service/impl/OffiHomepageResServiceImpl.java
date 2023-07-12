package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.mapper.OffiHomepageResMapper;
import com.ruoyi.system.domain.OffiHomepageRes;
import com.ruoyi.system.service.IOffiHomepageResService;

/**
 * 用于存储官网首页的轮播图，热门产品图片地址及描述等Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class OffiHomepageResServiceImpl extends ServiceImpl<OffiHomepageResMapper, OffiHomepageRes> implements IOffiHomepageResService
{
    @Autowired
    private OffiHomepageResMapper offiHomepageResMapper;

    /**
     * 查询用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param id 用于存储官网首页的轮播图，热门产品图片地址及描述等ID
     * @return 用于存储官网首页的轮播图，热门产品图片地址及描述等
     */
    @Override
    public OffiHomepageRes selectOffiHomepageResById(Long id)
    {
        return offiHomepageResMapper.selectOffiHomepageResById(id);
    }

    /**
     * 查询用于存储官网首页的轮播图，热门产品图片地址及描述等列表
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 用于存储官网首页的轮播图，热门产品图片地址及描述等
     */
    @Override
    public List<OffiHomepageRes> selectOffiHomepageResList(OffiHomepageRes offiHomepageRes)
    {
        return offiHomepageResMapper.selectOffiHomepageResList(offiHomepageRes);
    }

    /**
     * 新增用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 结果
     */
    @Override
    public int insertOffiHomepageRes(OffiHomepageRes offiHomepageRes)
    {
        return offiHomepageResMapper.insertOffiHomepageRes(offiHomepageRes);
    }

    /**
     * 修改用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 结果
     */
    @Override
    public int updateOffiHomepageRes(OffiHomepageRes offiHomepageRes)
    {
        return offiHomepageResMapper.updateOffiHomepageRes(offiHomepageRes);
    }

    /**
     * 批量删除用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param ids 需要删除的用于存储官网首页的轮播图，热门产品图片地址及描述等ID
     * @return 结果
     */
    @Override
    public int deleteOffiHomepageResByIds(Long[] ids)
    {
        return offiHomepageResMapper.deleteOffiHomepageResByIds(ids);
    }

    /**
     * 删除用于存储官网首页的轮播图，热门产品图片地址及描述等信息
     *
     * @param id 用于存储官网首页的轮播图，热门产品图片地址及描述等ID
     * @return 结果
     */
    @Override
    public int deleteOffiHomepageResById(Long id)
    {
        return offiHomepageResMapper.deleteOffiHomepageResById(id);
    }
}
