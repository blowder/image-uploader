package dao;

import javax.ejb.Local;

import model.Role;

@Local
public interface RoleDao extends BaseDao<Role, Integer> {

}
