package Concrete;

import Abstract.CustomerCheckServices;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckServices {


    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }

}
