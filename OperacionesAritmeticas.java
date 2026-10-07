import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== Operaciones aritmeticas basicas con numeros enteros ===");

        int a = leerEntero(lector, "Ingrese el primer numero entero: ");
        int b = leerEntero(lector, "Ingrese el segundo numero entero: ");

        System.out.println();
        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma:            " + a + " + " + b + " = " + sumar(a, b));
        System.out.println("Resta:           " + a + " - " + b + " = " + restar(a, b));
        System.out.println("Multiplicacion:  " + a + " * " + b + " = " + multiplicar(a, b));

        if (b == 0) {
            System.out.println("Division:        operacion no valida, el divisor no puede ser cero.");
        } else {
            System.out.println("Division:        " + a + " / " + b + " = " + dividir(a, b));
        }

        if (b < 0) {
            System.out.println("Potencia:        operacion no valida, el exponente no puede ser negativo.");
        } else {
            System.out.println("Potencia:        " + a + " ^ " + b + " = " + potencia(a, b));
        }

        lector.close();
    }

    public static int leerEntero(Scanner lector, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (lector.hasNextInt()) {
                return lector.nextInt();
            }
            System.out.println("Error: \"" + lector.next() + "\" no es un numero entero valido. "
                    + "Escriba un valor como 5, -3 o 42.");
        }
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static long potencia(int base, int exponente) {
        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
