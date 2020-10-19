
//Bruno Coelho Alves
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double a;

        double b;

        double c;

        double delta;

        System.out.println("INSIRA AS RAIZES DA EQUAÇÃO DE SEGUNDO GRAU!");

        System.out.print("Insira o valor: ");

        a = leia.nextDouble();

        System.out.print("Insira o valor: ");

        b = leia.nextDouble();

        System.out.print("Insira o valor: ");

        c = leia.nextDouble();

        delta = (b * b) - (4 * a * c);

        leia.close();

        boolean DifZero = isZero(a); // se o valor 'a' for diferente de Zero

        boolean DeltaMaior = isPositive(delta); // Será real se valor de 'delta' for maior ou igual a zero

        if (DifZero == true) {

            System.out.println("Raiz Existe!");

        } else {
            System.out.println("Raiz não Existe!");
        }
        if (DeltaMaior == true) {

            System.out.println("Raizes sao Reais!");

        } else {

            System.out.println("Delta = 0" + " e as Raizes sao Complexas!");

        }

        System.out.println("Valor de delta: " + delta);

    }

    //
    static boolean isZero(double DifZero) {

        return DifZero != 0;

    }

    static boolean isPositive(double DeltaMaior) {

        return DeltaMaior >= 0;

    }
}
