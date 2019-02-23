package cn.bdqn.dao;

import cn.bdqn.entity.User;



/**
 * 增加DAO接口,定义了所需的持久化方法
 */
public interface UserDao {
	public void save(User user);
}
