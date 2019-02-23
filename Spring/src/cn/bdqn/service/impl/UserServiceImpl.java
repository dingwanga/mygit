package cn.bdqn.service.impl;

import org.springframework.stereotype.Service;

import cn.bdqn.dao.UserDao;
import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;
/**
 * 用户业务类,实现对User功能的业务管理
 */
@Service("userService")//相当于为UserServiceImpl 创建了一个userService的实例对象
public class UserServiceImpl implements UserService {

	// 声明接口类型的引用,和具体实现类解耦合,这个dao属性为空，所以要bean注入实例对象
	private UserDao dao;
	// 无参构造
	public UserServiceImpl() {
	}

	// 用于为dao属性赋值的构造方法
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
	}
}