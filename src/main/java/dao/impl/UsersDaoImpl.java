package dao.impl;

import javax.ejb.Stateless;

import dao.UsersDao;
import model.Users;

@Stateless
public class UsersDaoImpl extends BaseDaoImpl<Users, Integer> implements
		UsersDao {

	public UsersDaoImpl() {
		super(Users.class);
	}

}
