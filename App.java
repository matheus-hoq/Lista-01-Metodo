//Bruno Coelho Alves
import java.util.Scanner;
public class App {
    static boolean isPositive(double num){
        return num >= 0;

    }
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double num;
        
        System.out.println("Insira um valor: ");
        num = leia.nextDouble();
        boolean retorno = isPositive(num);
        if(retorno == true){
            System.out.println("O numero é positivo!");
        }else{
            System.out.println("O numero é negativo!");
        }
    }
}
