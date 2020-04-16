/**
 * 
 */
package guia05.Problema02;

/**
 * @author yamil
 *
 */
public class Tramite implements Comisionables {
	
	// ATRIBUTOS
	private String descripcion;
	private String domicilio;
	
	// CONSTRUCTORES
	public Tramite() {
		
	}
	
	public Tramite(String unaDescripcion, String unDomicilio) {
		
		super();
		this.descripcion = unaDescripcion;
		this.domicilio = unDomicilio;
		
	}
	
	// comision()
	public Double comision() {
		
		return 20D;
		
	}

}
