package mx.edu.cbtis051.POO.vehiculos;

public class Llanta {
	//atributos1
	private String marca;
	private String color;
	private int diametro;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Llanta (marca "+marca +", color "
				+color+", diametro )";
}	
}
