package datos;
    
import java.time.LocalDate;
    
public class Cliente {
    private long idCliente;
    private String apellido;
    private String nombre;
    private int dni;
    private LocalDate fechaDeNacimiento;
    private boolean baja;
    private Contacto contacto;

    public Cliente() {
    }

    public Cliente(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.baja = false;
        
    }

    public Cliente(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento, Contacto contacto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.baja = false;
        this.setContacto(contacto);
    }

    public long getIdCliente() {
        return this.idCliente;
    }

    protected void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apeliido) {
        this.apellido = apeliido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isBaja() {
        return this.baja;
    }

    public boolean getBaja() {
        return this.baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }


    public Contacto getContacto() {
        return this.contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }



    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", apeliido='" + getApellido() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            ", fechaDeNacimiento='" + fechaDeNacimiento.getMonthValue()+" "+ fechaDeNacimiento.getYear()+ "'" +
            ", baja='" + isBaja() + "'" +
            "}";
    }


}
