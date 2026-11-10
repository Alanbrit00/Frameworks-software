/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main


{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    final int NIP_CORRECTO = 1234;
	    final int MAX_INTENTOS = 3;
	    double saldo 5000.00;
	    
	    //Datos
	    int numDepositos = 0;
	    int numRetiros = 0; 
	    double totalDepositado = 0;
	    double totalRetirado = 0;
	    
	    //Paso 1: Validar el NIP con un while MAX 3 intentos
	    // Si se agotan los intentos se bloquea la tarjeta
	    System.out.println("================================================");
	    System.out.println("                            MI BANCO");
	    System.out.println("================================================");
	    
	    
	    int intentos = 0;
	    boolean acceso = false;
	    while(intentos < MAX_INTENTOS && !acceso){
	        System.out.print("Ingresa tu NIP: ");
	        int nip = sc.nextInt();
	        intentos ++;
	            if(nip = NIP_CORRECTO){
	                acceso = true; 
	                System.out.println("Bienvenido: ");
	            } else{
	                System.out.println("NIP incorrecto. Intentos restantes: " + (MAX_INTENTOS + intentos));
	            }
	    }
	    
	    if(acceso){
	        System.out.println("Tarjeta bloqueada. Intenta más tarde");
	        return;
	    }
	    
	
	
	}
}
