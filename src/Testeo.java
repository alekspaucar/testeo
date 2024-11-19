
import java.util.Arrays;
import java.util.Scanner;

public class Testeo {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*  
        //susecion fibonacci
        System.out.println("ingrese un numero a calcular: " );
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();

        int resultado = MetodoRecursivo.fibonacci(n);

        System.out.println("el numero fibonacci es :" + resultado);
        System.out.println("secuencia fibonacci: ");

        for (int i = 0; i <= n; i++) {
            System.out.println(MetodoRecursivo.fibonacci(i) + " ");
        }

        //busqueda binaria
        System.out.println("-------------------------------");
        System.out.println(" ingrese el numero a buscar: ");
        int valorBuscar = leer.nextInt();
        int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12};
        int respuesta=Busqueda.binario2(lista, valorBuscar);
        if(respuesta == -1){
            System.out.println("el numero no se encuentra:");
        }else{
        System.out.println("el numero: "+ lista[respuesta]+" encontrado en la posicion: "+respuesta);      
        }
 */
        
        
        System.out.print("¿Cuántos números quieres ingresar? ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("Los números ingresados son:");
        for (int numero : arreglo) {
            System.out.print(numero+" ");
        }

        MetodoOrdenamiento.insercion(arreglo);
        System.out.println(" El metodo ordenado es:"+Arrays.toString(arreglo));
        System.out.println("que numero desea buscar: ");
        int valorBuscar = scanner.nextInt();
        int respuesta = Busqueda.busquedaBinaria(arreglo, valorBuscar);
        if(respuesta == -1){
            System.out.println("no se encuentra el numero: ");
        }
        System.out.println("el numero: "+valorBuscar+" se encuentra en la posicion:" +respuesta);

    }
}



    