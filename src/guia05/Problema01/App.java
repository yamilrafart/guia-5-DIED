/**
 * 
 */
package guia05.Problema01;

/**
 * @author yamil
 *
 */
public class App {

		public static void main(String[] args) {
		
			//CREAR COORDENADAS
			Coordenada c1 = new Coordenada(1.1,1.1);
			Coordenada c2 = new Coordenada(2.2,2.2);
			Coordenada c3 = c1;
			
			//METODO EQUALS - COORDENADAS
			System.out.println("c1 == c1? "+c1.equals(c1));
			System.out.println();
			System.out.println("c1 == c2? "+c1.equals(c2));
			System.out.println();
			System.out.println("c1 == c3? "+c1.equals(c3));
			
			//METODO TOSTRING - COORDENADAS
			System.out.println();
			System.out.println(c1.toString());
			
			//CAMINO
			Camino ca1 = new Camino();
			
			//METODO AGREGAR'S - CAMINO
			ca1.agregar(c1);
			ca1.agregar(c2);
			ca1.agregar(c3);
			ca1.agregar(0.0,0.0);
			System.out.println();
			ca1.mostrar();
			
			

	}

}
