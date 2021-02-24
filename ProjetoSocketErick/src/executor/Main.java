package executor;

import java.net.Socket;

import controller.GerenciadorRequisicoesCalc;
import servidor.ServerSock;

public class Main {

	public static void main(String[] args) {
		
		ServerSock servidorCalculadoraProjeto = new ServerSock();
		servidorCalculadoraProjeto.createServer(8080);
		
		boolean fluxo=true;
		
		while(fluxo) {
		Socket socketCal = servidorCalculadoraProjeto.esperaConexao();
		GerenciadorRequisicoesCalc calculadora = new GerenciadorRequisicoesCalc(socketCal);
		calculadora.start();
		
		}
		
		
		
		
		

	}

}
