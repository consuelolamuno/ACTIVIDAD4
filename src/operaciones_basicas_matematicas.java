import java.util.Scanner;

public class operaciones_basicas_matematicas {
	
	public static void main(String [] arg) {
		
		int num1, num2, suma, resta, multiplicacion; 
		Scanner leer= new Scanner (System.in); 
		
		try 
		{
			System.out.print("Introduce el primer número entero positivo:"); 
			num1 = leer.nextInt(); 
	
			System.out.print("Introduce el segundo número entero positivo:"); 
			num2 = leer.nextInt(); 
		
			if (num1>=0 && num2>=0)	
			{
				suma = num1 + num2;
				resta = num1 - num2;
				multiplicacion = num1 * num2;
				double division = (double) num1 / num2; 
				
				System.out.println("La suma es:" + suma);
				System.out.println("La resta es:" + resta);
				System.out.println("La multiplicación es:" + multiplicacion);
				System.out.println("La división es:" + division);			
			}
			else 
				
			{
				System.out.print("No estás introduciendo números positivos, así que inicializa otra vez el programa.");
			} 
		}
		
		catch (Exception exception)
		{
			System.out.print("No estás introduciendo números enteros, así que inicializa otra vez el programa.");
		}
		
	} 
	
}
