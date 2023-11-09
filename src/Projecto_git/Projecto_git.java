package Projecto_git;
import java.util.Scanner;
public class Projecto_git {
	public static void main(String[] args) {
			//Declaro un scanner que me va a servir para todas las preguntas
			Scanner scaner = new Scanner(System.in);
			//Declaro las variables booleanas 
			/*
			 * holaaaa maquinas de guerra
			 * jijijijaaaaaaa
			 * dsadasdasdasdas
			 * das
			 * ad
			 * as
			 * asd
			 * as
			 * d
			 * as
			 * das
			 * da
			 * d
			 * as
			 * d
			 * as
			 * d
			 * 
			 */
			boolean fundida=true;
			boolean interruptor=true;
			boolean resuelto=false;
			//Declaro la variable para las preguntas
			String preguntas;
			//Hago la primera pregunta en un syso
			System.out.println("¿Está la lámpara enchufada?");
			//Hago que el usuario le de valor a la variable enchufada que en este caso es por la que hemos preguntado
			boolean enchufada= scaner.nextBoolean();
			//Y hacemos un syso en el que vamos a guardar el resultado en preguntas si es verdadero muestra un mensaje y si es falso no muestra nada y pasa al siguiente
			System.out.println(preguntas= enchufada == false?"Enchufar lampara, ¿funciona?":"");
			//Le damos el valor a la variable resuelto, en este caso si enchufada es true se guarda falso y si no dejamos al usuario escribir
			resuelto = enchufada == true?false:scaner.nextBoolean();
			//Aqui lanzamos la siguiente pergunta en el caso de que resuelto sea falso y si es true no lanzamos la siguiente pregunta
			System.out.println(preguntas = resuelto == false?"Está la bombilla fundida?":"");
			//Le damos valor a fundida en este caso si resuelto es igual a false dejamos escribir al usuario y si no le damos valor de false
			fundida = resuelto == false?scaner.nextBoolean():false;
			//Lanzamos la siguiente pregunta en el caso de que fundida sea true si es falso simplemente no mostramos nada por consola
			System.out.println(preguntas = fundida == false?"":"Cambiar bombilla,¿funciona?");
			//le damos nuevo valor a resuelto y si resuelto es falso comparara fundida y en el caso de que esta se falsa se le dara un valor de falso 
			//en el caso de que sea true le daremos la opcion de escribir al usuario y si no entra en esta comparacion resuelto sera true
			resuelto = resuelto == false?(fundida == false?false:scaner.nextBoolean()):true;
			//Lanzamos la siguiente pregunta en el caso de que resuelto se falso si es true no mostramos nada por pantalla
			System.out.println(preguntas = resuelto == false?"¿Está el interruptor estropeado?":"");
			//Le damos valor a interruptor, si resuelto es falso le damos valor falso y si es true le damos la opcion de escribir al usuario
			interruptor = resuelto == false?scaner.nextBoolean():false;
			//Lanzamos la siguiente pregunta solo si resuelto es falso he interruptor es trrue , en caso de que alguna falle no se mostrara por pantalla
			System.out.println(preguntas = resuelto ==false?(interruptor == true)?"Cambiar interruptor, ¿funciona?":"":"");
			//Le damos valor a resuelto en el que si resuelto es falso e interruptor es ture le damos opcion de escribir y si resuelto es true a resuelto le damos true 
			//y si interruptor es falso le damos falso
			resuelto= resuelto == false?(interruptor == true)?scaner.nextBoolean():false:true;
			System.out.println(preguntas= resuelto == false?"Comprar otra lámpara":"Problema resuelto");

		}


	}

}
