import java.util.Scanner;
public class exercicios_03
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	System.out.println("Digite o primeiro número: ");
		  int numero1  = sc.nextInt();
	System.out.println("Digite o segundo número: ");
		  int numero2 = sc.nextInt();
		    
    if(numero1>numero2){
        System.out.println("O primeiro número digitado é o maior: " + numero1);
    } else if (numero1 == numero2) {
       System.out.println("Os números digitados são iguais!");
    
    }else{
        System.out.println("O segundo numero é o maior: " + numero2);   
    }    
        
        
	}
    
    
		  
		 
}
