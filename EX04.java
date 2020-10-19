//Bruno Coelho Alves
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a, b, c;
        double delta;

        System.out.print("Insira o valor: ");
        a = leia.nextDouble();
        System.out.print("Insira o valor: ");
        b = leia.nextDouble();
        System.out.print("Insira o valor: ");
        c = leia.nextDouble();
        delta = (b*b) - (4 * a * c);
       
        leia.close();

        System.out.println("Valor de delta: " + delta);
    }
    
   
}
