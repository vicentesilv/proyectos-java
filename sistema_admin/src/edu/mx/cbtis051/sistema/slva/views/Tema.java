package edu.mx.cbtis051.sistema.slva.views;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.mx.cbtis051.sistema.slva.views.oscuro.Mainoscuro;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tema extends JFrame {
	
	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	private static Tema instance; 
	/**
	 * Create the frame.
	 */
	private Tema() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Elije un tema para trabajar");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnclaro = new JButton("modo claro");
		btnclaro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Main ventana = new Main();
			ventana.setVisible(true);
			}
		});
		btnclaro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnclaro.setBounds(119, 28, 183, 37);
		panel.add(btnclaro);
		
		JButton btnOscuro = new JButton("modo oscuro");
		btnOscuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainoscuro ventana = new Mainoscuro();
				ventana.setVisible(true);
			}
		});
		btnOscuro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnOscuro.setBounds(119, 93, 183, 37);
		panel.add(btnOscuro);
	}
	public static Tema getInstance() {

		// verificacion si el objeto ya fue creado
		if (instance == null) {
			instance = new Tema();
		}
		return instance;
	}
}
