import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        System.out.println("introduce tu nombre: ");
        String nombre=n.nextLine();
        System.out.println("introduce tu apellido paterno: ");
        String apellidoPaterno=n.nextLine();
        System.out.println("introduce tu apellido Materno: ");
        String apellidoMaterno=n.nextLine();
        System.out.println("introduce tu id: ");
        int id=n.nextInt();
        n.nextLine();
        System.out.println("introduce tu carrera: ");
        String carrera=n.nextLine();
        System.out.println("introduce tu licenciatura: ");
        String licenciatura=n.nextLine();
        System.out.println("introduce tu fecha de nacimiento: ");
        String nacimiento=n.nextLine();
        System.out.println("introduce tu fecha de graduacion: ");
        int graduacion=n.nextInt();
        
        Estudiante ye=new Estudiante (apellidoPaterno, apellidoMaterno, nombre,
        nacimiento, licenciatura, id, carrera, graduacion);
     
        String []calificaciones=new String[6];
        System.out.println("introduce tu nota conforme a,a-,b+,b,b-,c+,c,d,f ");
        n.nextLine();
        for(int i=0;i<calificaciones.length;i++){
           System.out.println("introduce tu nota  "+i+":");
           calificaciones[i]=n.nextLine();
           
                }
             ye.promedioFinal(calificaciones);
              System.out.println("la calificacion del estudiante es: "+ye.obtenerCalif());
             System.out.println();
             System.out.println("desea cambiar de carrera: ");
             String cambiar=n.nextLine();
              n.nextLine();
             if(cambiar.equals("si")||cambiar.equals("SI")){
               System.out.println("introduce la carrera que deseas cambiar");
               String c=n.nextLine();
                ye.cambiarCarrera(c);
                System.out.println("fin del programa");
                
             }
             else{
                System.out.println("fin del programa");
             }
             System.out.println(ye.toString());
        
    }
}
