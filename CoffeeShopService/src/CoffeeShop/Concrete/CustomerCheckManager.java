package CoffeeShop.Concrete;

import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// Used for test purpose.
		return true;
	}
	
}
