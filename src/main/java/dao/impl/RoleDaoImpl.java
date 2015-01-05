package dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import model.Role;
import dao.RoleDao;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RoleDaoImpl extends BaseDaoImpl<Role, Integer> implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}

}
