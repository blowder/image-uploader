package dao;

import javax.ejb.Local;

import model.Tag;

@Local
public interface TagDao extends BaseDao<Tag, Integer> {

}
