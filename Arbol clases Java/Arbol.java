package Estructura;

public class Arbol {

	private Nodo Raiz;
	
	Arbol(String  nombre){
		Raiz = new Nodo(nombre);
	}

	public void insertarNodo(String nombre) {
		Nodo n = new Nodo(nombre);
		Raiz.Insertarnodo(n);
	}
	
	public String ImprimirArbolInOrden() {
		return Raiz.ImprimirInOrden();
	}
	
	public Nodo BuscarNodo(String nombre) {
		return Raiz.BuscaInOrden(nombre);
	}
	
	
	public boolean vacio() {
		return Raiz.vacio();
	}
	
	
	
}
