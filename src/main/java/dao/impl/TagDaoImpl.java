package dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import dao.TagDao;
import model.Tag;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TagDaoImpl extends BaseDaoImpl<Tag, Integer> implements TagDao {

	public TagDaoImpl() {
		super(Tag.class);
	}

}
