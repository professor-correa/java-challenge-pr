import static java.lang.IO.*;



void main(){
    int num = Integer.parseInt(readln("Digite um numero: \n"));
    if (num % 2 == 0){
        println("O numero " + num + " é par");

    }
    else{
        println("O numero " + num + " é impar");

    }

}