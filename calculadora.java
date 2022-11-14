package br.com.alisson.model;

public class calculadora {

    public static void main(String[] args) {
        System.out.print("Um calculo de soma");
    }

    public class soma {
        public static int Soma(int x, int y) {
            int soma1 = x + y;
            return soma1;

        }
    }

    public class subtracao {
        public static int Sub(int x, int y) {
            int sub = x - y;
            return sub;
        }
    }

    public class divisao {
        public static int Div(int x, int y) {
            try {
                int Divi = x / y;

            } catch (ArithmeticException e) {
                System.out.println("Divisao por zero");
            }

            int Divi = x / y;
            return Divi;
        }
    }

    public class multiplicacao {
        public static int Mult(int x, int y) {
            int multiplicacao = x * y;
            return multiplicacao;
        }
    }
}