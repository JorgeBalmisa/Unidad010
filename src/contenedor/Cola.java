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
		if (tabla.isEmpty()) {
			return null;
		}
		return tabla.remove(0);
	}
	
	public ArrayList <T> getCola() {
		return tabla;
	}
}
