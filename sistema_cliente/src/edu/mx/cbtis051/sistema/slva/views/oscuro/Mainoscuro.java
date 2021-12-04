package edu.mx.cbtis051.sistema.slva.views.oscuro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Mainoscuro extends JFrame {

	// version serial
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Mainoscuro frame;

	// inicio de la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainoscuro frame = new Mainoscuro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ventana
	public Mainoscuro() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#243651"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnproductos = new JButton("catalogo de productos");
		btnproductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			catalogodeproductos();
			}
		});
		btnproductos.setBounds(133, 113, 163, 50);
		contentPane.add(btnproductos);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#152740"));
		panel.setBounds(0, 0, 434, 37);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("bienvenido a nuestra tienda. porfavor entre al catalogo de productos");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setLocationRelativeTo(null);
	}
	//abrir ventana porductos catalogo 
	public void catalogodeproductos() {
	ProductoCatalogooscuro ventana = ProductoCatalogooscuro.getInstance();
	ventana.setVisible(true);
	
	}
}
