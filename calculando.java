package br.com.alisson.model;
import br.com.alisson.model.calculadora;


public class calculando {
    public static void main(String[] args) {
        
        int s = calculadora.soma.Soma(2, 4);
        int su = calculadora.subtracao.Sub(10, 5);
        int mu = calculadora.multiplicacao.Mult(5, 10);
        int div = calculadora.divisao.Div(50, 100);
        System.out.println("O resultado da soma:" + s);
        System.out.println("O resultado da sub:" + su);
        System.out.println("O resultado da multiplicacao:" + mu);
        System.out.println("O resultado da divisao:" + div);

    }
}
