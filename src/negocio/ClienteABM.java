package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
    ClienteDao dao = new ClienteDao();

    public Cliente traer(long idCliente){
        Cliente c = dao.traer(idCliente);
        return c;
        }

    public Cliente traer(int dni){
        Cliente c = dao.traer(dni);
        return c;
        }
    public int agregar(String apeliido, String nombre, int dni, LocalDate fechaDeNacimiento) throws Exception{
        //consultar si existe un cliente con el mismo dni, si excioste arrojar exception
        if(dao.traer(dni) == null){
        Cliente c = new Cliente(apeliido, nombre, dni, fechaDeNacimiento);
        return dao.agregar(c);
        }else{
            throw new Exception("El dni ya esta registrado");
        }
    }
    public void modificar(Cliente c) throws Exception{
        //implementar que no exista un cliente con el mismo documento
    	
    	
        dao.actualizar(c);
    }
    public void eliminar(long idCliente) throws Exception{
        //implementar que si es nulo que arroje la excepcion
        Cliente c = dao.traer(idCliente);
        if(c != null) {

        dao.eliminar(c);
        	}
        else {
        	throw new Exception("Cliente no existe");
        	}
        
    }
    public List<Cliente> traer(){
        return dao.traer();
        

    }

    public Cliente traerClienteYContacto(long idCliente){

        Cliente c = dao.traerClienteYContacto(idCliente);

        return c;

    }

}