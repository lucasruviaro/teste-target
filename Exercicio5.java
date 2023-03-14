public class Exercicio5 {
    
    public void respostaExercicio5(String frase){

        char[] chars = frase.toCharArray();

        int n = chars.length;

        for (int i = 0; i < n / 2; i++) {
            char t = chars[i];
            chars[i] = chars[n - i - 1];
            chars[n - i - 1] = t;
        }
        String reverso = new String(chars);
        System.out.println("Resultado exercício 5: " + reverso);
    }
    }

