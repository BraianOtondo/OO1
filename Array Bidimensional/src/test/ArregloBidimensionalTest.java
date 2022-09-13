package test;

import modelo.ArregloBidimensional;

public class ArregloBidimensionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m1={{2,1,0,7},{3,4,2,-1},{1,0,5,8}};
		double[][] m2={{2,2,2,2},{2,2,2,2},{2,2,2,2}};
		System.out.println("MatrizA orginal: ");
		ArregloBidimensional matrizA=new ArregloBidimensional(m1);
		matrizA.mostrarArrayBidimensional();
		double [][] m3= matrizA.sumar(m2);
		ArregloBidimensional matrizB=new ArregloBidimensional(m3);

		System.out.println("matrizA : ");
		matrizA.mostrarArrayBidimensional();
		System.out.println("Matriz B");
		matrizB.mostrarArrayBidimensional();
		
	/*	matrizA.restar(m2);
		System.out.println("matrizA con resta: ");
		matrizA.mostrarArrayBidimensional();
		double[][] m3=matrizA.transpuesta();
		ArregloBidimensional matrizB= new ArregloBidimensional(m3);
		System.out.println("TRANSPUESTA: ");
		matrizB.mostrarArrayBidimensional();
	
		double[][] m5={{2,3,5,1},{7,2,4,3},{-1,5,0,8}};
		double[][]m6={{1,1},{7,2},{0,-5},{4,0}};
		ArregloBidimensional matriz5= new ArregloBidimensional(m5);
		double [][] m7=matriz5.multiplicar(m6);
		ArregloBidimensional matriz7= new ArregloBidimensional(m7);
		matriz7.mostrarArrayBidimensional();
*/
	}

}
