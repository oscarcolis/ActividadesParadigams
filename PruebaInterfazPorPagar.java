public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[]objetosPorPagar=new PorPagar[7];
        objetosPorPagar[0]=new Factura("01234", "asiento", 2, 375.000);
        objetosPorPagar[1]=new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2]=new EmpleadoAsalariado("john", "smith", "111-11-111",
         800.000);
        objetosPorPagar[3]=new EmpleadoAsalariado("Lisa", "barns", 
        "888-88-888", 1200.000);
        objetosPorPagar[4]= new EmpleadoPorHoras("nery", "ramos", 
        "5855-8925", 48, 1500);
        objetosPorPagar[5]=new EmpleadoPorComision("ximena", "sanchez", 
        "36-8942", 310, .5);
        objetosPorPagar[6]=new EmpleadoBaseMasComision("sofia", "morales", 
        "89549-8", 15, 0.5, 500);
        System.out.println("Facturas y Empleados procesados en forma polimorfica");
        for(PorPagar porPagarActual:objetosPorPagar){
            if(porPagarActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision p1=(EmpleadoBaseMasComision)porPagarActual;
                p1.establecerSalarioBase(1.10*p1.obtenerSalarioBase());
            System.out.printf("el nuevo salario  base de 10%% de aumento es : $%,.2f%n",p1.obtenerSalarioBase());
    }
            System.out.printf("%n%s%n%s: $%,.2f%n",porPagarActual.toString(),"pago vencido",
            porPagarActual.obtenerMontoPago());
        }
    }
}
