//Exercício 27 — Tipo Sanguíneo e Doação

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é seu tipo sanguineo (ex:O-): ");
        String tipo = sc.nextLine();

        switch (tipo){
            case "A+":
                System.out.println("O sangue tipo A+");
                System.out.println("Pode receber de: O-, O+, A-, A+");
                System.out.println("Pode doar para: A+");
                break;
        }
        switch (tipo){
            case "A-":
                System.out.println("O sangue tipo A-");
                System.out.println("Pode receber de: O-, A-");
                System.out.println("Pode doar para: AB+, AB-, A+, A-");
                break;
        }
        switch (tipo){
            case "AB+":
                System.out.println("O sangue tipo AB+");
                System.out.println("Pode receber de: Todos (AB+, AB-, A+, A-, B+, B-, O+, O-)");
                System.out.println("Pode doar para: AB+");
                break;
        }
        switch (tipo){
            case "AB-":
                System.out.println("O sangue tipo AB-");
                System.out.println("Pode receber de: O-, B-, A-, AB-");
                System.out.println("Pode doar para: AB+, AB-");
                break;
        }
        switch (tipo){
            case "O+":
                System.out.println("O sangue tipo O+");
                System.out.println("Pode receber de: O+, O-");
                System.out.println("Pode doar para: AB+, A+, B+, O+");
                break;
        }
        switch (tipo){
            case "O-":
                System.out.println("O sangue tipo O-");
                System.out.println("Pode receber de: O-");
                System.out.println("Pode doar para: Todos (AB+, AB-, A+, A-, B+, B-, O+, O-)");
                break;
        }


    }
}

