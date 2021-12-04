package edu.mx.cbtis051.sistema.slva.views.oscuro;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.mx.cbtis051.sistema.slva.api.Api;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoAgregaroscuro extends JFrame {

	//version serial y clases privadas de la ventana 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtdescripcion;
	private JTextField txtmodelo;
	private JTextField txtmarca;
	private JTextField txtimagen;
	
	//objeto singleton
	private static ProductoAgregaroscuro instance;
	//ventana
	private ProductoAgregaroscuro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#243651"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNombre.setBounds(10, 46, 124, 35);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDescripcion.setBounds(10, 80, 124, 35);
		contentPane.add(lblDescripcion);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModelo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblModelo.setBounds(10, 116, 124, 35);
		contentPane.add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMarca.setBounds(10, 152, 124, 35);
		contentPane.add(lblMarca);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setForeground(Color.WHITE);
		lblImagen.setHorizontalAlignment(SwingConstants.LEFT);
		lblImagen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblImagen.setBounds(10, 190, 124, 35);
		contentPane.add(lblImagen);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtnombre.setBounds(109, 56, 315, 25);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdescripcion = new JTextField();
		txtdescripcion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtdescripcion.setColumns(10);
		txtdescripcion.setBounds(109, 90, 315, 25);
		contentPane.add(txtdescripcion);
		
		txtmodelo = new JTextField();
		txtmodelo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(109, 126, 315, 25);
		contentPane.add(txtmodelo);
		
		txtmarca = new JTextField();
		txtmarca.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtmarca.setColumns(10);
		txtmarca.setBounds(109, 162, 315, 25);
		contentPane.add(txtmarca);
		
		txtimagen = new JTextField();
		txtimagen.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtimagen.setColumns(10);
		txtimagen.setBounds(109, 200, 315, 25);
		contentPane.add(txtimagen);
		
		JButton btnguardar = new JButton("guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarproducto();
			}
		});
		btnguardar.setBounds(335, 236, 89, 23);
		contentPane.add(btnguardar);
		
		JButton btnlimpiar = new JButton("limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//limpiamos las cajas de texto
				limpiarformulario();
			}
		});
		btnlimpiar.setBounds(236, 236, 89, 23);
		contentPane.add(btnlimpiar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(21, 39, 64));
		panel.setBounds(0, 0, 434, 47);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("agregar producto");
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		setLocationRelativeTo(null);
	}
	//nos permite crear un objeto
	public static ProductoAgregaroscuro getInstance() {
		if(instance == null ) {
			instance = new ProductoAgregaroscuro();
		}
	return instance;
	}
	//limpia los controles de la ventana
	public void limpiarformulario() {
		txtnombre.setText("");
		txtdescripcion.setText("");
		txtmodelo.setText("");
		txtmarca.setText("");
		txtimagen.setText("");
	}
	//guarda un nuevo producto
	public void guardarproducto() {
		/**
		 * validar que todos los campos esten llenos
		 */
		String nombre = txtnombre.getText();
		String descrip = txtdescripcion.getText();
		String modelo = txtmodelo.getText();
		String marca = txtmarca.getText();
		String imagen = txtimagen.getText();

		
		if(Api.addProducto(nombre, descrip, modelo, marca, imagen) != null ) {
			JOptionPane.showMessageDialog(ProductoAgregaroscuro.this, "producto creado correctamente");
			this.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(ProductoAgregaroscuro.this, "no se pudo crear el producto");
		}
		
		
	}


}

