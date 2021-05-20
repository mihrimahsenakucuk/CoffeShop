package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckServices;
import Abstract.PersonCheckServices;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckServices customerCheckService;

    public StarbucksCustomerManager(CustomerCheckServices customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) {


        if(PersonCheckServices.checkIfRealPerson(customer)) {
            super.Save(customer);
        }
        else {
            System.out.println("Not a valid person");
        }




    }





}

