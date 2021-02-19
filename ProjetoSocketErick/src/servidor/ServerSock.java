package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSock {

		private ServerSocket serverSocket;
		
		
		public void createServer(int port) {
			try {
				//precisa do try catch , pois faz entrada e saida de dados da placa de rede
				//nao tendo como controlar quando pode ter erro ou não
				//por isso usamos try e catch
				
				serverSocket = new ServerSocket(port);
				
				
				//testandooooo 2.0
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public Socket esperaConexao() {
			//um novo socket  criado,para o cliente que fez o pedido
			Socket socket = null;
			try {
			
			
			socket = serverSocket.accept();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return socket;
		}
		
		
		public void tratarConexao(Socket socket) {
			
			//ponto entre cliente e servidor
			//tratamento da comunicao entre cliente e servidor
			try {
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
			
			
			
			
			
			output.close();
			input.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				encerrarSocket(socket);
			}
			
		}
		
		public void encerrarSocket(Socket socket) {
			try {
				socket.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	

}
