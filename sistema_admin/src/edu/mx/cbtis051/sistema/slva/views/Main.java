package edu.mx.cbtis051.sistema.slva.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	// version serial
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Main frame;

	// inicio de la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ventana
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnproductos = new JButton("catalogo de productos");
		btnproductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			catalogodeproductos();
			}
		});
		btnproductos.setBounds(10, 11, 163, 50);
		contentPane.add(btnproductos);
		setLocationRelativeTo(null);
	}
	//abrir ventana porductos catalogo 
	public void catalogodeproductos() {
	ProductoCatalogo ventana = ProductoCatalogo.getInstance();
	ventana.setVisible(true);
	
	}
}
