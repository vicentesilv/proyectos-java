package mx.edu.cbtis051.POO.figuras;

public class Cuadrado extends Figura{
//atributos o variables de clase
	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double calculaArea() {
		// calculo de area del objeto 
		return lado*lado;
	}
	@Override
	public double calculaPerimetro() {
		// calculo del perimetro
		return lado*4;
	}
}
