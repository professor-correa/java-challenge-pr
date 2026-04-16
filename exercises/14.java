import java.util.Scanner;
public class 14
{
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso(em kg): ");
		    float peso = sc.nextFloat();
		System.out.println("Digite sua altura(em metros): ");
		    float alt = sc.nextFloat();
		    float imc = peso / (alt * alt);
		    
	if (imc <= 18.5){
	    System.out.printf("%.2f - Abaixo do peso\n", imc);
	    
	} else if (imc > 18.5 && imc <= 24.9) {
	    System.out.printf("%.2f - Normal\n", imc);
	    
	} else if (imc > 24.9 && imc >= 29.9) {
	    System.out.printf("%.2f - Sobrepeso\n", imc);
	    
	} else {
	    System.out.printf("%.2f - Obeso\n", imc);
	    }
		
		
	}
}
