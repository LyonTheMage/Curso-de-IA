package puzzle8;

import java.util.Collection;

public class Puzzle8 {

    public static String estadoInicial = "12578 346";
    public static String estadoFinal = "12345678 ";
    
    public static void main(String[] args) {
        //Instanciar el arbol
        ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicial), estadoFinal);
        //Ejecuta la busqueda
        System.out.println("BUSQUEDA POR ANCHURA...");
        a.busquedaPorAnchura();
        // System.out.println("BUSQUEDA POR PROFUNDIDAD...");
        //a.busquedaPorProfundidad();
     
    }
    
}
