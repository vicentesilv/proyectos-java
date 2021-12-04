package edu.mx.cbtis051.sistema.slva.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.mx.cbtis051.sistema.slva.api.Api;
import edu.mx.cbtis051.sistema.slva.models.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoModificar extends JFrame {

	// serial version
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtImagen;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtDescripcion;
	private JTextField txtNombre;

	private static ProductoModificar instance;

	// producto a modificar
	private Producto producto;
	private JLabel lbImagen;

	// aplicacion
	// creador de la ventana

	private ProductoModificar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblModificarProducto = new JLabel("modificar producto");
		lblModificarProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarProducto.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblModificarProducto.setBounds(10, 0, 414, 35);
		contentPane.add(lblModificarProducto);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNombre.setBounds(10, 46, 124, 35);
		contentPane.add(lblNombre);

		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDescripcion.setBounds(10, 80, 124, 35);
		contentPane.add(lblDescripcion);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModelo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblModelo.setBounds(10, 116, 124, 35);
		contentPane.add(lblModelo);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMarca.setBounds(10, 152, 124, 35);
		contentPane.add(lblMarca);

		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setHorizontalAlignment(SwingConstants.LEFT);
		lblImagen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblImagen.setBounds(10, 190, 124, 35);
		contentPane.add(lblImagen);

		JButton btnlimpiar = new JButton("limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reseteamos los cambios realizados
				mostrarproducto();
				
			}
		});
		btnlimpiar.setBounds(223, 236, 89, 23);
		contentPane.add(btnlimpiar);

		JButton btnguardar = new JButton("actualizar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarProducto();
				
			}
		});
		btnguardar.setBounds(327, 236, 97, 23);
		contentPane.add(btnguardar);

		txtImagen = new JTextField();
		txtImagen.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtImagen.setColumns(10);
		txtImagen.setBounds(109, 200, 315, 25);
		contentPane.add(txtImagen);

		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtMarca.setColumns(10);
		txtMarca.setBounds(109, 162, 315, 25);
		contentPane.add(txtMarca);

		txtModelo = new JTextField();
		txtModelo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtModelo.setColumns(10);
		txtModelo.setBounds(109, 126, 315, 25);
		contentPane.add(txtModelo);

		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(109, 90, 315, 25);
		contentPane.add(txtDescripcion);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBounds(109, 56, 315, 25);
		contentPane.add(txtNombre);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(433, 11, 391, 248);
				contentPane.add(scrollPane);
				
						lbImagen = new JLabel("");
						scrollPane.setViewportView(lbImagen);
						lbImagen.setHorizontalAlignment(SwingConstants.CENTER);
		setLocationRelativeTo(null);
	}

	public static ProductoModificar getInstance(Producto prod) {
		if (instance == null) {
			instance = new ProductoModificar();
		}
		// asignacion producto a modificar
		instance.producto = prod;
		// mostramos la informacion del producto
		instance.mostrarproducto();

		return instance;
	}

	// muestra la informacion del producto
	private void mostrarproducto() {
		// mostramos los datos del producto a modificar
		txtNombre.setText(producto.getNombre());
		txtDescripcion.setText(producto.getDescripcion());
		txtModelo.setText(producto.getModelo());
		txtMarca.setText(producto.getMarca());
		txtImagen.setText(producto.getImagen());
		// mostrar la imagen
		try {
			URL url = new URL(producto.getImagen());
			// asignamos la imagen al jlabel
			lbImagen.setIcon(new ImageIcon(
					new ImageIcon(url).getImage().getScaledInstance(300, 240, java.awt.Image.SCALE_SMOOTH)));

		} catch (MalformedURLException e) {
			System.out.println("Error al mostrar la imagen");
			e.printStackTrace();
		}

	}
	//actualizar los cambios del producto
	public void actualizarProducto() {
		/**
		 * validar los campos del formulario
		 */

		//creacion de un producto para la actualizacion
		Producto pm = new Producto();
		//actualizamos la informacion del producto
		pm.setId(producto.getId());
		pm.setNombre(txtNombre.getText());;
		pm.setDescripcion(txtDescripcion.getText());
		pm.setModelo(txtModelo.getText());
		pm.setMarca(txtMarca.getText());
		pm.setImagen(txtImagen.getText());
		//llamado a la api
		if(Api.updateproducto(pm) != null ) {
			JOptionPane.showMessageDialog(ProductoModificar.this, "producto actualizado correctamente");
			this.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(ProductoModificar.this, "no se pudo actualizar el producto");
		}
		
	}
}
