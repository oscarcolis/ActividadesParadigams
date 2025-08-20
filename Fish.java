public class Fish extends Animal {
    private String TipoAgua;

    public Fish(String color,String nombre,String raza, String TipoAgua){
        super(raza, nombre, color);
        this.TipoAgua=TipoAgua;
    }

    public void TipoAgua(){
        System.out.println(TipoAgua);
    }

    public void TipoAgua(String TipoAgua){
        System.out.println(TipoAgua);
    }
}
