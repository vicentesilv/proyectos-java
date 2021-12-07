package edu.mx.cbtis051.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Visualizacion1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Visualizacion1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 25, 151, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblTexto = new JLabel("");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblTexto.setBounds(33, 75, 151, 23);
		contentPane.add(lblTexto);
		setLocationRelativeTo(null);  //center on screen
	}
}
