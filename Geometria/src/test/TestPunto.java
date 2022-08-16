package test;
import geometria.Punto;
public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(7,4); 
		Punto punto2=new Punto(1,2);
		System.out.println(punto1.equals(punto2));// false porque los puntos del equals no coinciden
		Punto punto3=new Punto(7,4);
		System.out.println(punto1.equals(punto3)); // true porque los puntos son iguales
		System.out.println("Distancia: "+punto1.calcularDistancia(punto2));
		System.out.println(punto1.toString()); // x=7 y=4
		punto1.mover(10, 10);
		System.out.println(punto1.toString()); //x=17 y=14
	}

}
