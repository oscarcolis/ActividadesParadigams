public class Animal {
    
    private String raza;
    private String nombre;
    private String color;

    public Animal(String raza,String nombre,String color ){
        this.raza=raza;
        this.nombre=nombre;
        this.color=color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
