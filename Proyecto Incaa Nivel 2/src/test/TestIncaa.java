package test;

import modelo.Genero;
import modelo.Incaa;

public class TestIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genero genero1=new Genero(1,"Ciencia Ficcion");
		Genero genero2=new Genero(2,"Terror");
		Genero genero3=new Genero(3,"Supervivencia");
		Incaa incaa=new Incaa();
		System.out.println("Agregar Pelicula");
		try {
			System.out.println(incaa.agregarPelicula("Hombre Lobo",genero2));
			System.out.println(incaa.agregarPelicula("The Mandalorian",genero1));
			System.out.println(incaa.agregarPelicula("Greenhell",genero3));
			System.out.println(incaa.agregarPelicula("Outlast",genero2));
			System.out.println(incaa.agregarPelicula("The Ring", genero2));
			System.out.println(incaa.agregarPelicula("The Forest", genero3));
			System.out.println(incaa.agregarPelicula("Project Zomboid", genero3));
			System.out.println(incaa.agregarPelicula("Hombre Lobo",genero1));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Modificar Pelicula");
		try {
			System.out.println(incaa.modificarPelicula(1,"Hombre Lobo por la noche"));
			System.out.println(incaa.modificarPelicula(3,"Green Hell"));
			System.out.println(incaa.modificarPelicula(6,"Friday 13"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Traer Pelicula");
		System.out.println(incaa.traerPelicula(1));
		System.out.println(incaa.traerPelicula(2));
		System.out.println(incaa.traerPelicula(3));
		System.out.println(incaa.traerPelicula(4));
		System.out.println(incaa.traerPelicula(5));
		System.out.println("Tamaño:"+incaa.getCatalogo().size());
		System.out.println("Eliminar Pelicula");
		try {
			System.out.println(incaa.eliminarPelicula(2));
			System.out.println(incaa.eliminarPelicula(10));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Traer Pelicula");
		System.out.println(incaa.traerPelicula(1));
		System.out.println(incaa.traerPelicula(2));
		System.out.println(incaa.traerPelicula(3));
		System.out.println(incaa.traerPelicula(4));
		System.out.println(incaa.traerPelicula(5));
		System.out.println("Tamaño:"+incaa.getCatalogo().size());
		System.out.println("Imprimir por Genero");
		incaa.imprimirPeliculaPorGenero(genero2);
	}

}
