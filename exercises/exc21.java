import static java.lang.IO.*;
void main() {
    //declarar os angulos do triangulo//
    int angulo1= Integer.parseInt(readln("insira o valor do primeiro angulo"));
    int angulo2= Integer.parseInt(readln("insira o valor do segundo angulo"));
    int angulo3= Integer.parseInt(readln("insira o valor do terciro angulo"));
    int soma = angulo1 + angulo3 + angulo2;
    //verificar se e um triangulo
    if (soma ==180){
        if (angulo1 <90 && angulo2 < 90 && angulo3 <90){
            println("isso e um triangulo Acutângulo");
        }
        else if ( angulo1 ==90 || angulo2 ==90 || angulo3 == 90) {
            println("isso e um triangulo retangulo");
        }
        else {
            println("isso e um triangulo obtusângulo");
        }
    }
    else {
        println("isso não e um triangulo");
    }

}