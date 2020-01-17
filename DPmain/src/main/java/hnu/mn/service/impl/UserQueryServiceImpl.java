package hnu.mn.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hnu.mn.mapper.SQLMapper;
import hnu.mn.service.UserQuerySerrvice;

@Service
public class UserQueryServiceImpl implements UserQuerySerrvice {
	@Resource
	SQLMapper sQLMapper;

	@Override
	public List<Map> userQuery(String sqlString) {
		// TODO Auto-generated method stub

		return sQLMapper.selResultBySqlQuery(sqlString);
	}

}
