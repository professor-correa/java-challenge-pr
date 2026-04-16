import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- tarifas de energia elétrica ---");
        System.out.println("qual foi seu consumo de energia em kWh?: ");
        float energia =teclado.nextFloat();

        String situacao;

        if (energia < 101){
            situacao = "você irá pagar: " +(energia * 0.40);
        }else if (energia < 301){
            situacao = "você irá pagar: " +(energia * 0.65);
        }else situacao = "você irá pagar: "+(energia * 0.85);
        System.out.println(situacao);
    }
}
