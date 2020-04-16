/**
 * 
 */
package guia05.Problema02;

/**
 * @author yamil
 *
 */
public class App {

	public static void main(String[] args) {
		
		Producto a = new Producto("a",1.5);
		Producto b = new Producto("b",2.5);
		Tramite t1 = new Tramite();
		Tramite t2 = new Tramite();
		
		Pedido p1 = new PedidoBasico(false);
		p1.agregarProducto(a);
		p1.agregarProducto(a);
		p1.agregarProducto(a);
		p1.agregarProducto(a);
		p1.agregarProducto(a);
		
		Pedido p2 = new PedidoBasico(true);
		p2.agregarProducto(a);
		p2.agregarProducto(a);
		p2.agregarProducto(a);
		p2.agregarProducto(a);
		p2.agregarProducto(a);
		
		Pedido p3= new PedidoPremium();
		p3.agregarProducto(b);
		p3.agregarProducto(b);
		p3.agregarProducto(b);
		p3.agregarProducto(b);
		p3.agregarProducto(b);
		
		Cadete c1 = new Cadete();
		c1.agregarPedido(p1);
		c1.agregarPedido(p2);
		c1.agregarPedido(p3);
		c1.agregarTramite(t1);
		c1.agregarTramite(t2);
		
		System.out.println(c1.comisiones());

	}

}
