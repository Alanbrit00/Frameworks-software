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
	    double saldo = 5000.00;
	    
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
	            if(nip == NIP_CORRECTO){
	                acceso = true; 
	                System.out.println("Bienvenido: ");
	            } else{
	                System.out.println("NIP incorrecto. Intentos restantes: " + (MAX_INTENTOS + intentos));
	            }
	    }
	    
	    if(!acceso){
	        System.out.println("Tarjeta bloqueada. Intenta más tarde");
	        return;
	    }
	    //TODO 2: Menú con do-while que se repite hasta elegir 4 (salir)
	    // - leer la opción y usar un switch
	    int opcion; 
	        do{
	            System.out.println();
	            System.out.println("1. Consultar saldo");
	            System.out.println("2. Depositar");
	            System.out.println("3. Retirar");
	            System.out.println("4. Salir");
	            
	            opcion = sc.nextInt();
	            switch (opcion){
	                case 1: 
	                    System.out.printf("Saldo actual: $%.2f\n", saldo);
	                    break;
	                case 2:
	                    System.out.print("Ingresa la cantidad a depositar: ");
	                    double deposito = sc.nextDouble();
	                    if (deposito > 0){
	                        saldo += deposito;
	                        numDepositos++;
	                        totalDepositado += deposito;
	                        System.out.printf("Deposito exitoso. Nuevo saldo: $%.2f\n", saldo);
	                    } else {
	                        System.out.println("Cantidad invalida.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Ingresaa la cantidad a retirar: ");
	                    double retiro =sc.nextDouble();
	                    if (retiro > 0 && retiro <= saldo){
	                        saldo -= retiro;
	                        numRetiros++;
	                        totalRetirado += retiro;
	                        System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f\n", saldo);
	                    } else {
	                        System.out.println("Cantidad invalida o saldo insuficiente.");
	                    }
	                    
	                    break;
	                case 4:
	                    System.out.println("Gracias por usar nuestro cajero.");
	                    break;
	                default:
	                    System.out.println("Opcion invalida intenta de nuevo");
	       }
	           
	            
	            
	       } while (opcion != 4);
	       
	       sc.close();
	    
	}
}
