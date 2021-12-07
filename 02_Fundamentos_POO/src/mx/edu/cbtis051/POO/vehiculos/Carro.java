package mx.edu.cbtis051.POO.vehiculos;

public class Carro extends Vehiculo {
	private Llanta llantas[];
	
	@Override
	public void avanzar() {
		System.out.println("el carro avanzo "
				+ "1 metro");
	}
	public void avanzar(int metros) {
		System.out.println("el carro avanzo "
	+ metros + "m");	
	}
	public void avanzar(int metros, String dirreccion) {
		System.out.println("el carro avanzo "
				+ metros + " metros hacia "
				+ dirreccion);		
	}
	public Llanta[] getLlantas() {
		return llantas;
	}
	public void setLlantas(Llanta[] llantas) {
		this.llantas = llantas;
	}
	@Override
	public String toString() {
		
		return "carro ( llantas: " +llantas+")";
	}
}
