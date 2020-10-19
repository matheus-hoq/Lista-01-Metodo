//Bruno Coelho Alves
import java.util.Scanner;
public class EX02 {
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
        leia.close();
    }
    
    static boolean isZero(double num){
        return num == 0;
        }
}
