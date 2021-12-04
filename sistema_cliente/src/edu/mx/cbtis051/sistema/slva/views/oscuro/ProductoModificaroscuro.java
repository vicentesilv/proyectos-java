package edu.mx.cbtis051.sistema.slva.views.oscuro;

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
import java.awt.Color;

public class ProductoModificaroscuro extends JFrame {

	// serial version
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static ProductoModificaroscuro instance;

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

	private ProductoModificaroscuro() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 298);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#243651"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

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
		lblMarca.setBackground(new Color(255, 255, 255));
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
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(434, 0, 390, 259);
				contentPane.add(scrollPane);
				
						lbImagen = new JLabel("");
						scrollPane.setViewportView(lbImagen);
						lbImagen.setHorizontalAlignment(SwingConstants.CENTER);
						
						lblnombre = new JLabel("");
						lblnombre.setForeground(Color.WHITE);
						lblnombre.setBounds(100, 46, 312, 25);
						contentPane.add(lblnombre);
						
						lbldesctipcion = new JLabel("");
						lbldesctipcion.setForeground(Color.WHITE);
						lbldesctipcion.setBounds(100, 88, 312, 25);
						contentPane.add(lbldesctipcion);
						
						lblmodelo = new JLabel("");
						lblmodelo.setForeground(Color.WHITE);
						lblmodelo.setBounds(100, 126, 312, 25);
						contentPane.add(lblmodelo);
						
						lblmarca = new JLabel("");
						lblmarca.setForeground(Color.WHITE);
						lblmarca.setBounds(100, 160, 312, 25);
						contentPane.add(lblmarca);
						
						lblimagen = new JLabel("");
						lblimagen.setForeground(Color.WHITE);
						lblimagen.setBounds(100, 198, 312, 25);
						contentPane.add(lblimagen);
						
						JPanel panel = new JPanel();
						panel.setBackground(Color.decode("#152740"));
						panel.setBounds(0, 0, 435, 47);
						contentPane.add(panel);
						
								JLabel lblModificarProducto = new JLabel("detalles del producto");
								panel.add(lblModificarProducto);
								lblModificarProducto.setForeground(Color.WHITE);
								lblModificarProducto.setHorizontalAlignment(SwingConstants.CENTER);
								lblModificarProducto.setFont(new Font("Segoe UI", Font.BOLD, 20));
		setLocationRelativeTo(null);
	}

	public static ProductoModificaroscuro getInstance(Producto prod) {
		if (instance == null) {
			instance = new ProductoModificaroscuro();
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
