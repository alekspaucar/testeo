
public class MetodoRecursivo {

    //factorial recursivo
    public static int factorial(int n) {
        if (n == 1) {

            System.out.print("no se calculo: ");
            return 1;

        } else {
            int resultado = n * factorial(n - 1);
            return resultado;
        }

    }
    //fibonacci recursivo 
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        int resultado = fibonacci(n - 1) + fibonacci(n - 2);
        return resultado;
    }
    
}

