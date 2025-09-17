public abstract  class Luchadores{
    private String nombreLuchador;
    private String categoria;
    private String arma;

    public Luchadores(String nombreLuchador,String categoria,String arma){
     this.nombreLuchador=nombreLuchador;
     this.categoria=categoria;
     this.arma=arma;
      }
      public String obtenerNombreLuchador(){
        return nombreLuchador;
      }
       public String obtenerCategoria(){
        return categoria;
      }
         public String obtenerArma(){
        return arma;
      }
     public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s","nombre del luchador",obtenerNombreLuchador(),
        "nombre de la categoria del luchador",obtenerCategoria(),"nombre del arama del luchador",obtenerArma());
     }
     public abstract double calcularPoder();
    }