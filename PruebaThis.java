// se crea la clase 
public class PruebaThis {
    // se crea el método main
public static void main(String[] args) {
// creamos el objeto de la clase
TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
// Imprime un mensaje dentro del parantesis llama al metodo
System.out.println(tiempo.crearString());
}
}
class TiempoSimple {
    // se crean la variables con el tipo de acceso private 
    private int hora;
private int minuto;
private int segundo;
// se crea un constructor con parametros 
public TiempoSimple(int hora, int minuto, int segundo) {
this.hora = hora;
this.minuto = minuto;
this.segundo = segundo;
}

// se crea un metodo funcional 
public String crearString() {
    // ordena el mensaje de la siguiente manera primero ordena a la cadena de caracteres luego hace un espacio
    //despues ordena la cadena de caracteres del metodo aStringUniversal() luego hace un salto de linea 
    //ordena el metodo de aStringUniversal() despues da un espacio para ordenar aStringUniversal()
return String.format("%24s: %s%n%24s: %s",
"this.aStringUniversal()", this.aStringUniversal(),
"aStringUniversal()", aStringUniversal());
}
// se crea un metodo funcional en el cual va regresar una cadena de caracteres 
public String aStringUniversal() {
    // ordena el mensaje con el metodo format y queda de la siguiente manera primero ordena la hora despues el minuto 
    //por ultimo los segundos 
return String.format("%02d:%02d:%02d",
this.hora, this.minuto, this.segundo);
}
}
