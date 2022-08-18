package test;

import modelo.ArregloUnidimensional;

public class ArregloUnidimensionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1={5,2,6,8,1,3,4,2,10,9};
		ArregloUnidimensional array=new ArregloUnidimensional(vector1);
		System.out.println(array.toString());
		array.ordenarAscendente();
		System.out.println(array.toString());
		array.ordenarDescendente();
		System.out.println(array.toString());
		System.out.println("Frecuencia de 2 es :"+array.traerFrecuencia(2));
		System.out.println("Numero en moda: "+array.traerModa());
		System.out.println("Promedio es : "+array.calcularPromedio());
	}

}
