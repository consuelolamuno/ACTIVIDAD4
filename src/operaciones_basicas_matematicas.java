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
				//LLAMAMOS A LOS METODOS CREADOS EN LA PARTE INFERIOR DEL CODIGO
				suma = metodo_suma(num1, num2);
				resta = metodo_resta(num1, num2);
				multiplicacion = metodo_multiplicacion(num1, num2);
				double division = metodo_division(num1, num2); 
				
				metodo_visualizacion_resultados(suma, resta, multiplicacion, division);			
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
	
	/**
	 * <h2>Método de visualización de resultado</h2>
	 * Muestra por consola los resultado obtenidos en los parametos suma, resta, multiplicación y división.
	 * @param suma
	 * @param resta
	 * @param multiplicacion
	 * @param division
	 */
	private static void metodo_visualizacion_resultados(int suma, int resta, int multiplicacion, double division) {
		System.out.println("La suma es:" + suma);
		System.out.println("La resta es:" + resta);
		System.out.println("La multiplicación es:" + multiplicacion);
		System.out.println("La división es:" + division);
	}

	/**
	 * <h2>Método de división</h2>
	 * @param num1
	 * @param num2
	 * @return Devuelve el cociente de los numeros 1 y 2.
	 */
	private static double metodo_division(int num1, int num2) {
		double division = (double) num1 / num2;
		return division;
	}

	/**
	 * <h2>Método de multiplicación</h2>
	 * @param num1
	 * @param num2
	 * @return Devuelve el producto de los numeros 1 y 2.
	 */
	private static int metodo_multiplicacion(int num1, int num2) {
		int multiplicacion;
		multiplicacion = num1 * num2;
		return multiplicacion;
	}

	/**
	 * <h2>Método de resta</h2>
	 * @param num1
	 * @param num2
	 * @return Devuelve la diferencia de los numeros 1 y 2.
	 */
	private static int metodo_resta(int num1, int num2) {
		int resta;
		resta = num1 - num2;
		return resta;
	}

	/**
	 * <h2>Método de suma</h2>
	 * @param num1
	 * @param num2
	 * @return Devuelve la suma de los numeros 1 y 2.
	 */
	private static int metodo_suma(int num1, int num2) {
		int suma;
		suma = num1 + num2;
		return suma;
	}
	
} //FIN DE LA CLASE
