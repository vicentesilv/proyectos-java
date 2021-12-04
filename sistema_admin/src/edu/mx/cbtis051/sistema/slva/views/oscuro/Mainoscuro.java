package edu.mx.cbtis051.sistema.slva.views.oscuro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		btnproductos.setBounds(137, 106, 163, 50);
		contentPane.add(btnproductos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(21, 39, 64));
		panel.setBounds(0, 0, 434, 37);
		contentPane.add(panel);
		
		JLabel lblBienvenidoANuestra = new JLabel("bienvenido al administrador de la tienda. porfavor en catalogo de productos");
		lblBienvenidoANuestra.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoANuestra.setForeground(Color.WHITE);
		lblBienvenidoANuestra.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblBienvenidoANuestra.setBackground(Color.WHITE);
		panel.add(lblBienvenidoANuestra);
		setLocationRelativeTo(null);
	}
	//abrir ventana porductos catalogo 
	public void catalogodeproductos() {
	ProductoCatalogooscuro ventana = ProductoCatalogooscuro.getInstance();
	ventana.setVisible(true);
	
	}
}
