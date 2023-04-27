package contenedor;

public class MainContenedor {

	public static void main(String[] args) {
		
		Pila<Integer> pila = new Pila<Integer>();
		
		pila.meter(34);
		pila.meter(43);
		
		System.out.println(pila.toString());
	}

}
