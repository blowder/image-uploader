package dao.impl;

import javax.ejb.Stateless;

import model.Groups;
import dao.GroupsDao;
@Stateless
public class GroupDaoImpl extends BaseDaoImpl<Groups, Integer> implements
		GroupsDao {
   
	public GroupDaoImpl() {
		super(Groups.class);
	}

}
