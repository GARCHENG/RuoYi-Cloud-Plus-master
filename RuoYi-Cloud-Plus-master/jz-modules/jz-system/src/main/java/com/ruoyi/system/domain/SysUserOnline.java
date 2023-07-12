package com.ruoyi.system.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 当前在线会话
 *
 * @author ruoyi
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class SysUserOnline {
    /**
     * 会话编号
     */
    private String tokenId;
    
    /**
     * 用户名称
     */
    private String userName;
    
    /**
     * 登录IP地址
     */
    private String ipaddr;
    
    /**
     * 登录地址
     */
    private String loginLocation;
    
    /**
     * 浏览器类型
     */
    private String browser;
    
    /**
     * 操作系统
     */
    private String os;
    
    /**
     * 登录时间
     */
    private Long loginTime;
    
}
