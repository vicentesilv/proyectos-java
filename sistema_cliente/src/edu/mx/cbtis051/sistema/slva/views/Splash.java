package edu.mx.cbtis051.sistema.slva.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

//import edu.mx.cbtis051.sistema.slva.api.Api;
//import edu.mx.cbtis051.sistema.slva.models.Producto;

public class Splash extends JFrame {
	static Splash frame;

	//version serial
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	//ejecucion de la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Splash();
					frame.setVisible(true);

					// creamos un timmer de 3 segundos para que se habra main
					Timer temporizador = new Timer(3000, new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// habrimos la ventana main y cerramos splash
						tema();

//							Producto p = new Producto();
//							p.setNombre("prueba");
//							p.setId(10);
//							
//							System.out.println(Api.getProductos());
//							System.out.println(Api.getProductos()[0]);
//							Producto[] productosList = Api.getProductos();
//							for(Producto item : productosList){
//								System.out.println(item);
//								System.out.println("//////////////////////");
//								
//							}
//							Producto p = Api.getProducto(171);
//							System.out.println(p);
//							System.out.println("//////////////////////////");
//							p = Api.getProducto(172);
//							System.out.println(p);
//							System.out.println("Eliminado: " + Api.deleteproducto(171));
//							Producto p = Api.addProducto("macbock", "computadora portatil", "macbock pro 16", "apple", "null");
//							System.out.println(p);
//							p.setNombre("Producto modificado");
//							p = Api.updateproducto(p);
//							System.out.println("producto modificado: " + p);

						}

					});

					// iniciamos el timer
					temporizador.setRepeats(false);
					temporizador.start();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. java visual.
	 */
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);// centrar la ventana en la pantalla
		setUndecorated(true);// quitar bordes

		// icono cbtis 051.
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Splash.class.getResource("/images/dgeti_logo_300.png")));
		lblNewLabel.setBounds(10, 135, 304, 294);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido a nuestra tienda.");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_1.setBounds(10, 11, 304, 51);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Donde todo est\u00E1 a unos clicks.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 52, 304, 33);
		contentPane.add(lblNewLabel_2);

	}

	public static void tema() {
		Tema ventana = Tema.getInstance();
		ventana.setVisible(true);

		frame.setVisible(false);

	}

}
