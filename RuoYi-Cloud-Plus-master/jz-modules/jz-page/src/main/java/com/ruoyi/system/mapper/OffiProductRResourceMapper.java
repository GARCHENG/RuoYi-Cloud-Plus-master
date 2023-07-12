package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OffiProductRResource;
import com.ruoyi.common.core.web.page.BaseMapperPlus;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface OffiProductRResourceMapper extends BaseMapperPlus<OffiProductRResource> {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductRResource selectOffiProductRResourceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductRResource> selectOffiProductRResourceList(OffiProductRResource offiProductRResource);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductRResource(OffiProductRResource offiProductRResource);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductRResource 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductRResource(OffiProductRResource offiProductRResource);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductRResourceById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOffiProductRResourceByIds(Long[] ids);
}
