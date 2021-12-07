package edu.mx.cbtis051.ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;



public class Splash extends JFrame {

	// serial
	private JPanel contentPane;

	//ventana splash
	static Splash frame;
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Splash();
					frame.setVisible(true);
					
					//creamos un timmer de 3 segundos para que se habra main
					Timer temporizador = new Timer(3000,new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
						//habrimos la ventana main y cerramos splash
						abrirMain();
						}
						
					});
					
					//iniciamos el timer
					temporizador.setRepeats(false);
					temporizador.start();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(Splash.class.getResource("/images/dgeti_logo_300.png")));
		lbllogo.setBounds(10, 10, 300, 274);
		contentPane.add(lbllogo);
		setLocationRelativeTo(null);

	}

	// abrir la ventaana principal
	public static void  abrirMain() {
		Main ventana = new Main();
		ventana.setVisible(true);
		//ocultar ventana splashc
		frame.setVisible(false);

	}
}
