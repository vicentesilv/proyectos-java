package mx.edu.cbtis051.fundamentos;

/**
 * Fundamentos del trabajo con Java
 * 
 * @author vicente aldahir silva lizarraga
 * @matricula 20325050510345
 * @date 6/octubre/2021
 */

public class Main {
	public static void main(String[] args) {
		// inicio de la aplicacion "//" comentario de una sola linea
		/*
		 * comentarios de varias linea
		 * 
		 * esta aplicacion servira para identificar el funcionamiento basico de Java se
		 * realizaran practicas con los fundamentos del lenguaje
		 */
		// Main obj = new Main();
		// Math
		// ejecucion de datos primitivos
		primitivos();
		// ejecucion de operadores
		operadores();
		// ejecucion de comparadores
		comparadores();
		// ejecucion de condicionales
		estructurasDeControl();
	}

	private static void primitivos() {
		// declaracion de variables
		System.out.println(" ejecucion de datos primitivos");
		int edad;
		edad = 16;
		System.out.println("edad[int]= " + edad);
		byte precio = 10;
		System.out.println("precio[byte=] " + precio);

	}

	private static void operadores() {
		System.out.println("ejecucion de operadores");

		int numUno = 10;
		int numDos = 5;
		int resultado;

		// suma
		resultado = numUno + numDos;
		System.out.println("el resultado de la suma es: " + resultado);
		// resta
		resultado = numUno - numDos;
		System.out.println("el resultado de la resta es: " + resultado);
		// multiplicacion
		resultado = numUno * numDos;
		System.out.println("el resultado de la multiplicacion es: " + resultado);
		// division
		resultado = numUno / numDos;
		System.out.println("el resultado de la division es: " + resultado);
		// porcentaje
		resultado = numUno % numDos;
		System.out.println("el resultado del residuo es: " + resultado);

	}

	private static void comparadores() {
		System.out.println(" ejecucion de comparadores");
		double galon = 3.79;
		double litro = 1;
		boolean activo = true;

		System.out.println("galon == litro = " + (galon == litro));
		System.out.println("galon > litro =" + (galon > litro));
		System.out.println("galon < litro =" + (galon < litro));
		System.out.println("galon != litro =" + (galon != litro));
		System.out.println("galon <= litro =" + (galon <= litro));
		System.out.println("galon >= litro =" + (galon >= litro));

		System.out.println("activo = " + activo);
		activo = false;
		System.out.println("activo = " + activo);

	}

	private static void estructurasDeControl() {
		System.out.println("ejecucion de las estructuras de control");
		int edad = 10;

		if (edad >= 18) {
			System.out.println("es mayor de edad con " + edad + " años");
		} else {
			System.out.println("es menor de edad con " + edad + " años ");
		}
		// edad = 49;
		edad = 110;
		/*
		 * de 0 a 17 años es menor de edad de 18 a 50 es un adulto de 51 a mas de 70 es
		 * un adulto mayor
		 */
		String categoria = "";
		if (edad < 18) {
			categoria = "menor de edad";

		} else if (edad <= 50) {
			categoria = "adulto";
		} else {
			categoria = "adulto mayor";
		}
		System.out.println("categoria " + categoria);

		/*
		 * trabajadores horasTrabajadas = 20 horasTrabajadas 0 a 40 = sueldo normal
		 * horasTrabajadas 41 o mas = sueldo normal mas horas extras
		 */

		int horasTrabajadas = 40;
		String sueldo = "";
		if (horasTrabajadas <= 40) {
			sueldo = "por lo que su sueldo sera normal";
			System.out.println("el trabajador trabajo " + horasTrabajadas + " horas " + sueldo);
		} else if (horasTrabajadas > 41) {
			sueldo = "por lo que su sueldo sera normal mas las horas extras";
			System.out.println("el trabajador trabajo " + horasTrabajadas + " horas " + sueldo);

		}
	}
}