package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
package Ejemplos;

public class HelloWorld { 
    
    public static void main(String[] args){ 
        System.out.println("Isabel"); 
    }
}

        
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
package Ejemplos;
      
public class HelloWorld { 
    
    public static void main(String[] args){ 
        System.out.println("Hola\nMundo"); 
    }
}

        
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
package Ejemplos;
        
public class HelloWorld { //Crea una clase 
    public static void main(String[] args){ //Inicia el main
        System.out.println("Hola\nMundo"); //Impirme lo que se le pasa entre " "
    }
}  

        
        // 4. Crea un comentario en varias líneas.
package Ejemplos;
        
public class HelloWorld { 
    public static void main(String[] args){ 
        System.out.println("Hola\nMundo"); 
        /*
        Comentario
        en varias
        lineas
        */
    }
}

        
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
package Ejemplos;
        
public class HelloWorld {     
public static void main(String[] args){ 
        System.out.println("Edad:23\nColor favorito:Negro\nCiudad:Leon"); 
       
    }
}

     
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
package Ejemplos;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!"); // Mensaje normal
        System.err.println("¡Atención! Esto es un mensaje de error."); 
        // Mensja de error, se muestra en rojo
    }
}

        
        // 7. Utiliza varios println para imprimir una frase.
package Ejemplos;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola, ");
        System.out.println( "mundo!");
        System.out.println("¿Que tal?");
    }
}

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
package Ejemplos;

public class HelloWorld {
    public static void main(String[] args) {
System.out.println(" :) ");

    }
}


        // 9. Intenta ejecutar el programa sin el método main y observa el error.
/*  Al quitar o renombrar el método main Java no sabe por dónde iniciar el programa
    Si la clase sigue siendo válida al ejecutar se produce el error:
    Error: Main method not found in class Ejemplos.HelloWorld
    Java siempre busca el método:
    public static void main(String[] args)
    que actúa como punto de entrada del programa
    Sin el método main un programa independiente en Java no puede ejecutarse */

// Ejemplo que compila pero no tiene main
public class HelloWorld {
    public static void saludo(String[] args) {
        System.out.println("Hola :)");
    }
}

        
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
/* En Java, el nombre de la clase pública debe coincidir exactamente con el nombre del archivo. 
Si no coincide, el compilador no puede encontrar la clase y aparece el error:

Error: no se ha encontrado o cargado la clase principal
ClassNotFoundException

Si la clase está en un paquete, la ruta de carpetas también debe coincidir con el paquete. 
Java busca el método main solo si encuentra la clase correcta.
*/
    }
}
