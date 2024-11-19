
public class Busqueda {
//busqueda binaria

public static int busquedaBinaria(int[] arreglo, int valorBuscar) {
    int inicio = 0;
    int fin = arreglo.length - 1;
    int mitad;

    while (inicio <= fin) {

        mitad = (inicio + fin) / 2;
        if (arreglo[mitad] == valorBuscar) {
            return mitad;
        } else if (arreglo[mitad] < valorBuscar) {
            inicio = mitad + 1;
        } else {
            fin = mitad - 1;
        }
    }
    return -1;

}

public static int binario2(int[]arreglo, int buscar) {
    int minimo=0;
    int maximo= arreglo.length-1;
    int medio;

    while(minimo<=maximo){
        medio=(minimo+maximo)/2;
        if(arreglo[medio]==buscar){
            return medio;
        }else if (arreglo[medio]<buscar) {
            minimo = medio+1;
        }else{
            maximo = medio-1;
        }
    }
    return -1;
}
}
