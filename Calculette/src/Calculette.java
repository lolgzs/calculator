
public class Calculette {
	private Double operande1 = 0.0;
	private Double operande2 = 0.0;
	private Operation operation = new NullOperation();

	public Double getResultat() {
		return operation.calcule(this.operande1, this.operande2);
	}

	public Calculette click(int i) {
		this.operande2 = this.operande2 * 10 + i;
		return this;
	}

	public Calculette click(String operateur) {
		this.operande1 = this.getResultat();
		this.operande2 = 0.0;
		this.operation = Operation.pourOperateur(operateur);
		return this;
	}
}
