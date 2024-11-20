
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
    public static int busqueda(int[]arreglo,int valorBuscar){
       int minimo=0;
       int medio;
       int maximo=arreglo.length-1;

       while(minimo<=maximo){
            medio=(minimo+maximo)/2;
        if (arreglo[medio]==valorBuscar) {
            return medio;    
        }else if(arreglo[medio]<valorBuscar){
            minimo = medio + 1;
        }else{
            maximo = medio-1;
        }
        }
        return -1;

    }
}





