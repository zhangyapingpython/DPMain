package hnu.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hnu.mn.mapper.UserLoginMapper;
import hnu.mn.mapper.UserPermissionMapper;
import hnu.mn.pojo.SysPermission;
import hnu.mn.pojo.SysRole;
import hnu.mn.pojo.SysUser;
import hnu.mn.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Resource
	UserLoginMapper userLoginMapper;

	@Resource
	UserPermissionMapper userPermissionMapper;

	@Override
	public SysUser userLogin(SysUser loginUser) {
		// TODO Auto-generated method stub
		// 登陆成功的用户
		SysUser userLogin = userLoginMapper.selUserByUserNamePassword(loginUser);
		System.out.println("成功登陆 " + userLogin);
		if (userLogin != null) {
			// 根据用户获取权限
			SysRole roleLogin = userPermissionMapper.selRoleByUser(userLogin);
			userLogin.setSysRole(roleLogin);
			List<SysPermission> permissionsLogin = userPermissionMapper.selPermissionsByRole(roleLogin);
			roleLogin.setSysPermission(permissionsLogin);
		}

		return userLogin;
	}

}
