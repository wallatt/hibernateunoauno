package negocio;

import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;

public class ContactoABM {
    ContactoDao dao = new ContactoDao();

    public Contacto traer(long idContacto){
        Contacto c = dao.traer(idContacto);
        return c;
        }

    
    public int agregar(String email, String movil, String fijo, Cliente cliente){
        //consultar si existe un cliente con el mismo dni, si excioste arrojar exception
        Contacto c = new Contacto(email, movil, fijo, cliente);
        return dao.agregar(c);
    }
    public void modificar(Contacto c) {
        //implementar que no exista un cliente con el mismo documento
    	dao.actualizar(c);
    }
    public void eliminar(long idContacto){
        //implementar que si es nulo que arroje la excepcion
        Contacto c = dao.traer(idContacto);
        
        dao.eliminar(c);
    }
  
    
}
