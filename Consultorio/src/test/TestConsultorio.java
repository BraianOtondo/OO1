package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("José", "Perez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.60f, 90);
		System.out.println("Pacientes");
		System.out.println(paciente1.traerNombreCompleto());
		System.out.println(paciente2.traerNombreCompleto());
		Medico medico=new Medico("Daniel","Lopez","Enfermeria");
		System.out.println("------------------------------------------------");
		System.out.println(medico.toString());
		System.out.println("Paciente: "+paciente1.traerNombreCompleto()+" IMC: "+medico.calcularIMC(paciente1));
		System.out.println("Paciente: "+paciente2.traerNombreCompleto()+" IMC: "+medico.calcularIMC(paciente2));
		
	}

}
