/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner
import java.util.ArrayList
import java.util.List

public class Main
{
	public static void main(String[] args) {
		List<Pregunta> misPreguntas = new ArrayList<>();
		
		misPreguntas.add(new Pregunta(
		    "1.¿Cuál es la capital de Italia?", List.of("a) Roma", "b) Milán", "c) Vanecia", "d) San Andrea"), "a"));
		    
		misPreguntas.add(new Pregunta(
		    "2.¿Cuántos municipios tiene Sinaloa?", List.of("a) 17", "b) 20", "c) 15", "d) 18"), "d"));
		
		misPreguntas.add(new Pregunta(
		    "3.¿Cuántos son los países que conforman a Centroamerica?",  List.of("a) 6", "b) 7", "c) 5", "d) 10"), "b"));
		
		misPreguntas.add(new Pregunta(
		    "4.Cuál es la capital de Coahuila?", List.of("a) Saltillo", "b) Mexicali", "c) Acuña", "d) Ocampo"), "a"));
		    
		misPreguntas.add(new Pregunta(
		    "5.¿Cuántos estados tiene México?", List.of("a) 31", "b) 30", "c) 32", "d) 27", "c"));
		    
		misPreguntas.add(new Pregunta(
		    "6.¿Cuál fue el primer presidente de México?", List.of("a) Agustín de Iturbide ", "b) Benito Juarez", "c) Guadalupe Victoria", "d) Maximiliano de Lexemburgo", "c"));
		    
		misPreguntas.add(new Pregunta(
		    "7.¿Cuál es el estado de México con más minicipios?", List.of("a) Oaxaca", "b) Veracruz", "c) Puebla", "d) Guerrero", "a"));
		    
		misPreguntas.add(new Pregunta(
		    "8.¿Cuál es el estado con más iglesias en México?", List.of("a) CDMX", "b) Jalisco", "c) Oaxaca", "d) Puebla"), "d"));
		
	Scanner sc = new Scanner(System.in);
	int Vida = 100;
	int Penalización = 25;
	    
	int aciertos = 0;
	int errores = 0;
	int contestadas = 0;
	
	    for (int i= 0; i < misPreguntas.size(); i++){
	        Pregunta p = misPreguntas.get(i);
	        
	        System.out.println("\nVida: " + Vida);
	        System.out.println(p.getEnunciado());
	        for (String op : p.getOpciones()){
	            System.out.println(" " + op);
	        }
	    }
		
		
		
		
		    
		    
		    
		
		
	}
}
