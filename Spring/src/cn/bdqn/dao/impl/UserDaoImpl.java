package cn.bdqn.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bdqn.dao.UserDao;
import cn.bdqn.entity.User;



/**
 * 用户DAO类，实现UserDao接口，负责User类的持久化操作
 */
@Repository("userDao")//相当于为UserDaoImpl 创建了一个userDao的实例对象
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		// 这里并未实现完整的数据库操作，仅为说明问题
		System.out.println("保存用户信息到数据库");
	}
}