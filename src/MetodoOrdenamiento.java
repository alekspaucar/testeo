
public class MetodoOrdenamiento {
//arreglo por el metodo de insercion:
public static int[] insercion(int[]arreglo){  
    for (int i = 1 ; i < arreglo.length; i++) {
        int auxiliar = arreglo[i];
        int j = i - 1;
        while(( j >= 0 ) && (auxiliar < arreglo[j])){
            arreglo[j + 1]=arreglo[j];
            j--;    
        }
        arreglo[j + 1] = auxiliar;
        }
        return arreglo;
    }
    
}
