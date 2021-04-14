package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYContacto {
    public static void main(String[] args){

        ClienteABM abm = new ClienteABM();
        long idCliente = 1;

        Cliente c = abm.traerClienteYContacto(idCliente);
        System.out.println(c+ "..."+c.getContacto());


    }
    
}
