/**
 * 
 */
package guia05.Problema01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yamil
 *
 */
public class Camino {
	
	private ArrayList<Coordenada> listaCoordenadas = new ArrayList<>();
	
	public void agregar(Coordenada x) {
		
		this.listaCoordenadas.add(x);
		
	}
	
	public void agregar(double lat, double lng) {
		
		this.agregar(new Coordenada(lat,lng));
		
	}
	
//	public void agregar(int mtsLt,int mtsLn) {
//		
//		new_latitude  = latitude  + (dy / r_earth) * (180 / pi);
//		new_longitude = longitude + (dx / r_earth) * (180 / pi) / cos(latitude * pi/180);
//		
//	}
	
	public List<Coordenada> buscar(Coordenada no, Coordenada se) {
		
		ArrayList<Coordenada> rta = new ArrayList<>();
		
		for(Coordenada unaCoordenada: this.listaCoordenadas) {
			if(unaCoordenada.getLatitud() < se.getLatitud() && unaCoordenada.getLatitud() > no.getLatitud()
			&& unaCoordenada.getLongitud() > se.getLongitud() && unaCoordenada.getLongitud() < no.getLongitud())
			{
				rta.add(unaCoordenada);
				}
		}
		return rta;
		
	}
	
//	public List<Coordenada> buscar(Coordenada unaCoordenada, int mtrs) {
//		
//		ArrayList<Coordenada> rta = new ArrayList<>();
//		return rta;
//		
//	}
	
	public void mostrar() {
		for(int i=0; i<this.listaCoordenadas.size(); i++) {
		System.out.println("Coordenada "+(i+1)+": "+this.listaCoordenadas.get(i));
		}
	}

}
