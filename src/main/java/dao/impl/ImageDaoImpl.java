package dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import dao.ImageDao;
import model.Image;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ImageDaoImpl extends BaseDaoImpl<Image, Integer> implements
		ImageDao {

	public ImageDaoImpl() {
		super(Image.class);
	}

}
