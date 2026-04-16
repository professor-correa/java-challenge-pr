void main(){
        double valor = Double.parseDouble(IO.readln("Informe o valor do produto: "));
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

        IO.println("O seu desconto foi de: " + valorFinal);

    }

