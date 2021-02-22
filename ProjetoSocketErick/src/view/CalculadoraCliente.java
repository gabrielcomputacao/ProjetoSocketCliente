package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class CalculadoraCliente {

	private JFrame frmCalculadora;
	private JTextField num_primeiro;
	private JTextField operacao;
	private JTextField num_segundo;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraCliente window = new CalculadoraCliente();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraCliente() {
		initialize();
	}
	
	
	
	String numeroUM="",numDois="";
	int cont=1;
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("CALCULADORA");
		frmCalculadora.setBounds(100, 100, 488, 463);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("1");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("1");
					numDois+=num_segundo.getText();
				}
				
			}
		});
		um.setBounds(10, 150, 89, 45);
		frmCalculadora.getContentPane().add(um);
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("4");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("4");
					numDois+=num_segundo.getText();
				}
			}
		});
		quatro.setBounds(10, 213, 89, 45);
		frmCalculadora.getContentPane().add(quatro);
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("7");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("7");
					numDois+=num_segundo.getText();
				}
			}
		});
		sete.setBounds(10, 283, 89, 45);
		frmCalculadora.getContentPane().add(sete);
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("2");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("2");
					numDois+=num_segundo.getText();
				}
			}
		});
		dois.setBounds(124, 150, 89, 45);
		frmCalculadora.getContentPane().add(dois);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("3");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("3");
					numDois+=num_segundo.getText();
				}
			}
		});
		tres.setBounds(235, 150, 89, 45);
		frmCalculadora.getContentPane().add(tres);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("5");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("5");
					numDois+=num_segundo.getText();
				}
			}
		});
		cinco.setBounds(124, 213, 89, 45);
		frmCalculadora.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("6");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("6");
					numDois+=num_segundo.getText();
				}
			}
		});
		seis.setBounds(235, 213, 89, 45);
		frmCalculadora.getContentPane().add(seis);
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("8");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("8");
					numDois+=num_segundo.getText();
				}
			}
		});
		oito.setBounds(124, 283, 89, 45);
		frmCalculadora.getContentPane().add(oito);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("9");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("9");
					numDois+=num_segundo.getText();
				}
			}
		});
		nove.setBounds(235, 283, 89, 45);
		frmCalculadora.getContentPane().add(nove);
		
		JButton zerar = new JButton("Limpar");
		zerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					num_primeiro.setText("");
					numeroUM="";
				
					num_segundo.setText("");
					numDois="";
					
					operacao.setText("");
					
					resultado.setText("");
			}
		});
		zerar.setBounds(10, 354, 89, 45);
		frmCalculadora.getContentPane().add(zerar);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText("0");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText("0");
					numDois+=num_segundo.getText();
				}
			}
		});
		zero.setBounds(124, 354, 89, 45);
		frmCalculadora.getContentPane().add(zero);
		
		JButton virgula = new JButton(".");
		virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText(".");
					numeroUM+=num_primeiro.getText();
				}else {
					num_segundo.setText(".");
					numDois+=num_segundo.getText();
				}
			}
		});
		virgula.setBounds(235, 354, 89, 45);
		frmCalculadora.getContentPane().add(virgula);
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao.setText("+");
			}
		});
		mais.setBounds(362, 150, 89, 45);
		frmCalculadora.getContentPane().add(mais);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao.setText("-");
			}
		});
		menos.setBounds(362, 213, 89, 45);
		frmCalculadora.getContentPane().add(menos);
		
		JButton mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao.setText("*");
			}
		});
		mult.setBounds(362, 283, 89, 45);
		frmCalculadora.getContentPane().add(mult);
		
		JButton divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao.setText("/");
			}
		});
		divisao.setBounds(362, 354, 89, 45);
		frmCalculadora.getContentPane().add(divisao);
		
		JLabel nomelabel1 = new JLabel("Primeiro N\u00FAmero");
		nomelabel1.setHorizontalAlignment(SwingConstants.LEFT);
		nomelabel1.setBounds(10, 11, 112, 22);
		frmCalculadora.getContentPane().add(nomelabel1);
		
		num_primeiro = new JTextField();
		num_primeiro.setHorizontalAlignment(SwingConstants.CENTER);
		num_primeiro.setBounds(10, 44, 97, 20);
		frmCalculadora.getContentPane().add(num_primeiro);
		num_primeiro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("OPERA\u00C7\u00C3O");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(132, 15, 81, 14);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo N\u00FAmero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(235, 15, 112, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_1);
		
		operacao = new JTextField();
		operacao.setHorizontalAlignment(SwingConstants.CENTER);
		operacao.setBounds(143, 44, 64, 20);
		frmCalculadora.getContentPane().add(operacao);
		operacao.setColumns(10);
		
		num_segundo = new JTextField();
		num_segundo.setHorizontalAlignment(SwingConstants.CENTER);
		num_segundo.setBounds(235, 44, 89, 20);
		frmCalculadora.getContentPane().add(num_segundo);
		num_segundo.setColumns(10);
		
		JLabel resultadotxt = new JLabel("RESULTADO:");
		resultadotxt.setBounds(10, 99, 81, 18);
		frmCalculadora.getContentPane().add(resultadotxt);
		
		resultado = new JTextField();
		resultado.setBounds(95, 97, 229, 22);
		frmCalculadora.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		JButton okButt = new JButton("OK");
		okButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((cont % 2) != 0) {
					num_primeiro.setText(numeroUM);
				}else {
					num_segundo.setText(numDois);
				}
				cont++;
				
			}
		});
		okButt.setBounds(362, 97, 81, 23);
		frmCalculadora.getContentPane().add(okButt);
		
		JButton startbutt = new JButton("START");
		startbutt.setBounds(362, 43, 81, 23);
		frmCalculadora.getContentPane().add(startbutt);
	}

	
}
