
public class calculadora {

    int b;
    int a;
    int operacion;
    int resultado;

    public calculadora(int a, int b, int operacion) {
        this.a = a;
        this.b = b;
        this.operacion = operacion;
    }

    int sumar(int a, int b) { // este método recibe dos números y retorna su suma
        return a + b;
    }

    int restar(int a, int b) {
        return a - b;
    }

    int multiplicar(int a, int b) {
        return a * b;
    }

    int divisor(int a, int b) {
        return a / b;
    }

    int valorAbsolute(int a, int b) {
        return Math.abs(a);
    }

    long elevado(long d, long e) {
        return (long) (Math.pow(d, e));
    }

    boolean espositivo(int resultado) {

        if (resultado < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void imprimir() {
        switch (operacion) {

            case 1: // Sumar
                resultado = sumar(a, b);
                System.out.println("La operacion de la suma de: " + a + " + " + b + " es: " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
            case 2: // Restar
                resultado = restar(a, b);
                System.out.println("La operacion de la resta de: " + a + " - " + b + " es: " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
            case 3: // Multiplicar
                resultado = multiplicar(a, b);
                System.out.println("La operacion de la multiplicación de: " + a + " * " + b + " es: " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
            case 4: // division
                resultado = divisor(a, b);
                System.out.println("La operacion de la divición de: " + a + " / " + b + " es: " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
            case 5: // ValorAbsoluto
                resultado = valorAbsolute(a, b);
                System.out.println("La operacion del valor absoluto de: " + a + " es " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
            case 6: // elevado
                resultado = (int) elevado(a, b);
                System.out.println(
                        "La operacion del valor de elevar el exponente de: " + a + " & " + b + " es " + resultado);
                System.out.println(
                        "El resultado es positivo = true  &&  negativo = false \n Resultado: " + espositivo(resultado));
                break;
        }
    }

}
