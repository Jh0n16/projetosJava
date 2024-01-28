package com.calculadora;

// import java.util.Locale;
import java.util.Scanner;

public class App {
    static void defineMensagem(Pessoa pessoa) {
        if(pessoa.getImc() >= 40) {
            System.out.printf("Cuidado você precisa ir a um médico urgentemente! Seu IMC é %.2f, você tem Obesidade grau III.", pessoa.getImc());
            
        } else if(pessoa.getImc() >= 35) {
            System.out.printf("Talvez seja hora de ir visitar um médico. Seu IMC é %.2f, você tem Obesidade grau II.", pessoa.getImc());

        } else if(pessoa.getImc() >= 30) {
            System.out.printf("Sinal de alerta! Seu IMC é %.2f, você tem Obesidade grau I.", pessoa.getImc());

        } else if(pessoa.getImc() >= 25) {
            System.out.printf("Cuide melhor dos seus hábitos. Seu IMC é %.2f, você está em sobrepeso.", pessoa.getImc());

        } else if(pessoa.getImc() >= 18.6) {
            System.out.printf("Tudo certo! Seu IMC é %.2f, e você está na faixa ideal!", pessoa.getImc());

        } else {
            System.out.printf("Considere uma visita ao médico. Seu IMC é %.2f e você está abaixo do ideal.", pessoa.getImc());
            
        }
    }
    
    public static void main(String[] args) throws Exception {
        try {
            // Scanner scan = new Scanner(System.in).useLocale(Locale.US); // definindo a entrada com padrão US
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Digite sua altura em metros: ");
            double altura = scan.nextDouble();

            System.out.print("Digite seu peso em KG: ");
            double peso = scan.nextDouble();
            
            Pessoa pessoa = new Pessoa(altura, peso);
            pessoa.setImc(pessoa.calculaImc());
            
            defineMensagem(pessoa);


        } catch (Exception e) {
            System.err.println("Erro! Algo não saiu como o esperado... Tente Novamente.");
        }

    }
}
