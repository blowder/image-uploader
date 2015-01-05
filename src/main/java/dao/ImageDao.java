package dao;

import javax.ejb.Local;

import model.Image;

@Local
public interface ImageDao extends BaseDao<Image, Integer> {

}
