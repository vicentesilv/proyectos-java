package edu.mx.cbtis051.sistema.slva.views.oscuro;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import edu.mx.cbtis051.sistema.slva.api.Api;
import edu.mx.cbtis051.sistema.slva.models.Producto;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class ProductoCatalogooscuro extends JFrame {
	// serial version
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tproductos;
	private JScrollPane scrollPane;

	// objeto para el singlenton
	private static ProductoCatalogooscuro instance;
	private JLabel lblNewLabel;

	// Create the frame./ventana de la aplicacion
	private ProductoCatalogooscuro() {
		setTitle("catalogo de productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#152740"));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("seleccione un producto para ver detalles");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
				JButton btnmodificar = new JButton("detalles");
				btnmodificar.setBackground(Color.WHITE);
				btnmodificar.setFont(new Font("Segoe UI", Font.PLAIN, 20));
				btnmodificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// abrir ventana
						modificarproducto();
					}
				});
				panel.add(btnmodificar);

		// CONSTRUCCION TABLA DE PRODUCTOS
		buildTproductos();

		scrollPane = new JScrollPane(tproductos);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	// nos permite crear un objeto
	public static ProductoCatalogooscuro getInstance() {

		// verificacion si el objeto ya fue creado
		if (instance == null) {
			instance = new ProductoCatalogooscuro();
		}
		return instance;
	}
	public void modificarproducto() {
		//iniciamos la modificacion de un producto
		modificarProducto();
	}
	// construccion tabla de productos desde la api
	public void buildTproductos() {
		// crear un modelo de las columnas que tendra la tabla
		DefaultTableModel modelo = new DefaultTableModel() {

			// serial verrsion
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return super.isCellEditable(row, column);
			}
		};
		// agregar encabezado de las columnas
		modelo.setColumnIdentifiers(new String[] { "ID", "Nombre", "Descripcion", "Modelo", "Marca", "Imagen" });
		// crear tabla apartir del modelo
		tproductos = new JTable(modelo);
		tproductos.setForeground(Color.WHITE);
		tproductos.setBackground(Color.decode("#243651"));
		tproductos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		// octener productos de la api
		Producto[] productos = Api.getProductos();
		// agregar productos de la tabla
		if (productos != null) {
			// se recorre el array de productos y se agrega a la tabla
			for (Producto p : productos) {
				// AGREGAR AL MODELO EL PRODUCTO
				modelo.addRow(new String[] { Long.toString(p.getId()), p.getNombre(), p.getDescripcion(), p.getModelo(),
						p.getMarca(), p.getImagen() });
			}
		}
	}
	//modificar un producto
	public void modificarProducto() {
		// octenemos el registro de la tabla
		String registro = "";
		System.out.println(tproductos.getSelectedRow());
		if (tproductos.getSelectedRow() != -1) {
			registro = tproductos.getValueAt(tproductos.getSelectedRow(), 0).toString();
			long id = Long.parseLong(registro);
			//octenemos el producto desde la api
			Producto prod = Api.getProducto(id);
			System.out.println(prod);
				
			//abrimos ventana de modificacion de productos
			abrirmodificarproducto(prod);
			
		} else {
			JOptionPane.showMessageDialog(ProductoCatalogooscuro.this, "porfavor seleccione un producto");
		}

	}
		public void abrirmodificarproducto(Producto prod) {
			ProductoModificaroscuro ventana = ProductoModificaroscuro.getInstance(prod);
			ventana.setVisible(true);
		}
		
	}


