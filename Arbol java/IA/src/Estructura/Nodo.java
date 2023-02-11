package Estructura;

public class Nodo {

	private String nombre;
	private Nodo izq;
	private Nodo der;
	
	Nodo(String nombre){
		this.nombre = nombre;
		this.der = null;
		this.izq = null;
	}
	public void Insertarnodo(Nodo n) {
		if(0 > (n.nombre.compareTo(this.nombre))) {	
			if(izq != null) {
				izq.Insertarnodo(n);
				return;
			}else {
				this.izq = n;
			}
		}
		if(0 < (n.nombre.compareTo(this.nombre))) {	
			if(der != null) {
				der.Insertarnodo(n);
				return;
			}else {
				this.der = n;
			}
		}
	}
	public Nodo BuscaInOrden(String nombre) {
		Nodo Retorno = null;
		String compara = this.nombre;
		
		if(nombre.equals(compara)) 
		{
			return this;
		}
		if(izq != null) 
		{
			Retorno = izq.BuscaInOrden(nombre);
		}else if (der != null)
		{
			Retorno = der.BuscaInOrden(nombre);
		}
		
		if(Retorno != null) {
			return Retorno;
		}
			return null;

	}
	public String ImprimirInOrden() {
		String Nombres="";
		
		if(this.izq != null) {
			Nombres = this.izq.ImprimirInOrden();
		}
		if(this.der != null){
			Nombres = this.der.ImprimirInOrden();
		}
		return Nombres+" "+this.nombre;
	}
	
	public boolean vacio() {
		if(izq == null && der == null) {
			return true;
		}
		return false;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
}
