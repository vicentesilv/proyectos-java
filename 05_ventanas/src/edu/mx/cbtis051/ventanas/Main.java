package edu.mx.cbtis051.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	
	private static JTextField txttexto;

	//serial
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Create the frame.
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane txttexto = new JTextPane();
		txttexto.setContentType("txttexto");
		txttexto.setBounds(43, 102, 216, 59);
		contentPane.add(txttexto);
		
		JButton btnmostrar = new JButton("mostrar");
		btnmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Visualizacion ventana = new Visualizacion();
				ventana.setVisible(true);
				String info=txttexto.getText();
				ventana.lbltexto.setText(info);
		
			
			}
		});
		btnmostrar.setBounds(92, 189, 117, 25);
		contentPane.add(btnmostrar);
		setLocationRelativeTo(null);
	}
	// abrir la ventaana visualizacion
		public static void  abrirvisualizacion() {
		
		
		}
	
	
}
