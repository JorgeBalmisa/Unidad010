package contenedor;

import java.util.ArrayList;

public class Pila<T> {

	private ArrayList <T> tabla = new ArrayList<T>();
	
	public Pila (ArrayList <T> tabla) {
		this.tabla = tabla;
	}
	
	public void meter (T nuevo) {
		tabla.add(nuevo);
	}
	
	public T sacar() {
		
		T devolver = tabla.get(tabla.size() - 1);
		
		tabla.remove(tabla.size() - 1);
		
		return devolver;
	}
}
