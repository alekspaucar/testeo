
import java.util.Arrays;
import java.util.Scanner;

public class Testeo {
  
    public static void main(String[] args) {

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

        //lista para ordenar con metodo insercion...
        
        int[] arreglo= {2,7,5,9,1,3,3,2};

        MetodoOrdenamiento.insercion(arreglo);
        System.out.println("el metodo ordenado es:"+Arrays.toString(arreglo));



    }

}


    