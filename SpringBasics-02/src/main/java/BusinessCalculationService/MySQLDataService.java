package BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
}
