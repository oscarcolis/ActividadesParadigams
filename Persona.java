
public class Persona {
    private String apellidoPaterno;
    private String apellidoMaterno;
    public String nombre;
    public String fechaNacimiento;
    public Persona(String apellidoPaterno,String apellidoMaterno,String nombre,String fechaNacimiento){
        this.apellidoMaterno=apellidoMaterno;
        this.apellidoPaterno=apellidoPaterno;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;

    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


}
