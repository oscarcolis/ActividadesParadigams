public class LuchadoresPrueba {
    public static void main(String []args){
     
        Ninjas ninjas=new Ninjas("mistic", "media", "katana", 12);
        Dioses dioses=new Dioses("zeus", "alta", "rayo de luz", 15, "bata");
        Magos magos=new Magos("escorpion", "media", "bola de fuego", 8, 95);
        DiosRayo diosRayo=new DiosRayo("hercules", "alta", "punos de rayo", 
        20, "bata, botas de acero", "get over here!!");
         
         Luchadores []luchadores=new Luchadores[4];
         luchadores[0]=ninjas;
         luchadores[1]=dioses;
         luchadores[2]=magos;
         luchadores[3]=diosRayo;

         System.out.println("luchadores procesados en forma polimorfica");
         for(Luchadores bi:luchadores){
            System.out.println(bi);
            if(bi instanceof DiosRayo){
                  DiosRayo p1=(DiosRayo)bi;
                  p1.establecerFrase("tu iras al infierno!!");
                  System.out.printf("la nueva frase es: %S%n",p1.obtenerFrase());
            }
         }
         
         for(int j=0;j<luchadores.length;j++)
         System.out.printf("El objeto %d son %s%n",j,luchadores[j].getClass().getName());
        }
    
}
