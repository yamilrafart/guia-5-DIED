/**
 * 
 */
package guia05.Problema02;

/**
 * @author olivetti
 *
 */
public class PedidoPremium extends Pedido {
	
	// ATRIBUTOS
	private final Integer _MAX_PRODUCTOS_V1 = 5;
	private final Integer _MAX_PRODUCTOS_V2 = 20;
		
	// CONSTRUCTOR
	public PedidoPremium() {
			
		super();
			
	}
		
	// agregarProducto(Producto p)” que recibe como argumento un producto y 
	// lo agrega al pedido si es que todavía hay espacio y retorna true.
	// Si ya alcanzó el limite máximo de productos no lo agrega y retorna false.
	@Override
	public boolean agregarProducto(Producto unProducto) {
				
		if (this.listaProductos.size() == this._MAX_PRODUCTOS_V2) {
				
			return false;
				
		} else {
				
			return super.agregarProducto(unProducto);
				
		}
				
	}
	
	// precio() y comision()
	@Override
	public  Double precio() {
			
		Double total = 0D;
		for(Producto unProducto : this.listaProductos) {
				
			total += unProducto.getCosto();
				
		}
		return total;
			
	}
		
	@Override
	public  Double comisiones() {
		
		Double total = 0D;
		if (this.listaProductos.size() <= this._MAX_PRODUCTOS_V1) {
			
			for(Producto unProducto : this.listaProductos) {
				
				total += (unProducto.getCosto()*0.2);
				
			}
			return total;
			
		} else {
			
for(Producto unProducto : this.listaProductos) {
				
				total += (unProducto.getCosto()*0.3);
				
			}
			return total;
			
		}
			
	}

}
