package BusinessCalculationService;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationService {
	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		// super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
