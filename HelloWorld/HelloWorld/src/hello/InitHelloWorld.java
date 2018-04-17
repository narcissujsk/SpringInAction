package hello;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.hamcrest.core.IsInstanceOf;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor, Ordered {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof SpellChecker) {
			System.out.println("BeforeInitialization : SpellChecker" + beanName);
		}
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}