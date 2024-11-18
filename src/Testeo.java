
import java.util.Scanner;

public class Testeo {
  
    public static void main(String[] args) {
        System.out.println("ingrese un numero a calcular: " );
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        leer.close(); //cerramos  el sacanner para evitar fugas de recursos
        /*  int resultado = MetodoRecursivo.factorial(n); 
        System.out.println("el factorial es: " + resultado);        
        */
        int resultado = MetodoRecursivo.fibonacci(n);
        System.out.println("el numero fibonacci es :" + resultado);
        System.out.println("secuencia fibonacci: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(MetodoRecursivo.fibonacci(i) + " ");
        }
        
     }
}


    