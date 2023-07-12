package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OffiProductParamType;
import com.ruoyi.common.core.web.page.BaseMapperPlus;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface OffiProductParamTypeMapper extends BaseMapperPlus<OffiProductParamType> {
    /**
     * 查询【请填写功能名称】
     *
     * @param productParamTypeId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OffiProductParamType selectOffiProductParamTypeById(Long productParamTypeId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OffiProductParamType> selectOffiProductParamTypeList(OffiProductParamType offiProductParamType);

    /**
     * 新增【请填写功能名称】
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 结果
     */
    public int insertOffiProductParamType(OffiProductParamType offiProductParamType);

    /**
     * 修改【请填写功能名称】
     *
     * @param offiProductParamType 【请填写功能名称】
     * @return 结果
     */
    public int updateOffiProductParamType(OffiProductParamType offiProductParamType);

    /**
     * 删除【请填写功能名称】
     *
     * @param productParamTypeId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOffiProductParamTypeById(Long productParamTypeId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param productParamTypeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOffiProductParamTypeByIds(Long[] productParamTypeIds);
}
