package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerServices {

    public void Save(Customer customer) {
        System.out.println("Saves to db: " + customer.firstName);
    }
}

