import java.util.Scanner; //IMPORTAMOS LA LIBRERIA NECESARIA PARA LA LECTURA DE LOS DATOS

/**
 * <h1>Creación de la clase proyecto</h1>
 * @author Consuelo Lamuño
 * <p>Creación de la clase proyecto para inicializar el proyecto de operaciones matematicas básicas.</p>
 */
public class operaciones_basicas_matematicas {
	
	/**
	 * <h1>Método de inicialización</h1>
	 * Este método es el que permite ejecutar el código de un programa. 
	 * El sistema interno de Java solo leerá el código almacenado en dicha función.
	 * @param arg
	 */
	public static void main(String [] arg) {
		
		int num1, num2, suma, resta, multiplicacion; //DECLARACION DE VARIABLES DE ENTRADA Y SALIDA (SUMA, RESTA Y MULTIPLICACION)
		Scanner leer= new Scanner (System.in); //SE CREA EL OBJETO SCANNER PARA PODER OBTENER LA ENTRADA DE DATOS POR CONSOLA
		
		try 
		{
			System.out.print("Introduce el primer número entero positivo:"); //IMPRIMIMOS POR CONSOLA UN MENSAJE PIDIENDO EL PRIMER NUMERO
			num1 = leer.nextInt(); //LEE Y ASIGNA LO QUE LEE A LA VARIABLE ANTERIORMENTE DECLARADA NUM1
	
			System.out.print("Introduce el segundo número entero positivo:"); //IMPRIMIMOS POR CONSOLA UN MENSAJE PIDIENDO EL SEGUNDO NUMERO
			num2 = leer.nextInt(); //LEE Y ASIGNA LO QUE LEE A LA VARIABLE ANTERIORMENTE DECLARADA NUM2
		
			if (num1>=0 && num2>=0)	//CONDICIONAMOS QUE LOS CALCULOS SE REALICEN CON DOS NUMEROS DE ENTRADA POSITIVOS
			{
				//REALIZAMOS LOS CALCULOS DE LAS OPERACIONES BASICAS MATEMÁTICAS
				suma = num1 + num2;
				resta = num1 - num2;
				multiplicacion = num1 * num2;
				double division = (double) num1 / num2; //DECLARAMOS EN LA PROPIA OPERACION LA VARIABLE PARA PODER OBTENER UN RESULTADO DECIMAL
				
				//IMPRIMIMOS LOS RESULTADOS POR CONSOLA EN LINEAS DISTINTAS POR ESO "PRINTLN"
				System.out.println("La suma es:" + suma);
				System.out.println("La resta es:" + resta);
				System.out.println("La multiplicación es:" + multiplicacion);
				System.out.println("La división es:" + division);			
			}
			else //SI NO SE DAN LAS CONDICIONES DE ENTRADA SE IMPRIME EL SIGUIENTE MENSAJE
				
			{
				System.out.print("No estás introduciendo números positivos, así que inicializa otra vez el programa.");
			} 
		}
		
		catch (Exception exception)
		{
			System.out.print("No estás introduciendo números enteros, así que inicializa otra vez el programa.");
		}
		
	} //FIN DE METODO DE INICIALIZACION
	
} //FIN DE LA CLASE
