/**
 * 
 */
package guia05.Problema02;

/**
 * @author yamil
 *
 */
public class Producto {
	
	// ATRIBUTOS
	private String descipcion;
	private Double costo;
	
	// CONSTRUCTORES
	public Producto() {
		
	}
	
	public Producto(String descipcion, Double costo) {
		super();
		this.descipcion = descipcion;
		this.costo = costo;
	}

	
	// GETTERS
	public Double getCosto() {
		return costo;
	}

}
