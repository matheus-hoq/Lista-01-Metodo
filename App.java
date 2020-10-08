//Bruno Coelho Alves
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num;

        System.out.print("Insira o valor: ");
        num = leia.nextDouble();

        boolean retorno = isZero(num);

        if( retorno == true){
            System.out.println("O valor é zero!!");
        }else{
            System.out.println("O valor não é zero!!");
        }
    }
    
    static boolean isZero(double num){
        return num == 0;
        }
}
