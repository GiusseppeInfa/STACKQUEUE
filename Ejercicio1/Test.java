package Ejercicio1;
import Actividad1.ExceptionIsEmpty;
import Actividad1.Stack;

//Esta clase debe estar en el paquete por defecto de tu proyecto.
public class Test{

 public static void main(String[] args) throws ExceptionIsEmpty{
     // Test con una pila de Strings
     Stack<String> stringStack = new StackLink<>();
     System.out.println("Prueba con Pila de Strings:");

     // Apilando elementos
     stringStack.push("Elemento 1");
     stringStack.push("Elemento 2");
     stringStack.push("Elemento 3");

     // Mostrando el tope
     System.out.println("Tope de la pila: " + stringStack.top()); // "Elemento 3"

     // Desapilando elementos
     System.out.println("Desapilando: " + stringStack.pop()); // "Elemento 3"
     System.out.println("Nuevo tope de la pila: " + stringStack.top()); // "Elemento 2"

     // Estado final de la pila
     System.out.println("Contenido de la pila: " + stringStack); // "Tope -> Elemento 2 -> Elemento 1 -> null"
     System.out.println();

     // Test con una pila de Enteros
     Stack<Integer> integerStack = new StackLink<>();
     System.out.println("Prueba con Pila de Enteros:");

     // Apilando elementos
     integerStack.push(10);
     integerStack.push(20);
     integerStack.push(30);

     // Mostrando el tope
     System.out.println("Tope de la pila: " + integerStack.top()); // 30

     // Desapilando elementos
     System.out.println("Desapilando: " + integerStack.pop()); // 30
     System.out.println("Nuevo tope de la pila: " + integerStack.top()); // 20

     // Estado final de la pila
     System.out.println("Contenido de la pila: " + integerStack); // "Tope -> 20 -> 10 -> null"
     System.out.println();

     // Test con una pila de Caracteres
     Stack<Character> charStack = new StackLink<>();
     System.out.println("Prueba con Pila de Caracteres:");

     // Apilando elementos
     charStack.push('A');
     charStack.push('B');
     charStack.push('C');

     // Mostrando el tope
     System.out.println("Tope de la pila: " + charStack.top()); // 'C'

     // Desapilando elementos
     System.out.println("Desapilando: " + charStack.pop()); // 'C'
     System.out.println("Nuevo tope de la pila: " + charStack.top()); // 'B'

     // Estado final de la pila
     System.out.println("Contenido de la pila: " + charStack); // "Tope -> B -> A -> null"
     System.out.println();

     // Test con pila vacía
     Stack<String> emptyStack = new StackLink<>();
     System.out.println("Prueba con Pila Vacía:");

     // Verificar si la pila está vacía
     System.out.println("¿Está vacía? " + emptyStack.isEmpty()); // true

     // Intentar desapilar cuando la pila está vacía (debería lanzar excepción)
     try {
         emptyStack.pop();
     } catch (ExceptionIsEmpty e) {
         System.out.println("Error: " + e.getMessage()); // "La pila está vacía"
     }

     // Agregar un elemento y verificar el estado
     emptyStack.push("Elemento único");
     System.out.println("¿Está vacía después de apilar? " + emptyStack.isEmpty()); // false

     // Desapilar el único elemento y verificar si la pila está vacía
     emptyStack.pop();
     System.out.println("¿Está vacía después de desapilar? " + emptyStack.isEmpty()); // true
 }
}
