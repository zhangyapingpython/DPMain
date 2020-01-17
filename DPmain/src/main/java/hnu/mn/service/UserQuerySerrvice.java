package hnu.mn.service;

import java.util.List;
import java.util.Map;

public interface UserQuerySerrvice {
	// 用户查询
	List<Map> userQuery(String sqlString);
}
