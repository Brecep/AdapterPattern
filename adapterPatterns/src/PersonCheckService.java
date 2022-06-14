

import java.rmi.RemoteException;

public interface PersonCheckService {
	boolean checkIfRealPerson(Person person) throws NumberFormatException, RemoteException;
}
