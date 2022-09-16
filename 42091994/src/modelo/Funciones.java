package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {
	private LocalDate fecha;
	private LocalTime hora;
	public Funciones(LocalDate fecha, LocalTime hora) {
		super();
		this.fecha = fecha;
		this.hora = hora;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	//esBisiesto (int anio) : boolean
	//Serán bisiestos los años divisibles por 4, exceptuando los que son divisibles por 100 y no divisibles por
	//400. Ejemplos: son bisiestos 1996, 2004, 2000, 1600; No son bisiestos 1700, 1800, 1900, 2100
	public boolean esBisiesto(int anio){
		return (anio%4==0 && !(anio%100==0 && !(anio%400==0)));
	}
	//En el caso de ser bisiesto es válido el día 29/02/xxxx
	public boolean esFechaValida (LocalDate fecha){
		return esBisiesto(fecha.getYear());
	}
	
}
