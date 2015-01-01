package dao.impl;

import javax.ejb.Stateless;

import dao.ImageDao;
import model.Image;
@Stateless
public class ImageDaoImpl extends BaseDaoImpl<Image, Integer> implements
		ImageDao {
  
	public ImageDaoImpl() {
		super(Image.class);
	}

}
