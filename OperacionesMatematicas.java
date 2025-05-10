package codigo;

/**
 * La clase OperacionesMatematicas proporciona métodos para realizar operaciones básicas
 * de suma, resta y multiplicación.
 * <p>
 * Este ejemplo muestra cómo utilizar JavaDoc para documentar las clases, métodos, 
 * parámetros, valores de retorno y excepciones. Además, se incluye manejo de excepciones 
 * para ejemplificar una validación de entrada.
 * </p>
 * 
 * @author Juan Jaime Fuentes Uriarte
 * @version 1.0
 */
public class OperacionesMatematicas {

    /**
     * Suma dos números siempre y cuando ambos sean positivos.
     *
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return La suma de los dos números.
     * @throws IllegalArgumentException Si alguno de los números es negativo.
     */
    public double sumar(double a, double b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos en la suma.");
        }
        return a + b;
    }

    /**
     * Resta dos números siempre y cuando ambos sean positivos.
     *
     * @param a Minuendo (número del que se resta).
     * @param b Sustraendo (número que se resta).
     * @return La diferencia entre los dos números.
     * @throws IllegalArgumentException Si alguno de los números es negativo.
     */
    public double restar(double a, double b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos en la resta.");
        }
        return a - b;
    }

    /**
     * Multiplica dos números siempre y cuando ambos sean positivos.
     *
     * @param a Primer factor de la multiplicación.
     * @param b Segundo factor de la multiplicación.
     * @return El producto de los dos números.
     * @throws IllegalArgumentException Si alguno de los números es negativo.
     */
    public double multiplicar(double a, double b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos en la multiplicación.");
        }
        return a * b;
    }

    /**
     * Método principal para ejecutar ejemplos de uso de la clase OperacionesMatematicas.
     * Aquí se muestran ejemplos de cómo invocar cada método y cómo manejar las excepciones
     * mediante bloques try-catch.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        OperacionesMatematicas op = new OperacionesMatematicas();

        // Ejemplo de suma correcta
        try {
            double resultadoSuma = op.sumar(5, 3);
            System.out.println("Suma: 5 + 3 = " + resultadoSuma);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en la suma: " + e.getMessage());
        }

        // Ejemplo de resta correcta
        try {
            double resultadoResta = op.restar(10, 4);
            System.out.println("Resta: 10 - 4 = " + resultadoResta);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en la resta: " + e.getMessage());
        }

        // Ejemplo de multiplicación correcta
        try {
            double resultadoMultiplicacion = op.multiplicar(7, 6);
            System.out.println("Multiplicación: 7 * 6 = " + resultadoMultiplicacion);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en la multiplicación: " + e.getMessage());
        }

        // Ejemplo que genera excepción: operación con un número negativo
        try {
            double resultadoError = op.sumar(-5, 3);
            System.out.println("Resultado (inválido): " + resultadoError);
        } catch (IllegalArgumentException e) {
            System.err.println("Captura de excepción: " + e.getMessage());
        }
    }
}