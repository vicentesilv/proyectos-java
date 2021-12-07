package edu.mx.cbtis051.ventanas;

import java.awt.BorderLayout;
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

public class Splash2 extends JFrame {

	private JPanel contentPane;
    //ventana splash
	 static Splash frame;
     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    frame = new Splash();
					frame.setVisible(true);
					//creamos un timer para que despues de tres segundos se abra el Main
					Timer temporizador = new Timer(3000, new ActionListener (){

						@Override
						public void actionPerformed(ActionEvent e) {
							// abrimos la ventana Main y cerramos Splash
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

	/**
	 * Create the frame.
	 */
	public Splash2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Splash.class.getResource("/imagenes/dgti_logo_300.png")));
		lblLogo.setBounds(10, 0, 300, 274);
		contentPane.add(lblLogo);
		setLocationRelativeTo(null);// centrar ventana en pantalla
	}
	
	/**
	 * abrir la ventana principal
	 */
	public static void abrirMain() {
		Main2 ventana = new Main2();
	    ventana.setVisible(true);
	    frame.setVisible(false);
	  
	}
	
}
