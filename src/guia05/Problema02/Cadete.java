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
	ArrayList<Pedido> listaPedidos = new ArrayList<>();
	
	//CONSTRUCTOR
	public Cadete() {
		
	}
	
	//“agregarPedido”: agrega un pedido que tiene que llevar el cadete
	public void agregarPedido(Pedido unPedido) {
		
		this.listaPedidos.add(unPedido);
		
	}
	
	//“comisiones” que retorna el total de comisiones que cobrará el cadete
	//por todos los pedidos que le han agregado.
	public Double comisiones() {
		
		Double total = 0D;
		int i =0;
		for(Pedido unPedido : this.listaPedidos) {
			
			if (unPedido instanceof PedidoBasico) {
				
				total += ((unPedido.precio() + unPedido.comisiones())*0.1);
				
			} else if (unPedido instanceof PedidoPremium) {
				
				total += ((unPedido.precio() + unPedido.comisiones())*0.15);
				
			}
			i += unPedido.listaProductos.size();
			if (i == 10) {
				i=0;
				total += 50;
			}
			
		}
		return total;
		
	}
	

}
