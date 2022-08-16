package geometria;

public class Circulo {
	private Punto origen;
	private double radio;

	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setRadio(Punto radio) {
		double distancia = origen.calcularDistancia(radio);
		this.setRadio(distancia);
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}
	
	public double calcularPerimetro(){
		return 2*Math.PI*this.radio;
	}
	
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	
	public double calcularDistacia(Circulo circulo) {
		double circulo1=this.origen.calcularDistancia(origen);
		double circulo2=circulo.origen.calcularDistancia(origen);
		return (Math.sqrt(circulo1+circulo2));

	}
}
