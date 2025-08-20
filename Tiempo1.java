public class Tiempo1 {
    // se cren lo atributos de la clase de tipo int con acceso private a la variables 
    private int hora;
    private int minuto;
    private int segundo;
// se construye un metodo setter para establecer el avlor de las variables

    public void establecerTiempo(int hora, int minuto, int segundo){
// se crea una condicion en el haya varias opciones es caso de que no se cumplan porque el eso ocupamos 
// el operador logico  or 
        if(hora<0||hora>=24||minuto<0||minuto>=60|| segundo<0||segundo>=60){
            throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de rango");

        }
// se les asigna los valores
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }
//este es un metodo funcional que nos regresa una cadena de caracteres 
    public String aStringUniversal(){

        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
    //se crea un metodo funcional que retorna una valor de tipo String
    //
    public String toString() {
        //llama a un maetodo llamado format este metodo lo que hace es especificar como se va ordenar la informacion
        //primero llama la hora despues el residuo de hora/12, luego ordena el segundo despues ordena am pm en caso de
        //hora sea mayor a 12 o menor
return String.format("%d:%02d:%02d %s",
((hora == 0 || hora == 12) ? 12 : hora % 12),
minuto, segundo, (hora < 12 ? "AM" : "PM"));
}
}
