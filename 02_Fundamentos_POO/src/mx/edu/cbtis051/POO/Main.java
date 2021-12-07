package mx.edu.cbtis051.POO;

import mx.edu.cbtis051.POO.figuras.Cuadrado;
import mx.edu.cbtis051.POO.vehiculos.Carro;
import mx.edu.cbtis051.POO.vehiculos.Llanta;

/**
 * clase principal
 * 
 * @author 
 * @date 27/oct/2021
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("fudamento de la " 
	+ "programacion orientada a objetos");

		// instancion
		Cuadrado c1 = new Cuadrado();

		c1.setLado(5);

		double area = c1.calculaArea();
		System.out.println("Area de c1= " + area);
		double perimetro = c1.calculaArea();
		System.out.println("perimetro de c1= "
		+ perimetro);

		Carro carro1 = new Carro();
		carro1.avanzar();
		carro1.avanzar(8);
		carro1.avanzar(10 , "atras");
		
		Carro carro2 = new Carro();
		Llanta llanta1 = new Llanta();
		llanta1.setColor("negro");
		llanta1.setMarca("michelin");
		llanta1.setDiametro(17);
		
		Llanta llantaArray[] = new Llanta[4];
		llantaArray[0] = llanta1;
		llantaArray[1] = llanta1;
		llantaArray[2] = llanta1;
		llantaArray[3] = llanta1;
		
		System.out.println(llanta1);
		
		carro2.setLlantas(llantaArray);
		
		System.out.println(carro2.getLlantas()[0]);
		System.out.println(carro2.getLlantas()[1]);
		System.out.println(carro2.getLlantas()[2]);
		System.out.println(carro2.getLlantas()[3]);
		
	}
}
