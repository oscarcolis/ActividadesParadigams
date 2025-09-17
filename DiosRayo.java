public class DiosRayo extends Dioses {
    private String frase;
    public DiosRayo(String nombreLuchador,String categoria,String arma,double danoMagia,String atuendo,String frase){
     super(nombreLuchador, categoria, arma, danoMagia, atuendo);
     this.frase=frase;
    }
    public void establecerFrase(String frase){
        this.frase=frase;
    }
    public String obtenerFrase(){
        return frase;
    }
    public double calcularDanoArma(){
        return obtenerDanoMagia()*.5;
    }
    @Override
    public double calcularPoder(){
        return super.calcularPoder()+ calcularDanoArma();
    }
    @Override
    public String toString(){
        return String.format("%n%s%n%s: %s%n%s: %,.2f%n%s: %,.2f",super.toString(),"frase del personaje",obtenerFrase(),
       "dano del arma ", calcularDanoArma(),"poder del personaje",calcularPoder());
    }
}
