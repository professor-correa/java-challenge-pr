import java.util.Scanner;

void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a Nota (0 a 10): ");
    double nota = entrada.nextDouble();

    if (nota >= 6) {
        System.out.print("Aprovado!");
    } else {
        System.out.print("Reprovado!");
    }
}
