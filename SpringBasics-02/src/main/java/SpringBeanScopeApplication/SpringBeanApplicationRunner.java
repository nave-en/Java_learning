package SpringBeanScopeApplication;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@ComponentScan
@Configuration
public class SpringBeanApplicationRunner {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(SpringBeanApplicationRunner.class);
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));

		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
	}

}
