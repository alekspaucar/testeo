
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

}
