import java.util.HashMap;

public abstract class Operation {
	public abstract Double calcule(Double operande1, Double operande2);

	public static Operation pourOperateur(String operateur) {	
		HashMap<String, Operation> operations = new HashMap<String, Operation>();
		operations.put("+", new Addition());
		operations.put("-", new Soustraction());
		operations.put("*", new Multiplication());
		operations.put("/", new Division());
		
		return operations.get(operateur);
	}
}