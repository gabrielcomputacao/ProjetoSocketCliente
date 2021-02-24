package transport;

import java.io.Serializable;

import enumOperacoes.EnumOp;

public class Operacoes implements Serializable {
	
	private final EnumOp operacoesCal;
	private final String valor1;
	private final String valor2;
	
	
	public Operacoes(EnumOp operacoesCal, String valor1, String valor2) {
		this.operacoesCal = operacoesCal;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	
	public Operacoes() {
		this.operacoesCal = null;
		this.valor1 = "";
		this.valor2 = "";
		
	}
	
	
	
	public EnumOp getOperacoesCal() {
		return operacoesCal;
	}
	
	public String getValor1() {
		return valor1;
	}
	
	public String getValor2() {
		return valor2;
	}






	
	
	
	
}
