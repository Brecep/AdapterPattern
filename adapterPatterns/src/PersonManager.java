

import java.rmi.RemoteException;

public class PersonManager extends BasePersonManager{

	private PersonCheckService personCheckService;

	public PersonManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	public PersonManager() {
		super();

	}
	
	public void register(Person person) throws NumberFormatException, RemoteException {
		if(this.personCheckService.checkIfRealPerson(person))
			System.out.println("true person");
		else
			System.out.println("false person");
	}
}
