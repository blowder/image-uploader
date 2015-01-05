package beans.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import model.Role;
import model.Users;
import dao.RoleDao;
import dao.UsersDao;

@Stateless
public class SomeEjbBean {
	@EJB
	RoleDao roleDao;
	@EJB
	UsersDao userDao;

	public SomeEjbBean() {
		System.out.println("Hello from ejb!");
	}

	public String getMessage() {
		return "Hello World!";
	}

	public void testEntityManager() {
		roleDao.save(new Role("asdasd"));

		Users user = new Users();
		user.setEmail("troll@mail.ru");
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role("user"));
		roles.add(new Role("admin"));
		roles.add(new Role("contmen"));
		user.setRoles(roles);
		userDao.save(user);

	}
}
