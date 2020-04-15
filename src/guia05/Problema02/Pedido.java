/**
 * 
 */
package guia05.Problema02;

import java.util.ArrayList;

/**
 * @author olivetti
 *
 */
public abstract class Pedido {
	
	// ATRIBUTOS
	protected ArrayList<Producto> listaProductos = new ArrayList<>();
	
	// CONSTRUCTORES
	public Pedido() {
		
	}
	
	// agregarProducto(Producto p)” que recibe como argumento un producto y 
	// lo agrega al pedido si es que todavía hay espacio y retorna true.
	// Si ya alcanzó el limite máximo de productos no lo agrega y retorna false.
	public boolean agregarProducto(Producto unProducto) {
		
		this.listaProductos.add(unProducto);
		return true;
		
	}
	
	// precio() y comision()
	public abstract Double precio();
	public abstract Double comisiones();

}
