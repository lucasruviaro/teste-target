public class Exercicio2 {

    public void respostaExercicio2(int numero){

        int a = 0;
        int b = 1;
        int fibonacci = 0;

        while (fibonacci < numero) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        String respostaPadrao = "Resultado exercício 2: ";

        if (fibonacci == numero) {
            System.out.println(respostaPadrao +"O número inserido pertence à sequência de Fibonacci.");
        } else {
            System.out.println(respostaPadrao + "O número inserido não pertence à sequência de Fibonacci.");
        }
    }
}

