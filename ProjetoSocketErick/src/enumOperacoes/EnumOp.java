package enumOperacoes;

public enum EnumOp {

	SOMAR("soma"),
	SUBTRAIR("sub"),
	MULTIPLICAR("mult"),
	DIVIDIR("div");
	
	private final String operando;

	private EnumOp(String operando) {
		this.operando = operando;
	}

	public String getOperando() {
		return operando;
	}
	
	
	
}
