package Fuzzy;
import java.util.Scanner;

import net.sourceforge.jFuzzyLogic.FIS;
//Cardenas Perez/Ruiz Lizarraga
//
public class app {
	static Scanner Leer = new Scanner(System.in);
	static  FIS fis;

	public static void main(String[] args) {
		 fis = FIS.load("C:\\Users\\mauri\\IdeaProjects\\Logica Difusa\\src\\Fuzzy\\potenciaTiro.fcl",true);
		fuzzyBasquet balon = new fuzzyBasquet();
		int resultado = 0;
		do {
			Menu(balon,fis);
			System.out.println("Quieres repetir el programa? (no -1)");
			resultado = Leer.nextInt();
		}while(resultado != -1);
		Leer.close();
	}
	static public void Menu(fuzzyBasquet balon,FIS fis) {
		int fuerzaValor = 0;
		int anguloValor = 0;
		boolean bandera;

		System.out.println("Describa como tiro el jugador el balon");
		do{
			bandera = true;
			System.out.println("Con Cuanta Fuerza Se Lanzo el balon (poca/masomenos/mucha)");
			String estadoFuerza = Leer.next();
			switch (estadoFuerza){
				case "poca": fuerzaValor = 1 + (int)(Math.random() *3); break;
				case "masomenos": fuerzaValor = 3 + (int)(Math.random() * 6); break;
				case "mucha": fuerzaValor = 9 + (int)(Math.random() * 3); break;

				default: System.out.println("opcion no valida");  bandera= false;
			}
		}while(!bandera);
		do{
			bandera = true;
			System.out.println("Como fue el angulo que se Lanzo el balon (bajo/medio/alto)");
			String estadoAngulo = Leer.next();
			switch (estadoAngulo){
				case "bajo":anguloValor = 1 + (int)(Math.random() * 3);  break;
				case "medio":anguloValor = 3 + (int)(Math.random() *6);  break;
				case "alto":anguloValor = 9 + (int)(Math.random() * 3);  break;

				default: System.out.println("opcion no valida"); bandera= false;
			}
		}while(!bandera);
		//Aplicar fuzzyLogic
		fis.setVariable("fuerza",fuerzaValor);
		fis.setVariable("angulo",anguloValor);
		fis.evaluate();

		double distanciaBalon = fis.getVariable("distancia").getValue();
		System.out.println("distancia Recorrida:" + distanciaBalon );
		if(distanciaBalon < 5 ){
			System.out.println("el balon no llego");
		}else if(distanciaBalon >= 5 && distanciaBalon  <= 7){
			System.out.println("se ensesto el balon");
		}else{
			System.out.println("el balon se paso al aro");
		}

	}
	
	
	
	

}
