package dao.impl;

import javax.ejb.Stateless;

import model.Role;
import dao.RoleDao;

@Stateless
public class RoleDaoImpl extends BaseDaoImpl<Role, Integer> implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}

}
