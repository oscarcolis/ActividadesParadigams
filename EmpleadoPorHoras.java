public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horasTrabajadas;
   private  double sueldoHoras;

    public EmpleadoPorHoras(String primerNombre,String apellidoPaterno,
    String numeroSeguroSocial, double horasTrabajadas,double sueldo)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        if(sueldo<0.0){
            throw new IllegalArgumentException("el sueldo debe ser >=0.0");

        }
        else if(horasTrabajadas<0.0||horasTrabajadas>168){
            throw new IllegalArgumentException("las horas deben ser >=0.0 y < =168");


        }
        this.horasTrabajadas=horasTrabajadas;
        this.sueldo=sueldo;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
         if(horasTrabajadas<0.0||horasTrabajadas>168){
            throw new IllegalArgumentException("las horas deben ser >=0.0 y < =168");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setSueldo(double sueldo) {
         if(sueldo<0.0){
            throw new IllegalArgumentException("el sueldo debe ser >=0.0");
        }
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
    
     @Override
    public double obtenerMontoPago(){
        
        if(horasTrabajadas<=40){
           sueldoHoras= getSueldo()*getHorasTrabajadas();
        }
        else if(horasTrabajadas>40){
             sueldoHoras= (getSueldo()*40)+(getHorasTrabajadas()-40)*(getSueldo()*1.5);
        }
        return sueldoHoras;
    }

     public double getSueldoHoras() {
         return sueldoHoras;
     }

     @Override
     public String toString(){
        return String.format("%n%s: %n%s%n%s: $%.2f%n%s: %f%n%s: $%,.2f%n",
        "EmpleadoPorHoras",super.toString(),"suledo del empleado",getSueldo(),
        "horas trabajadas ",getHorasTrabajadas(),"sueldo por horas",getSueldoHoras());
     }

}
