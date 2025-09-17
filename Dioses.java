public class Dioses extends Luchadores {
    private double danoMagia;
    private String atuendo;
    public Dioses(String nombreLuchador,String categoria,String arma,double danoMagia,String atuendo){
           super(atuendo, categoria, arma);
           if(danoMagia<0 || danoMagia>20){
            throw new  IllegalArgumentException("el dano de la magia  debe ser >=0.0 o <= 20");
           }
           this.atuendo=atuendo;
           this.danoMagia=danoMagia;
    }
    public double obtenerDanoMagia(){
        return danoMagia;
    }

    public String obtenerAtuendo(){
        return atuendo;
    }

    @Override
    public double calcularPoder(){
        return obtenerDanoMagia()*.10;
    }

    @Override
    public String toString(){
        return String.format("%n%s%n%s%n%s: %,.2f%n%s: %,.2f%n%s: %s","categoria Dioses",super.toString(),
            "dano de la magia del personaje",obtenerDanoMagia(),"poder del personaje",calcularPoder(),
            "nombre del atuendo",obtenerAtuendo());
    }
}
