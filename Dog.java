public class Dog extends Animal {
    
     private String ladrido="woof";
     private double peso;

     public Dog(String nombre,String raza,String color,String ladrido,double peso){
        super(raza, nombre, color);
        this.ladrido=ladrido;
        this.peso=peso;

     }

     public String getLadrido() {
         return ladrido;
     }

     public void setLadrido(String ladrido) {
         this.ladrido = ladrido;
     }

     public double getPeso() {
         return peso;
     }

     public void setPeso(double peso) {
         this.peso = peso;
     }

     public void Ladrido(){
        System.out.println(ladrido);
     }

     public void Ladrido(String ladrido){
        System.out.println(ladrido);
     }

     
}
