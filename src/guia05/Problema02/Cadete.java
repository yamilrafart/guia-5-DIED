/**
 * 
 */
package guia05.Problema02;

import java.util.ArrayList;

/**
 * @author yamil
 *
 */
public class Cadete {
	
	// ATRIBUTOS
	ArrayList<Comisionables> listaObjetos = new ArrayList<>();
	
	//CONSTRUCTOR
	public Cadete() {
		
	}
	
	//“agregarPedido”: agrega un pedido que tiene que llevar el cadete
	public void agregarPedido(Pedido unPedido) {
		
		this.listaObjetos.add(unPedido);
		
	}
	public void agregarTramite(Tramite unTramite) {
		this.listaObjetos.add(unTramite);
	}
	
	//“comisiones” que retorna el total de comisiones que cobrará el cadete
	//por todos los pedidos que le han agregado.
	public Double comisiones() {
		
		Double total = 0D;
		int i =0;
		for(Comisionables unObjeto : this.listaObjetos) {
			
			if (unObjeto instanceof PedidoBasico) {
				
				total += ((((PedidoBasico)unObjeto).precio() + ((PedidoBasico)unObjeto).comision())*0.1);
				i += ((PedidoBasico)unObjeto).listaProductos.size();
				
			} else if (unObjeto instanceof PedidoPremium) {
				
				total += ((((PedidoPremium)unObjeto).precio() + ((PedidoPremium)unObjeto).comision())*0.15);
				i += ((PedidoPremium)unObjeto).listaProductos.size();
				
			} else if (unObjeto instanceof Tramite) {
				
				total += ((Tramite)unObjeto).comision();
				
			}
			
			if (i == 10) {
				i=0;
				total += 50;
			}
			
		}
		return total;
		
	}
	

}
