//Bruno Coelho Alves
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    double num;

    System.out.print("Insira um valor: ");
    num = leia.nextDouble();

    boolean retornoPositivo = isPositive(num);
    boolean retornoNegativo = isNegative(num);
    boolean retornoZero = isZero(num);
    if(retornoPositivo == true){
        System.out.println("O valor é positivo!!");
    }else if(retornoNegativo == true){
        System.out.println("O valor é negativo!!");
    }else if(retornoZero){
        System.out.println("O valor é Zero!!");
    }
    leia.close();
    }
    static boolean isPositive(double num){
        return num >= 1;
    }
    static boolean isNegative(double num){
        return num < 0;
    }
    static boolean isZero(double num){
        return num == 0;
    }
}
