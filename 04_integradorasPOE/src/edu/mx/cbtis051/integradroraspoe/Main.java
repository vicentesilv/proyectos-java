package edu.mx.cbtis051.integradroraspoe;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class Main extends JFrame {

	// serial vesion UID
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtannio;
	private JTextField mesnacimiento;
	private JTextField dianacimiento;

	// Launch the application.
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

	// Create the frame.
	public Main() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		// eventos de mouse
		contentPane.addMouseListener(new MouseAdapter() {
			@Override // mouse clicked
			public void mouseClicked(MouseEvent e) {
				System.out.println("contentpain click");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("contentpain click entered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("contentpain click exited");
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane txtnombre = new JTextPane();
		txtnombre.setBounds(154, 12, 240, 36);
		contentPane.add(txtnombre);
		txtannio = new JTextField();
		txtannio.setBounds(376, 110, 66, 36);
		contentPane.add(txtannio);
		txtannio.setColumns(10);
		JLabel lblNewLabel = new JLabel("calculo de la edad");
		lblNewLabel.setBounds(12, 67, 140, 25);
		contentPane.add(lblNewLabel);
		JButton btnCalcularEdad = new JButton("mostrar datos");
		btnCalcularEdad.setBackground(Color.WHITE);
		// eventos del boton calcular edad
		btnCalcularEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// extraccion del contenido de txtnombre
				String nombre = txtnombre.getText();
				System.out.println("el nombre es " + nombre);
				// entrada de datos de la fecha de nacimiento
				String strDianacimiento = dianacimiento.getText();
				String strmesnacimiento = mesnacimiento.getText();
				String stranionacimiento = txtannio.getText();
				// fecha de nacimiento
				String fechaNacimiento = strDianacimiento + "/" + strmesnacimiento + "/" + stranionacimiento;
				// fecha actual
				Date date = new Date();
				SimpleDateFormat dia = new SimpleDateFormat("dd");
				String strdiaactual = dia.format(date);
				SimpleDateFormat mes = new SimpleDateFormat("MM");
				String strmesactual = mes.format(date);
				SimpleDateFormat annio = new SimpleDateFormat("yyyy");
				String strannioactual = annio.format(date);
				// fecha actual completa
				String strfechaActual = strdiaactual + "/" + strmesactual + "/" + strannioactual;
				// conversion de cadena a numeros
				int annioNacimiento = Integer.parseInt(stranionacimiento);
				int annioActual = Integer.parseInt(strannioactual);
				int mesNacimiento = Integer.parseInt(strmesnacimiento);
				int mesActual = Integer.parseInt(strmesactual);
				int diaNacimiento = Integer.parseInt(strmesnacimiento);
				int diaActual = Integer.parseInt(strdiaactual);
				// calculo de las fechas
				int edadACumplir = annioActual - annioNacimiento;
				int edad = annioActual - annioNacimiento;
				int Mes = mesActual - mesNacimiento;
				int Dia = diaActual - diaNacimiento;
				// condicionales
				if (Mes < 0) {
					edad--;
					JOptionPane.showMessageDialog(Main.this,
							"su nombre es: " + nombre + "\nsu fecha de nacimiento es: " + fechaNacimiento
									+ "\nla fecha actual es: " + strfechaActual + "\nsu edad a cumplir este años es: "
									+ edadACumplir + "\nsu edad actual es: " + edad);
				} else if (Mes == 0) {
					if (Dia <= 0) {
						JOptionPane.showMessageDialog(Main.this,
								"su nombre es: " + nombre + "\nsu fecha de nacimiento es: " + fechaNacimiento
										+ "\nla fecha actual es: " + strfechaActual
										+ "\nsu edad a cumplir este años es: " + edadACumplir + "\nsu edad actual es: "
										+ edad);
					} else {
						Dia--;
					}
				} else {
					JOptionPane.showMessageDialog(Main.this,
							"su nombre es: " + nombre + "\nsu fecha de nacimiento es: " + fechaNacimiento
									+ "\nla fecha actual es: " + strfechaActual + "\nsu edad a cumplir este años es: "
									+ edadACumplir + "\nsu edad actual es: " + edad);
				}
				// imprimir datos en terminal
				System.out.println("su nombre es: " + nombre);
				System.out.println("la fecha de nacimiento es " + fechaNacimiento);
				System.out.println("la fecha actual es " + strfechaActual);
				System.out.println("su edad es: " + edad);
				System.out.println("su edad a cumplir este año es: " + edadACumplir);
			}
		});
		btnCalcularEdad.setBounds(31, 175, 148, 25);
		contentPane.add(btnCalcularEdad);
		JLabel lblAo = new JLabel("mes");
		lblAo.setBounds(295, 82, 39, 30);
		contentPane.add(lblAo);
		JLabel lblAo_1 = new JLabel("año");
		lblAo_1.setBounds(393, 82, 39, 30);
		contentPane.add(lblAo_1);
		mesnacimiento = new JTextField();
		mesnacimiento.setColumns(10);
		mesnacimiento.setBounds(280, 110, 66, 36);
		contentPane.add(mesnacimiento);
		dianacimiento = new JTextField();
		dianacimiento.setColumns(10);
		dianacimiento.setBounds(176, 109, 66, 36);
		contentPane.add(dianacimiento);
		JLabel lblDia = new JLabel("dia");
		lblDia.setBounds(191, 82, 39, 30);
		contentPane.add(lblDia);
		JLabel lblAoDeNacimiento = new JLabel("fecha de nacimiento");
		lblAoDeNacimiento.setBounds(12, 110, 157, 41);
		contentPane.add(lblAoDeNacimiento);
		JLabel lblInserteSuNombre = new JLabel("inserte su nombre");
		lblInserteSuNombre.setBounds(12, 12, 157, 15);
		contentPane.add(lblInserteSuNombre);
		JPanel panel = new JPanel();
		panel.setBounds(239, 1, 10, 10);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("mostrar nombre");
		btnNewButton.setBounds(12, 39, 199, 25);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null); // centrar la aplicacion en la pantalla
	}
}
