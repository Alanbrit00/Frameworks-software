/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;


public class Main
{
	public static void main(String[] args) {
		String persona = "Explorador";
		int opcion = 0;
		int agua = 100;
		int comida = 100;
		int energia = 100;
		int oro = 20;
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		for (int i=1; i<10; i++){
		System.out.print("--------------Dia: ---------------" + i);
		System.out.print("Porfavor elija una de estas opciones\n");
		System.out.println("Opcion 1: Explorar");
		System.out.println("Opcion 2: Descansar");
		System.out.println("Opcion 3: Racionar");
		System.out.println("Opcion 4: Comprar");
		
		opcion = teclado.nextInt();
		
		switch (opcion){
		    case 1: System.out.println("Usted eligio la opcion de Explorar");
		    agua - 15; comida - 10; energia - 20; 
		    int oroGanado = aleatorio.extInt(21) + 5;
		    oro += oroGanado;
		    System.out.println("¡Encontraste un tesoro con " + oroGanado + "de oro!");
		    System.out.print("Usted se a quedado con estos recursos: Agua: " + agua + " |Comida: " + comida + "| Energia" + energia + "| Oro" + oro);

		}
		
		    
		}
	}
}