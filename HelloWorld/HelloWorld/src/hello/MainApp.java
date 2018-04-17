package hello;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("hi");
		obj.getMessage();
		obj = context.getBean(HelloWorld.class);
		obj.getMessage();
	}

	@Test
	public void test001() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("hi");
		objA.setMessage("I'm object A");
		objA.getMessage();
		context.registerShutdownHook();
	}
	@Test
	public void test002() {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	}
}