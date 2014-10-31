package org.mybatis.jpetstore.service;

import org.mybatis.jpetstore.domain.User;
import org.mybatis.jpetstore.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserById(Integer id) {
		return userMapper.getUser(id);
	}
}
