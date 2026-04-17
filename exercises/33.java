import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o ganho: ");
        Scanner sc = new Scanner(System.in);

        // Entrada
        double salario = sc.nextDouble();

        double imposto = 0;
        String faixa = "Isento";

        // Processo
        if (salario <= 24000) {
            imposto = 0;
            faixa = "Isento";
        } else if (salario <= 33919) {
            imposto = salario * 0.075;
            faixa = "7.5%";
        } else if (salario <= 45012) {
            imposto = salario * 0.15;
            faixa = "15%";
        } else if (salario <= 55976) {
            imposto = salario * 0.225;
            faixa = "22.5%";
        } else {
            imposto = salario * 0.275;
            faixa = "27.5%";
        }

        // Saída
        System.out.printf("Faixa: %s | Imposto: R$ %.2f\n", faixa, imposto);
    }
}
