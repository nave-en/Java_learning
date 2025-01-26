package BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 55, 44, 33, 22, 11 };
	}

}
