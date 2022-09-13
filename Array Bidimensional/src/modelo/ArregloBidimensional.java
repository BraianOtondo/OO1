package modelo;

import java.util.Arrays;

public class ArregloBidimensional {
	private double[][] matrizA;

	public ArregloBidimensional(double[][] matrizA) {
		super();
		this.matrizA = matrizA;
	}

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	@Override
	public String toString() {
		return "ArregloBidimensional [matrizA=" + Arrays.toString(matrizA) + "]";
	}

	public double[][] sumar(double[][] matrizB) {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizB[i][j] = matrizB[i][j] + matrizA[i][j];
			}
		}
		return matrizB;
	}

	public double[][] restar(double[][] matrizB) {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = matrizA[i][j] - matrizB[i][j];
			}
		}
		return matrizA;
	}

	public double[][] transpuesta() {
		int n = matrizA.length;
		int m = matrizA[0].length;
		double[][] matrizB = new double[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrizB[j][i] = matrizA[i][j];
			}
		}
		return matrizB;
	}

	public double[][] multiplicar(double numero) {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = matrizA[i][j] * numero;
			}
		}
		return matrizA;
	}

	public double[][] multiplicar(double[][] matrizB) {
		int af = matrizA.length;
		int ac = matrizA[0].length;
		int bf = matrizB.length;
		int bc = matrizB[0].length;
		if (ac == bf) {
			double[][] matrizC = new double[af][bc];
			double acum;
			for (int i = 0; i < af; i++) {
				for (int j = 0; j < bc; j++) {
					acum = 0;
					for (int k = 0; k < ac; k++) {
						acum = acum + matrizA[i][k] * matrizB[k][j];
					}
					matrizC[i][j] = acum;
				}
			}
			return matrizC;
		}
		return null;
	}

	public void mostrarArrayBidimensional() {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				System.out.println("[" + i + "] [" + j + "]" + matrizA[i][j]);
			}
		}
	}

}
