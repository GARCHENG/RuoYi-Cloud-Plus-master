package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OffiHomepageRes;
import com.ruoyi.common.core.web.page.BaseMapperPlus;

/**
 * 用于存储官网首页的轮播图，热门产品图片地址及描述等Mapper接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface OffiHomepageResMapper extends BaseMapperPlus<OffiHomepageRes> {
    /**
     * 查询用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param id 用于存储官网首页的轮播图，热门产品图片地址及描述等ID
     * @return 用于存储官网首页的轮播图，热门产品图片地址及描述等
     */
    public OffiHomepageRes selectOffiHomepageResById(Long id);

    /**
     * 查询用于存储官网首页的轮播图，热门产品图片地址及描述等列表
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 用于存储官网首页的轮播图，热门产品图片地址及描述等集合
     */
    public List<OffiHomepageRes> selectOffiHomepageResList(OffiHomepageRes offiHomepageRes);

    /**
     * 新增用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 结果
     */
    public int insertOffiHomepageRes(OffiHomepageRes offiHomepageRes);

    /**
     * 修改用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param offiHomepageRes 用于存储官网首页的轮播图，热门产品图片地址及描述等
     * @return 结果
     */
    public int updateOffiHomepageRes(OffiHomepageRes offiHomepageRes);

    /**
     * 删除用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param id 用于存储官网首页的轮播图，热门产品图片地址及描述等ID
     * @return 结果
     */
    public int deleteOffiHomepageResById(Long id);

    /**
     * 批量删除用于存储官网首页的轮播图，热门产品图片地址及描述等
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOffiHomepageResByIds(Long[] ids);
}
