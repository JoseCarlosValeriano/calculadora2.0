import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner introduce = new Scanner(System.in);

        int a = 2;
        int b = 4;

        System.out.println(
                "\n Elige una opción: \n1: Sumar \n2: Restar \n3: Multiplicar \n4: Dividir \n5: Valor Absoluto \n6: Elevar exponente ");
        int operacion = introduce.nextInt();

        calculadora calculo = new calculadora(a, b, operacion);

        calculo.imprimir();

        introduce.close();

    }

}