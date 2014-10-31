package org.mybatis.jpetstore.persistence;

import org.mybatis.jpetstore.domain.User;

public interface UserMapper {
	public User getUser(Integer userId);
}
