package dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import dao.UsersDao;
import model.Users;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsersDaoImpl extends BaseDaoImpl<Users, Integer> implements
		UsersDao {

	public UsersDaoImpl() {
		super(Users.class);
	}

}
