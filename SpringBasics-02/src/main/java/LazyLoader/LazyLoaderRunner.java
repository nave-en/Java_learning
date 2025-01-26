package LazyLoader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Class B constructor");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Lazy loading happens");
	}
}

@Configuration
@ComponentScan
public class LazyLoaderRunner {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(LazyLoaderRunner.class);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("Initialization of context is completed");
		context.getBean(ClassB.class).doSomething();
	}
}
