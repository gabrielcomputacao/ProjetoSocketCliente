package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

import transport.Operacoes;

public class GerenciadorRequisicoesCalc extends Thread {

	private final Socket socketReqCalculadora;

	public GerenciadorRequisicoesCalc(Socket socketReqCalculadora) {
		this.socketReqCalculadora = socketReqCalculadora;
	}
	
	@Override
	public void run() {
		
		JOptionPane.showInternalMessageDialog(null,"Calculadora para : " + socketReqCalculadora.getInetAddress().getHostAddress());
		
		try {
			ObjectOutputStream output = new ObjectOutputStream(socketReqCalculadora.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socketReqCalculadora.getInputStream());
			
				float result=0;
				
				Operacoes op = (Operacoes) input.readObject();
				
				switch(op.getOperacoesCal()) {
				
				case SOMAR:{
					result = (Float.parseFloat(op.getValor1())) + (Float.parseFloat(op.getValor2()));
					break;
				}
				case SUBTRAIR:{
					result = (Float.parseFloat(op.getValor1())) - (Float.parseFloat(op.getValor2()));
					break;
				}
				case MULTIPLICAR:{
					result = (Float.parseFloat(op.getValor1())) * (Float.parseFloat(op.getValor2()));
					break;
				}
				case DIVIDIR:{
					result = (Float.parseFloat(op.getValor1())) / (Float.parseFloat(op.getValor2()));
					break;
				}
				default:{
					System.out.println("Não tem essa opção de operação!!");
				}
				
			}
				
				output.writeObject(result);
				output.flush();
				
				
				output.close();
				input.close();
				
			socketReqCalculadora.close();
			
		} catch (IOException e) {
			System.out.println("Error nos out e intput: \n" + e+"\n");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	

	public Socket getSocketReqCalculadora() {
		return socketReqCalculadora;
	}

	
	
	
	
}
