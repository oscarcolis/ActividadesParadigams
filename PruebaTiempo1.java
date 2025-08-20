public class PruebaTiempo1 {
    // se crea la clase main
public static void main(String[] args) {
// creamos un objeto de la clase objeto
Tiempo1 tiempo = new Tiempo1();
mostrarTiempo("Después de crear el objeto tiempo", tiempo);
System.out.println();
// el objeto llama a los métodos
tiempo.establecerTiempo(13, 27, 6);
mostrarTiempo("Después de llamar a establecerTiempo", tiempo);
System.out.println();

try {
// el objeto llama al método en donde tiene parametros con la variables hora, minuto, segundo
tiempo.establecerTiempo(99, 99, 99);
}
// imprime un mensaje de excepcion 
catch (IllegalArgumentException e) {
System.out.printf("Excepción: %s%n%n", e.getMessage());
}
// en caso de que no exista una excepcion llama el metodo private que se encuentra en esta clase 
mostrarTiempo("Después de llamar a establecerTiempo con valores inválidos", tiempo);
}
// se crea un metodo con el tipo de acceso private que no tiene ningun tipo de  retorno 
// lo que hace este metodo duncional es imprimir un mensaje ordenado
private static void mostrarTiempo(String encabezado, Tiempo1 t) {
    // primero va ordenar el encabezado, despues un salto de linea, luego va a ordenar al metodo aStringUniversal
    //luego hace un salto de linea y por ultimo ordena el metodo toString
System.out.printf("%s%nTiempo universal: %s%nTiempo estándar: %s%n",
encabezado, t.aStringUniversal(), t.toString());
}
}



