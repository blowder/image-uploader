package dao;

import javax.ejb.Local;

import model.Groups;

@Local
public interface GroupsDao extends BaseDao<Groups, Integer> {

}
