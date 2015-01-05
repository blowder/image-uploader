package beans.cdi;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import beans.ejb.SomeEjbBean;

@Named("helloWorld")
@RequestScoped
public class HelloWorld {
	@EJB
	SomeEjbBean ejbBean;

	public HelloWorld() {
		System.out.println("Hello from CDI");
	}

	public String getMessage() {
		ejbBean.testEntityManager();
		return "Hello World!";
	}
}