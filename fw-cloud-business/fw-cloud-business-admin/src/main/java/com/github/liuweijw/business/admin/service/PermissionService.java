package com.github.liuweijw.business.admin.service;

import java.util.Set;

/**
 * 权限服务
 * 
 * @author liuweijw
 *
 */
public interface PermissionService {

	/**
     * 通过角色获取菜单权限列表
     *
     * @param roleCode 角色
     * @return 权限列表
     */
    Set<String> findMenuPermissions(String roleCode);
    
}
