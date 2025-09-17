public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase; // salario base por semana

	// constructor con seis argumentos
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, 
		String numeroSeguroSocial, double ventasBrutas, 
		double tarifaComision, double salarioBase)
	{
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
		// la llamada implícita al constructor predeterminado de Object ocurre aquí

		// si ventas Brutas son inválidas, lanza excepción
		if(ventasBrutas < 0.0)
			throw new IllegalArgumentException(
				"Las ventas brutas deben ser >= 0.0");
		
		// si tarifa comisión es inválida, lanza excepción
		if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException(
				"La tarifa de comisión debe ser >0.0 y < 1.0");

		// si salarioBase es inválido, lanza excepción
		if(salarioBase < 0.0)
			throw new IllegalArgumentException(
				"El salario base debe ser >= 0.0");

		
		this.salarioBase = salarioBase;
	} // fin del constructor

	
	// establece el salario base
	public void establecerSalarioBase(double salarioBase)
	{
		if(salarioBase < 0.0)
			throw new IllegalArgumentException(
				"El salario base debe ser >= 0.0");

		this.salarioBase = salarioBase;
	}

	// devuelve el salario base
	public double obtenerSalarioBase()
	{
		return salarioBase;
	}

	// calcula los ingresos
    @Override 
	public double obtenerMontoPago()
	{
		return salarioBase + (obtenerTarifaComision() *obtenerVentasBrutas());
	}

	// devuelve representación String de EmpleadoBaseMasComision
	@Override
	public String toString()
	{
		return String.format("%s%n%s%n%s: $%,.2f%n"
        ,"empleado base mas comision",super.toString()
			,"salario base", obtenerSalarioBase());
	}

}
