package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckServices;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckServices {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        boolean result;
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
        try {
            result = kpsPublicSoapProxy.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase()

        }
        catch (RemoteException e) {
            result = false;
            e.printStackTrace();
        }

        return result;


    }
















}
