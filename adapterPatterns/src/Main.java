

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		PersonManager personManager = new PersonManager(new MernisServiceAdapter());
		Person person = new Person();
		person.setName("RECEP");
		person.setLastName("BAYINDIR");
		person.setTcNo("11111111111");
		person.setYear(1997);

		personManager.register(person);

	}

}
