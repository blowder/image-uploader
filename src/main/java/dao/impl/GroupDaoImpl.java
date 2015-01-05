package dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import model.Groups;
import dao.GroupsDao;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GroupDaoImpl extends BaseDaoImpl<Groups, Integer> implements
		GroupsDao {

	public GroupDaoImpl() {
		super(Groups.class);
	}

}
