package test;


import java.time.LocalDate;
import negocio.ClienteABM;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String apellido = "ambrosio";
		String nombre = "asdasdac";
		int documento = 54221225;
		
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abm = new ClienteABM();
		
		try {
		long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}