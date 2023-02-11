package Estructura;

import java.util.Scanner;

public class ProbarArbol {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		Arbol arbol = new Arbol("raiz");
		
		
		arbol.insertarNodo("a");
		arbol.insertarNodo("b");
		arbol.insertarNodo("c");
		arbol.insertarNodo("d");
		
		
		System.out.println(arbol.ImprimirArbolInOrden());
		
		Leer.close();
	}
	
	
	

}
