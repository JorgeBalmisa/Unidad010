package contenedor;

import java.util.ArrayList;

public class Cola<T> {

	private ArrayList <T> tabla = new ArrayList<T>();
	
	public Cola (ArrayList <T> tabla) {
		this.tabla = tabla;
	}
	
	
	public void meter(T nuevo) {
		tabla.add(nuevo);
	}
	public T sacar() {
		T devolver = null;
		devolver = tabla.get(0);
		tabla.remove(0);
		
		return devolver; 
	}
}
