import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do produto: ");
	    double valor = sc.nextDouble();
	    double valorFinal;
	    
	  if (valor < 50.00) {
            valorFinal = valor;
        } else if (valor >= 50.00 && valor < 100.00) {
          
            valorFinal = valor * 0.90;
            //multiplica os 10%
        } else {
           
            valorFinal = valor * 0.80;
            //multiplica os 20%
        }
	   
	    
	    System.out.println("O seu desconto foi de: " + valorFinal);
	    
	}
}
