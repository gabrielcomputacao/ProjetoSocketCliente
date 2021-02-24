package enumOperacoes;

public enum EnumOp {

	SOMAR("SOMAR"),
	SUBTRAIR("SUBTRAIR"),
	MULTIPLICAR("MULTIPLICAR"),
	DIVIDIR("DIVIDIR");
	
	private final String operando;

	
	private EnumOp(String operando) {
		this.operando = operando;
	}

	public String getOperando() {
		return operando;
	}
	
	
	
}
