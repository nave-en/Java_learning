package BusinessCalculationService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationServiceRunner {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceRunner.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
	}
}
