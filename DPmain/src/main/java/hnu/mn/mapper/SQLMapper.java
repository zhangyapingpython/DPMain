package hnu.mn.mapper;

import java.util.List;
import java.util.Map;

public interface SQLMapper {
	// 根据SQL汇总查询语句获得结果
	List<Map> selResultBySqlQuery(String sqlString);
}
