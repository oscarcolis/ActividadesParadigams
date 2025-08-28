

public class Estudiante extends Persona {
    
    private int id;
    private String licenciatura;
    private String carrera;

    private int anoGraduacion;
    private double calif=0.0;

    public Estudiante(String apellidoPaterno,String apellidoMaterno,String nombre,String fechaNacimiento,
    String licenciatura,int id, String carrera, int anoGraduacion){
        super(apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento);
        this.licenciatura=licenciatura;
        this.carrera=carrera;
        this.id=id;
        this.anoGraduacion=anoGraduacion;

    }
public double obtenerCalif(){
    return calif;
}

    public void cambiarCarrera(String carrera) {
        System.out.println("la nueva carrera es: "+carrera);
        this.carrera=carrera;
    }

    public double promedioFinal(String []calificacion){
        double suma=0.0;
        
        for(int i=0;i<calificacion.length;i++){

            if(calificacion[i].equals("A")||calificacion[i].equals("a")){
               suma+=4;
            }
            else if(calificacion[i].equals("A-")||calificacion[i].equals("a-") ){
              suma+=3.67;
            }
            else if(calificacion[i].equals("b+")||calificacion[i].equals("B+") ){
                suma+=3.33;
            }
            else if(calificacion[i].equals("b")||calificacion[i].equals("B") ){
              suma+=3;
            }
          else if(calificacion[i].equals("b-")||calificacion[i].equals("B-") ){
             suma+=2.67;

          }
         else if(calificacion[i].equals("c+")||calificacion[i].equals("C+") ){
             suma+=2.33;
             
          }
          else if(calificacion[i].equals("c")||calificacion[i].equals("C") ){
             suma+=2;
             
          }
          else if(calificacion[i].equals("D")||calificacion[i].equals("d") ){
             suma+=1;
             
          }
          else if(calificacion[i].equals("f")||calificacion[i].equals("F") ){
             suma+=0;
             
          }
          

        }
        if(suma>0){
         calif= suma/calificacion.length;
        }
        else{
            return calif;
        }
        return calif;
    }

    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %d%n%s: %.2f%n%s: %s%n%s: %s%n%s: %d",
        "nombre del alumno", nombre,"fecha de nacimiento", fechaNacimiento, "id del estudiante",
        id,"promedio del estudiante",calif,"cual es el grado obtenido",carrera,"cual es la licenciatura",
        licenciatura,"ano de graduacion",anoGraduacion);
    }

}
