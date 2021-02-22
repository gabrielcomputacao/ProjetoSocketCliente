package controller;

import java.net.Socket;

import javax.swing.JOptionPane;

public class GerenciadorRequisicoesCalc extends Thread {

	private Socket socketReqCalculadora;

	public GerenciadorRequisicoesCalc(Socket socketReqCalculadora) {
		this.socketReqCalculadora = socketReqCalculadora;
	}
	
	@Override
	public void run() {
		
		JOptionPane.showInternalMessageDialog(null,"Calculadora para : " + socketReqCalculadora.getInetAddress().getHostAddress());
		
		
	}
	
	
	
	
	
	

	public Socket getSocketReqCalculadora() {
		return socketReqCalculadora;
	}

	public void setSocketReqCalculadora(Socket socketReqCalculadora) {
		this.socketReqCalculadora = socketReqCalculadora;
	}
	
	
	
	
}
