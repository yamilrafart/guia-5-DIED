/**
 * 
 */
package guia05.Problema01;

/**
 * @author olivetti
 *
 */
public class Coordenada {
	
	private double latitud, longitud;

	public Coordenada() {
		
	}
	
	public Coordenada(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		
		Coordenada other = (Coordenada) obj;
		if ((this.latitud == other.latitud)&&(this.longitud == other.longitud)) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString( ) {
		
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + "]";
		
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}
	
	

}
