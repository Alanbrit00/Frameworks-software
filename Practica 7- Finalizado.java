/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        String jugarDeNuevo = "S";

        // Bucle para reiniciar el juego si el usuario lo desea (RF10)
        while (jugarDeNuevo.equalsIgnoreCase("S")) {
            
            // Tus variables originales
            String persona = "Explorador";
            int opcion = 0;
            int agua = 100;
            int comida = 100;
            int energia = 100;
            int oro = 20;
            int op_c = 0;
            boolean vivo = true;

            // Ciclo for corregido a 10 días (i <= 10)
            for (int i = 1; i <= 10; i++) {
                System.out.println("\nUsted tiene estos recursos: \nAgua: " + agua + " | Comida: " + comida + " | Energia: " + energia + " | Oro: " + oro);
                System.out.println("-------------- Dia: " + i + " --------------");
                System.out.print("Por favor elija una de estas opciones\n");
                System.out.println("Opcion 1: Explorar");
                System.out.println("Opcion 2: Descansar");
                System.out.println("Opcion 3: Racionar");
                System.out.println("Opcion 4: Comprar en oasis");

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1: 
                        System.out.println("Usted eligio la opcion de Explorar");
                        agua -= 15; 
                        comida -= 10; 
                        energia -= 20; 
                        
                        // Evento de oro aleatorio y tormenta de arena (RF4)
                        int oroGanado = aleatorio.nextInt(16); // 0 a 15
                        oro += oroGanado;
                        System.out.println("¡Encontraste un tesoro con " + oroGanado + " de oro!");
                        
                        if (aleatorio.nextInt(100) < 30) {
                            System.out.println("¡Una tormenta de arena te sorprendio! Energia -10 extra.");
                            energia -= 10;
                        }
                        break;
                        
                    case 2: 
                        System.out.println("Usted eligio la opcion de Descansar");
                        agua -= 10; 
                        comida -= 10; 
                        energia += 25;
                        break;
                        
                    case 3:
                        System.out.println("Usted eligio la opcion de Racionar");
                        agua -= 5; 
                        comida -= 5; 
                        energia -= 5;
                        break;
                        
                    case 4: 
                        System.out.println("Usted eligio comprar");
                        if (oro >= 10) {
                            System.out.println("Te has encontrado con un vendedor. Puedes cambiar 10 de oro por:");
                            System.out.println("1: +20 de Agua");
                            System.out.println("2: +20 de Comida");
                            op_c = teclado.nextInt();

                            if (op_c == 1) {
                                oro -= 10;
                                agua += 20;
                                System.out.println("Usted eligio comprar agua");
                            } else if (op_c == 2) {
                                oro -= 10;
                                comida += 20;
                                System.out.println("Usted eligio comprar comida");
                            } else {
                                System.out.println("Opcion invalida, no compraste nada.");
                                i--; // Retrocede el día para que no cuente (RF3)
                                continue;
                            }
                        } else {
                            System.out.println("No tienes suficiente oro");
                            i--; // Retrocede el día para que vuelva a elegir (RF5)
                            continue;
                        }
                        break;
                        
                    default: 
                        System.out.println("No eligio una opcion valida"); 
                        i--; // Retrocede el día si se equivoca de número (RF3)
                        continue;
                }

                // Ajustar límites de 0 a 100 (RF6)
                if (agua > 100) agua = 100;
                if (comida > 100) comida = 100;
                if (energia > 100) energia = 100;
                if (agua < 0) agua = 0;
                if (comida < 0) comida = 0;
                if (energia < 0) energia = 0;

                // Condición de derrota (RF8)
                if (agua == 0 || comida == 0 || energia == 0) {
                    System.out.println("\nHas muerto en el desierto en el dia: " + i);
                    vivo = false;
                    break; 
                }
            } // Fin del ciclo for

            // Condición de victoria al terminar los 10 días (RF9)
            if (vivo) {
                int puntaje = (agua + comida + energia) + (oro * 2);
                System.out.println("\n¡Llegaste al oasis!");
                System.out.println("Puntaje final: " + puntaje);
            }

            // Preguntar para reiniciar el bucle while
            System.out.println("\n¿Desea jugar de nuevo? (S/N): ");
            jugarDeNuevo = teclado.next();
        }
        
        teclado.close();
    }
}