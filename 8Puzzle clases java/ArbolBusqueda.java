
package puzzle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;



public class ArbolBusqueda {
    
    Nodo raiz;
    String objetivo;
    
    public ArbolBusqueda(Nodo raiz, String objetivo)
    {
        this.raiz = raiz;
        this.objetivo = objetivo;
    }
    
    //Busqueda por Anchura
    public void busquedaPorAnchura(int opcion)
    {
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList<String>();
        PriorityQueue<Nodo> estadosPorVisitar = new PriorityQueue<Nodo>(EscojeHeuristica(opcion));
        int contador = 0;
        //Queue<Nodo> estadosPorVisitar = new LinkedList();
        while(!nodoActual.getEstado().equals(objetivo))
        {
        	contador++;
            estadosVisitados.add(nodoActual.getEstado());
            //Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos();	//<-- Cada Equipo tiene que ingeniarselas para crear este metodo!
            for (String hijo : hijos) {
                if(!estadosVisitados.contains(hijo))
                {
                    //System.out.println("---Metiendo nuevo Nodo");
                    //Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.poll();
        }
        System.out.println("YA SE ENCONTRO EL NODO OBJETIVO");
        System.out.println(nodoActual.imprimeSolucion(nodoActual,raiz));
        System.out.println("Cantidad de veces que se entro al ciclo de busqueda "+contador);
        
    }
    //Busqueda por Profundidad
    public void busquedaPorProfundidad()
    {
        int contador = 0;
    	Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList<String>();
        Stack<Nodo> estadosPorVisitar = new Stack<Nodo>();
        while(!nodoActual.getEstado().equals(objetivo))
        {
        	contador++;
            estadosVisitados.add(nodoActual.getEstado());
            //Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos();	
            //hijos = heuristica1(hijos);
        
            for (String hijo : hijos) {
            	 if(!estadosVisitados.contains(hijo))
                 {
                     //System.out.println("---Metiendo nuevo Nodo");
                     //Crear nuevo Nodo.
                     Nodo nHijo = new Nodo(hijo);
                     nHijo.setPadre(nodoActual);
                     estadosPorVisitar.add(nHijo);
                  
                 }	
            }
            nodoActual = estadosPorVisitar.pop();
        }
        System.out.println("YA SE ENCONTRO EL NODO OBJETIVO");
        System.out.println(nodoActual.imprimeSolucion(nodoActual,raiz));
        System.out.println("Cantidad de veces que se entro al ciclo de busqueda "+contador);
 
    }
    
    public Comparator<Nodo> EscojeHeuristica(int opcion) {
    	
    	switch (opcion) {
    	case 1:
    		return ApliHeuristica1();
    	case 2:
    		return ApliHeuristica2();
    	case 3:
    		return ApliHeuristica3();
    	default :
    		return ApliHeuristica1();
    	}
    	
    }
    
    
    public int costoh1(String estado) {
  	  int eCorrc =0;
  	  for(int i = 0; i < objetivo.length(); i++) {
  		  if(estado.charAt(i) == objetivo.charAt(i)) {
  			 eCorrc++;
  		  }
  			 
  	  }
  	  return eCorrc;
    }
    
    public Comparator<Nodo> ApliHeuristica1() {
    	Comparator<Nodo> prioridad = new Comparator<Nodo>() {
			@Override
			public int compare(Nodo o1, Nodo o2) {
				if(costoh1(o1.getEstado()) > costoh1(o2.getEstado())) {
					return -1;
				}else {
					return 1;
				}
			}
    	};
    	return prioridad;	
    	
    }
   
    public int costoH2(String estado){
    	int diferencia = 0;
    	
    	for(int i = 0; i < objetivo.length(); i++) {
    		String Caracter1 = String.valueOf(estado.charAt(i));
    		String Caracter2 = String.valueOf(objetivo.charAt(i));
    		if(!Caracter1.contentEquals(" ") && !Caracter2.contentEquals(" ")  ){
    			diferencia = diferencia + Math.abs(Integer.parseInt(Caracter1) - Integer.parseInt(Caracter2));
    		}else if(Caracter1.contentEquals(" ") && !Caracter2.contentEquals(" ") ) {
    			diferencia = diferencia + Math.abs(0 - Integer.parseInt(Caracter2));
    		}else if(!Caracter1.contentEquals(" ") && Caracter2.contentEquals(" ")) {
    			diferencia = diferencia + Math.abs(Integer.parseInt(Caracter1) - 0);
    		}else
    			diferencia = diferencia + 0;	
    	}
    	return diferencia;
    }
    
    public Comparator<Nodo> ApliHeuristica2() {
    	Comparator<Nodo> prioridad = new Comparator<Nodo>() {
			@Override
			public int compare(Nodo o1, Nodo o2) {
				if(costoH2(o1.getEstado()) <= costoH2(o2.getEstado())) {
					return -1;
				}else {
					return 1;
				}
			}
    	};
    	return prioridad;	
    	
    }
    
    public int costoH3(String estado) {
    	
    	int espaciosM = 0 ;
    	for(int i = 0; i < objetivo.length(); i++) {
    		
    		if(estado.charAt(i) != objetivo.charAt(i) && ((estado.charAt(i) != ' ') && (objetivo.charAt(i) != ' '))) {
    			espaciosM ++;
    		}
    	}
    	return espaciosM;
    }
    public Comparator<Nodo> ApliHeuristica3() {
    	Comparator<Nodo> prioridad = new Comparator<Nodo>() {
			@Override
			public int compare(Nodo o1, Nodo o2) {
				if(costoH3(o1.getEstado()) < costoH3(o2.getEstado())) {
					return -1;
				}else {
					return 1;
				}
			}
    	};
    	return prioridad;	
    	
    }
    
    
    
    
    
}
