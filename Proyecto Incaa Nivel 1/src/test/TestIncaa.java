package test;

import modelo.Incaa;

public class TestIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incaa incaa = new Incaa();
		System.out.println("Prueba Agregar:");
		try {
			System.out.println(incaa.agregarPelicula("Spiderman 1"));
			System.out.println(incaa.agregarPelicula("Spiderman 2"));
			System.out.println(incaa.agregarPelicula("Spiderman 1"));

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		System.out.println("Prueba Modificar");
		try {
			System.out.println(incaa.modificarPelicula(2,"Spiderman Far From Home"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Prueba Eliminar");
		try {
			System.out.println(incaa.eliminarPelicula(2));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(incaa.toString());
	}

}
