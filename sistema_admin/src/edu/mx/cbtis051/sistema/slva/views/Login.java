package edu.mx.cbtis051.sistema.slva.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	static Login frame;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 320, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/dgeti_logo_300.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 304, 294);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("usuario");
		lblNewLabel_1.setBounds(0, 342, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("contrase\u00F1a");
		lblNewLabel_2.setBounds(0, 379, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(73, 339, 221, 20);
		contentPane.add(txtUsuario);
		
		Password = new JPasswordField();
		Password.setBounds(73, 376, 221, 20);
		contentPane.add(Password);
		
		JButton btnNewButton = new JButton("entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrar();
			}
		});
		btnNewButton.setBounds(205, 407, 89, 23);
		contentPane.add(btnNewButton);
	}
		public void entrar() {
			String usuario = "root";
			String contraseña = "root";
			String Pass = new String(Password.getPassword());
			
			
			if(txtUsuario.getText().equals(usuario) && Pass.equals(contraseña))  {
				Tema ventana = Tema.getInstance();
				ventana.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(Login.this, "el usuario y/o contraseña invalidos");
			}}
}
