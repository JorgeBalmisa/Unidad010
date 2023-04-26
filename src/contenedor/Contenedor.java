package contenedor;
import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T extends Comparable<T>> {

	private T[] tabla;
	
	public Contenedor(T[] tabla) {
		this.tabla = tabla;
	}
	
	public void insertarAlPrincipio(T nuevo) {
		T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
	        System.arraycopy(tabla, 0, nuevaTabla, 1, tabla.length);
	        nuevaTabla[0] = nuevo;
	        tabla = nuevaTabla;
		
	}
	
	public void insertarAlFinal(T nuevo) {
		T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
		nuevaTabla[nuevaTabla.length - 1] = nuevo;
		tabla = nuevaTabla;
	}
	
	public T extraerDelFinal() {
		T devolver = null;
		devolver = tabla[tabla.length - 1];

		tabla = Arrays.copyOf(tabla, tabla.length - 1);

		return devolver;
	}
	
	public T extraerDelPrincipio() {
		T devolver = null;
		devolver = tabla[0];
		tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
		return devolver;
	}
	
	/*
	 * @ param indice
	 * @ return null si el indice no es válido
	 */
	T get (int indice) {
		if (indice > tabla.length - 1 || indice < 0) {
			return null;
		}
		return tabla[indice];
	}
	
	public void ordenar(Comparator<T> c) {
		Arrays.sort(tabla, c);
	}

	
	

	
}
