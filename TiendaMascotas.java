public class TiendaMascotas {
    
    public static void main(String[] args) {
        
        Dog perro1=new Dog("max", "bull dog", "cafe y blanco", "guaaa", 50);
        Fish pescado1=new Fish("azul", "blue", "espada", "mar");
        System.out.println("el nombre  del perro es: "+perro1.getNombre());
        System.out.println("el peso del perro es: "+perro1.getPeso());
        System.out.println("la raza del perro es: "+perro1.getRaza());
        System.out.println("el color  del perro es: "+perro1.getColor());
        System.out.println("el ladrido del perro es: ");
       perro1.Ladrido();

       System.out.println("el nombre  del pescado es: "+pescado1.getNombre());
        System.out.println("la raza del pescado es: "+pescado1.getRaza());
       System.out.println("el color  del pescado es: "+pescado1.getColor());
       System.out.println("el tipo de agua del pescado es:");
       pescado1.TipoAgua();
    }
}
