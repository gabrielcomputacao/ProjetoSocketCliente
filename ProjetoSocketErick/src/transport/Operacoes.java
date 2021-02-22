package transport;

import java.io.Serializable;

import enumOperacoes.EnumOp;

public class Operacoes implements Serializable {
	
	private final EnumOp operacoesCal;
	private final float valor1;
	private final float valor2;
	
	
	public Operacoes(EnumOp operacoesCal, float valor1, float valor2) {
		this.operacoesCal = operacoesCal;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	
	
	
	
	public EnumOp getOperacoesCal() {
		return operacoesCal;
	}
	
	public float getValor1() {
		return valor1;
	}
	
	public float getValor2() {
		return valor2;
	}
	
	
	
}
