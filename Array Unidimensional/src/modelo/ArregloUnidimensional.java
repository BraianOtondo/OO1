package modelo;

import java.util.Arrays;

public class ArregloUnidimensional {
	private int[] vector;

	public ArregloUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "ArregloUnidimensional [vector=" + Arrays.toString(vector) + "]";
	}

	public void mostrarVector() {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("vector [" + i + "]= " + vector[i]);
		}
	}
	
	public int traerElMenor(){
		int menor=vector[0];
		for(int i=1;i<vector.length;i++){
			if(menor>vector[i]){
				menor=vector[i];
			}
		}
		return menor;
	}
	public int traerElMayor(){
		int mayor=vector[0];
		for(int i=1;i<vector.length;i++){
			if(vector[i]<vector[i]){
				mayor=vector[i];
			}
		}
		return mayor;
	}
	
	public double calcularPromedio(){
		int total=0;
		for(int i=0;i<vector.length;i++){
			total=total+vector[i];
		}
		return total/vector.length;
	}
	
	public int[] ordenarAscendente(){
		int i,j,min,aux;
		for(i=0;i<vector.length;i++){
			min=i;
			for(j=i+1;j<vector.length;j++){
				if(vector[min]>vector[j]){
					min=j;
				}
			}
			aux=vector[min];
			vector[min]=vector[i];
			vector[i]=aux;
		}
		return vector;
	}
	
	public int[] ordenarDescendente(){
		int i,j,min,aux;
		for(i=0;i<vector.length;i++){
			min=i;
			for(j=i+1;j<vector.length;j++){
				if(vector[min]<vector[j]){
					min=j;
				}
			}
			aux=vector[min];
			vector[min]=vector[i];
			vector[i]=aux;
		}
		return vector;
	}
	
	public double traerFrecuencia(int numero){
		double contar=0;
		for(int i=0;i<vector.length;i++){
			if(numero==vector[i]){
				contar++;
			}
		}
		return(contar/vector.length)*100;
	}
	
	public int traerModa(){
		int pos=0;
		for(int i=0;i<(vector.length)-1;i++){
			if(this.traerFrecuencia(vector[i])>this.traerFrecuencia(vector[i+1])){
				pos=i;
			}
		}
		return vector[pos];
	}
}
