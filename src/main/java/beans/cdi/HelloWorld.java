package beans.cdi;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import beans.ejb.SomeEjbBean;

@Named("helloWorld")
@RequestScoped
public class HelloWorld {
	@Inject
	SomeEjbBean ejbBean;
    public HelloWorld() {
        System.out.println("Hello from CDI");
    }
    public String getMessage() {
    	ejbBean.testEntityManager();
        return "Hello World!";
    }
}