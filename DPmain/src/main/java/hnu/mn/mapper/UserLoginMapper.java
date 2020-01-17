package hnu.mn.mapper;

import hnu.mn.pojo.SysUser;

public interface UserLoginMapper {
	// 根据帐户和密码查找用户
	SysUser selUserByUserNamePassword(SysUser sysUser);
}
