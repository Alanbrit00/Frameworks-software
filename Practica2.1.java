/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		final double TASA_IVA = 0.16;
		
		//Datos de la compra(arreglos paralelos)
		String[] productos = {"Agua 1L", "Cereal de caja", "Jitomate 1kg", "Frijol 1kg", "Pepino"};
		double[] precios = {20.90, 45.90, 28.90, 22.00, 15.50};
		int[] cantidades = {2, 4, 2, 2, 5};
		
		double subtotal = 0;
		
		System.out.println("Producto 1: " + productos[1] + "Precio:: " + precios[1]);
		
		//TODO 1: Imprimir el encabezado del ticket
		System.out.println("=================================================");
		System.out.println("                  MI TIENDA");
		System.out.println("=================================================");
        System.out.printf("%-18s %4s %8s %9s%n", "Producto", "Cant", "Precio", "Importe");
        System.out.println("-------------------------------------------------");
		//TODO 2: Recorrer los productos con un for
		//  -calcular el importe (precio * cantidad)
		//  -acumular en subtotal
		//  -imprimir la linea del producto
		for(int i = 0; i <= productos.length; i++){
		    double importe = precios[i] * cantidades[i];
		    subtotal += importe;
		    System.out.printf("%-18s %4s %8s %9s%n", productos[i], cantidades[i], precios[i], importe);
		}
		//TODO 3: Calcular el IVA y subtotal
		    double iva = subtotal * TASA_IVA;
		    double total =subtotal * iva;
		//TODO 4:Iprimir subtotal, IVA y total con 2 decimales
        System.out.println("-------------------------------------------------");
        System.out.printf("%-32s %9.2f%n", "Subtotal: ", subtotal);
        System.out.printf("%-32s %9.2f%n", "IVA(16%): ", iva);
		System.out.printf("%-32s %9.2f%n", "TOTAL: ", total);
		System.out.println("=================================================");
		System.out.println("        Gracias por su compra");
		
	}
}
