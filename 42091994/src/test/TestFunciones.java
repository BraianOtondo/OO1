package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha=LocalDate.of(2022,8,15);
		LocalTime time = LocalTime.of(5, 30, 45, 35);
		Funciones funcion= new Funciones(fecha,time);
		System.out.println(funcion.traerFechaCorta(fecha));
		System.out.println(funcion.traerHoraCorta(time));
		System.out.println(		Funciones.esDiaHabil(fecha));
		System.out.println(funcion.traerDiaDeLaSemana(fecha));
		System.out.println(funcion.traerMesEnLetras(fecha));
		System.out.println(funcion.traerFechaLarga(fecha));
		System.out.println(funcion.esNumero('g'));
		System.out.println(funcion.esLetra('-'));
	}

}
