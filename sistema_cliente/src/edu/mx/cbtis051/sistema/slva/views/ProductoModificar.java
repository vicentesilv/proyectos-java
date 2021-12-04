package edu.mx.cbtis051.sistema.slva.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.mx.cbtis051.sistema.slva.models.Producto;

import javax.swing.JLabel;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class ProductoModificar extends JFrame {

	// serial version
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static ProductoModificar instance;

	// producto a modificar
	private Producto producto;
	private JLabel lbImagen;
	private JLabel lblnombre;
	private JLabel lbldesctipcion;
	private JLabel lblmodelo;
	private JLabel lblmarca;
	private JLabel lblimagen;

	// aplicacion
	// creador de la ventana

	private ProductoModificar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblModificarProducto = new JLabel("detalles del producto");
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
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(433, 11, 391, 248);
				contentPane.add(scrollPane);
				
						lbImagen = new JLabel("");
						scrollPane.setViewportView(lbImagen);
						lbImagen.setHorizontalAlignment(SwingConstants.CENTER);
						
						lblnombre = new JLabel("");
						lblnombre.setBounds(100, 46, 312, 25);
						contentPane.add(lblnombre);
						
						lbldesctipcion = new JLabel("");
						lbldesctipcion.setBounds(100, 88, 312, 25);
						contentPane.add(lbldesctipcion);
						
						lblmodelo = new JLabel("");
						lblmodelo.setBounds(100, 124, 312, 25);
						contentPane.add(lblmodelo);
						
						lblmarca = new JLabel("");
						lblmarca.setBounds(100, 160, 312, 25);
						contentPane.add(lblmarca);
						
						lblimagen = new JLabel("");
						lblimagen.setBounds(100, 198, 312, 25);
						contentPane.add(lblimagen);
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
		lblnombre.setText(producto.getNombre());
		lbldesctipcion.setText(producto.getDescripcion());
		lblmodelo.setText(producto.getModelo());
		lblmarca.setText(producto.getMarca());
		lblimagen.setText(producto.getImagen());
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
}
