package mcv_euro;



public class Modelo {

	private double moneda;
	private double cantidad;
	private Double resultado;

	
	public void convertirDolarEuros() {
		this.resultado=cantidad*moneda;
	}
	public void convertirEurosDolar() {
		this.resultado=cantidad*moneda;
	}
	
	public void setMoneda(double moneda) {
		this.moneda=moneda;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getMoneda() {
		return moneda;
	}
	

}
