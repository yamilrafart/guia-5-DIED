/**
 * 
 */
package guia05.Problema02;

/**
 * @author olivetti
 *
 */
public class PedidoBasico extends Pedido {
	
	// ATRIBUTOS
	private final Integer _MAX_PRODUCTOS = 5;
	private boolean express;
	
	// CONSTRUCTORES
	public PedidoBasico() {
		
	}
	
	public PedidoBasico(boolean esExpress) {
		
		super();
		this.express = esExpress;
		
	}
	
	
	// agregarProducto(Producto p)” que recibe como argumento un producto y 
	// lo agrega al pedido si es que todavía hay espacio y retorna true.
	// Si ya alcanzó el limite máximo de productos no lo agrega y retorna false.
	@Override
	public boolean agregarProducto(Producto unProducto) {
			
		if (this.listaProductos.size() == this._MAX_PRODUCTOS) {
			
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
	public  Double comision() {
		
		if (this.express) {
			
			return this.precio()*0.2;
			
		} else {
			
			Double total = 0D;
			for(Producto unProducto : this.listaProductos) {
				
				total += (unProducto.getCosto()*0.05);
				
			}
			return total;
			
		}
		
	}


}
