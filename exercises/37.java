import java.util.Scanner;

public class pontuacao_e_medalha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      /* Leia a pontuação de um atleta (0–100) e exiba a medalha: Ouro (90–100),

     Prata (75–89), Bronze (60–74) ou Sem medalha (abaixo de 60).

     Exemplo de entrada: 78 Exemplo de saída: Medalha de Prata!*/

        System.out.println("Informe a pontuação: ");
        int pontuacao = sc.nextInt();

        String premio;

        if (pontuacao >=90 && pontuacao <= 100){
            premio = "Medalha de Ouro";
        }

        else if (pontuacao >= 75 && pontuacao < 90) {
            premio = "Medalha de Prata";
        }

        else if (pontuacao >= 60 && pontuacao < 75) {
            premio = "Medalha de Bronze";
        }

        else if (pontuacao >= 0 && pontuacao < 60) {
            premio = "Sem Medalha";
        }

        else {
            premio = "Você inseriu um valor Inválido!";
        }

        System.out.println(premio);

    }
}