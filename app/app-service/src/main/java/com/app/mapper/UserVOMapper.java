package com.app.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.app.model.User;
import com.app.model.UserVO;

/**
 * 用户mapper
 * @author shuzheng
 * @date 2016年7月6日 下午6:05:54
 */
@Repository
public interface UserVOMapper extends UserMapper {

	UserVO selectUserWithBook(int id);
	
	List<User> selectAll(Map<String, Object> map);
	
	void insertAutoKey(User user);
	
}