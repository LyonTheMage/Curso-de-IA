package puzzle;

import java.util.Scanner;



public class Puzzle8 {

    public static String estadoInicialEasy = "123456 78";
    public static String estadoInicialHard = "234 56718";
    public static String estadoFinal = "12345678 ";
    private static Scanner Leer;
    
    public static void main(String[] args) {
    	Leer = new Scanner(System.in);

        int opcion = 0;
        do {
         	System.out.println("-- Escoja raiz:");
        	System.out.println("-- 1 Easy 1234567 8");
        	System.out.println("-- 2 Hard 234 56718");
        	System.out.println("-- -1 para terminar prog");
        	int raizOp = Leer.nextInt();
        	switch (raizOp) {
        	case 1: opcion = menu(estadoInicialEasy); break;
        	case 2: opcion = menu(estadoInicialHard); break;
        	case -1: return;
        	default: System.out.println("opcion no valida");
        	}
        }while(opcion >= 0);
        
        Leer.close();
    }
    
    private static int menu(String estado) {

    	ArbolBusqueda a = new ArbolBusqueda(new Nodo(estado), estadoFinal);
    	
    	
    	System.out.println("-- Metodo de busqueda");
    	System.out.println("-- 1 Anchura");
    	System.out.println("-- 2 Profundidad");
      	System.out.print("Opcion : ");
    	int opcion = Leer.nextInt();
    	
    	switch (opcion) {
    	case 1: 
    		System.out.println("-- Heuristica --");
    		System.out.println("-- 1 Cantidad espacios Correctos");
    		System.out.println("-- 2 Diferencia de los valores");
    		System.out.println("-- 3 Distancia Manhatan");
    		System.out.println("-- 4 Tabla Comparativa");
    		System.out.println("-- 5 Sin Heuristica");
    	   	System.out.print("Opcion : ");
    		System.out.println(a.busquedaPorAnchura(Leer.nextInt()));
    		break;
    	case 2: 
    		a.busquedaPorProfundidad(); 
    		break;
    		
    	case -1: break;
    	default: System.out.println("Opcion no valida");
    	}
    	return opcion;
    }
    
    
    
    
    
}
