package dao;

import javax.ejb.Local;

import model.Users;

@Local
public interface UsersDao extends BaseDao<Users, Integer> {

}
