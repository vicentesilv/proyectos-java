package edu.mx.cbtis051.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Visualizacion extends JFrame {

	private JPanel contentPane;
	//variable para recibir el texto de visualiacion
	private String texto;
	public JLabel lbltexto;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion frame = new Visualizacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Visualizacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Texto:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Lato Medium", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 12, 266, 28);
		contentPane.add(lblNewLabel);
		
		lbltexto = new JLabel("");
		lbltexto.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltexto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltexto.setFont(new Font("Lato Medium", Font.BOLD, 14));
		lbltexto.setBounds(12, 71, 266, 28);
		contentPane.add(lbltexto);
		setLocationRelativeTo(null);
	}
}
