public class Ninjas extends Luchadores {
    private double danoArma;
   

    public Ninjas(String nombreLuchador,String categoria,String arma,double danoArma){
     super(nombreLuchador, categoria, arma);
     if(danoArma<0 || danoArma>15){
     throw new  IllegalArgumentException("el dano  debe ser >=0.0 o <=15");
    }
    this.danoArma=danoArma;
}
         public double obtenerDanoArma(){
            return danoArma;
         }
         @Override
         public double calcularPoder(){
            return obtenerDanoArma()*.15;
         }
         @Override
          public String toString(){
            return String.format("%n%s%n%s%n%s: %,.2f%n%s: %,.2f","categoria ninjas",super.toString(),
            "dano del arma del personaje",obtenerDanoArma(),"poder del personaje",calcularPoder());
          }
}
