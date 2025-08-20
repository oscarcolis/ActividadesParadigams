public class FigurasTest {
    public static void main(String[] args) {
            Cuadrado cuadrado1=new Cuadrado(4,0,0);
            Triangulo triangulo1=new Triangulo(5, 6, 9,0,0);
            Circulo circulo1=new Circulo( 4, 0, 0);
            System.out.println("*****cuadrado*****");
        System.out.println("el area del cuadrado es: "+cuadrado1.Area());
        System.out.println("el perimetro del cuadrado es: "+cuadrado1.Perimetro());
        System.out.println("******triangulo******");
        System.out.println("el area del triangulo es: "+triangulo1.Area());
        System.out.println("el perimetro del triangulo es: "+triangulo1.Perimetro());

        System.out.println("****circulo*****");
        System.out.println("el area del triangulo es: "+circulo1.Area());
        System.out.println("el perimetro del triangulo es: "+circulo1.Perimetro());

    
    }
}
