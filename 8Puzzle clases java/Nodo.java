
package puzzle;

import java.util.ArrayList;
import java.util.Collection;


public class Nodo {
    private String estado;
    private Collection<Nodo> hijos;
    private Nodo padre;
    
    public Nodo(String estado)
    {
        this.estado = estado;
        hijos = new ArrayList<>();
    }

    public String getEstado() {
        return estado;
    }

    public Collection<Nodo> getHijos() {
        return hijos;
    }

    //Agrega 1 Nodo hijo
    public void agregarHijos(Nodo h) {
        this.hijos.add(h);
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Collection<String> generaHijos() {
     
    	ArrayList<String>hijosGenerados=new ArrayList<>();
        int i = estado.indexOf(" ");
        String estadoTemp;
        switch(i)
        {
            case 0:
      
            	estadoTemp=""+estado.charAt(1)+estado.charAt(0)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(3)+estado.charAt(1)+estado.charAt(2)+estado.charAt(0)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
  
                break;
            case 1:
            	estadoTemp=""+estado.charAt(1)+estado.charAt(0)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(2)+estado.charAt(1)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(4)+estado.charAt(2)+estado.charAt(3)+estado.charAt(1)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            
                break;
            case 2:
            	estadoTemp=""+estado.charAt(0)+estado.charAt(2)+estado.charAt(1)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(5)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(2)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	
            	break;
            case 3:
            	estadoTemp=""+estado.charAt(3)+estado.charAt(1)+estado.charAt(2)+estado.charAt(0)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(4)+estado.charAt(3)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(6)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(3)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	break;
            case 4: 
            	estadoTemp=""+estado.charAt(0)+estado.charAt(4)+estado.charAt(2)+estado.charAt(3)+estado.charAt(1)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(4)+estado.charAt(3)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(5)
            	+estado.charAt(4)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(7)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(4)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);


            	break;
            case 5:
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(5)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(2)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(5)
            	+estado.charAt(4)+estado.charAt(6)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);

            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(8)+estado.charAt(6)+estado.charAt(7)+estado.charAt(5);
            	hijosGenerados.add(estadoTemp);

            	break;
            case 6:
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(6)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(3)+estado.charAt(7)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(7)+estado.charAt(6)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	break;
            case 7:
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(7)+estado.charAt(6)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(7)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(4)+estado.charAt(8);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(8)+estado.charAt(7);
            	hijosGenerados.add(estadoTemp);
            	break;
            case 8:
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(5)+estado.charAt(6)+estado.charAt(8)+estado.charAt(7);
            	hijosGenerados.add(estadoTemp);
            	
            	estadoTemp=""+estado.charAt(0)+estado.charAt(1)+estado.charAt(2)+estado.charAt(3)+estado.charAt(4)
            	+estado.charAt(8)+estado.charAt(6)+estado.charAt(7)+estado.charAt(5);
            	hijosGenerados.add(estadoTemp);
            	break;
       }
        return hijosGenerados;
    }
    
    

    
  public String imprimeSolucion(Nodo nodoActual,Nodo raiz) {
	   String solucion = EstructuraTexto(nodoActual.getEstado());
       Nodo imp = nodoActual;
 
	   do {
		   imp = imp.getPadre();
		   solucion = EstructuraTexto(imp.getEstado())+"\n"+solucion;
       }while(imp != raiz);
	   return solucion;
	  
  }
  public String EstructuraTexto(String estado) {
	  
	 String regreso = "";
	 int contador = 0;
	  for(int i = 0; i < estado.length(); i++) {
		  contador++;
		  switch (contador) {
		  case 1: regreso = regreso+String.valueOf(estado.charAt(i)); break;
		  case 2: regreso = regreso+"|"+String.valueOf(estado.charAt(i)); break;
		  case 3: regreso = regreso+"|"+String.valueOf(estado.charAt(i))+"\n"; contador = 0; break;
		  }
	  }
	  return regreso;
  }
    

  
  
  




}
