public class Magos extends Luchadores {
    private double danoPosiones;
    private double nivelVida;

    public Magos(String nombreLuchador,String categoria,String arma,double danoPosiones,double nivelVida){
        super(nombreLuchador, categoria, arma);
        if(danoPosiones<0 || danoPosiones>8){
            throw new  IllegalArgumentException("el dano de posiones  debe ser >=0.0 o <= 8");
        }
        else if(nivelVida <0 || nivelVida>100){
            throw new  IllegalArgumentException("el nivel de vida debe ser >=0.0 o <= 100");
        }
        this.danoPosiones=danoPosiones;
        this.nivelVida=nivelVida;
    }
    public double obtenerDanoPosiones(){
        return danoPosiones;
    }
    public double obtenerNivelVida(){
        return nivelVida;
    }
    public double calcularNivelVida(){
        return obtenerNivelVida()*0.3;
    }
    @Override
    public double calcularPoder(){
        return (obtenerDanoPosiones()*.4)+calcularNivelVida();
    }

    @Override 
    public String toString(){
        return String.format("%n%s%n%s%n%s: %,.2f%n%s: %,.2f%n%s: %,.2f","categoria magos",super.toString(),
            "dano de la posion  del personaje",obtenerDanoPosiones(),"poder del personaje",calcularPoder(),
            "nivel de vida del personaje ",calcularNivelVida());
    }

}
