package PostConstructPreDestroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are ready");
	}

	@PostConstruct
	public void initialize() {
		someDependency.doSomething();
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("Closing the Connection");
	}

}

@Component
class SomeDependency {
	public void doSomething() {
		System.out.println("Do something");
	}
}

@ComponentScan
@Configuration
public class PrePostAnnotationContextLauncherApplication {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		context.close();

	}
}
