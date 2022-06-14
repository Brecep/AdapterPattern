

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Person person) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(person.getTcNo()), 
				person.getName(), 
				person.getLastName(), 
				person.getYear());
	}

}
