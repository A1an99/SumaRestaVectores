import java.util.Scanner;

public class SumaRestaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de vectores
        System.out.print("Ingrese el número de vectores: ");
        int numVectores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear un array de vectores
        String[] vectores = new String[numVectores];

        // Pedir al usuario los elementos de cada vector
        for (int i = 0; i < numVectores; i++) {
            System.out.print("Ingrese los elementos del vector " + (i + 1) + ": ");
            vectores[i] = scanner.nextLine();
        }

        // Realizar la suma de vectores
        String suma = sumarVectores(vectores);

        // Realizar la resta de vectores
        String resta = restarVectores(vectores);

        // Mostrar resultados
        System.out.println("La suma de los vectores es: " + suma);
        System.out.println("La resta de los vectores es: " + resta);

        scanner.close();
    }

    // Método para sumar vectores
    public static String sumarVectores(String[] vectores) {
        String resultado = "";
        for (String vector : vectores) {
            resultado = sumar(resultado, vector);
        }
        return resultado;
    }

    // Método para restar vectores
    public static String restarVectores(String[] vectores) {
        String resultado = vectores[0];
        for (int i = 1; i < vectores.length; i++) {
            resultado = restar(resultado, vectores[i]);
        }
        return resultado;
    }

    // Método para sumar dos vectores
    public static String sumar(String vector1, String vector2) {
        // Aquí implementa la lógica para sumar dos vectores
        // Por ejemplo, podrías convertir los vectores a números y sumarlos
        // Aquí se muestra una implementación básica
        return vector1 + " + " + vector2;
    }

    // Método para restar dos vectores
    public static String restar(String vector1, String vector2) {
        // Aquí implementa la lógica para restar dos vectores
        // Por ejemplo, podrías convertir los vectores a números y restarlos
        // Aquí se muestra una implementación básica
        return vector1 + " - " + vector2;
    }
}