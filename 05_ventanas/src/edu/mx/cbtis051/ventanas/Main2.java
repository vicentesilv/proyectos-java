package edu.mx.cbtis051.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Create the frame.
	 */
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		txtTexto.setBounds(88, 83, 308, 37);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				abrirVisualizacion();
			}
		});
		btnMostrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnMostrar.setBounds(171, 158, 141, 23);
		contentPane.add(btnMostrar);
		setLocationRelativeTo(null); //centrar ventana en pantalla
	}
	
	/**
	 * abrir la ventana principal
	 */
	public static void abrirVisualizacion() {
		Visualizacion1 ventana = new Visualizacion1();
	    ventana.setVisible(true);
	}
}
