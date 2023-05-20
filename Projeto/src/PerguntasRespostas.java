import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PerguntasRespostas {
    ArrayList<String> perguntas = new ArrayList<>();
    ArrayList<ArrayList<String>> respostas = new ArrayList<>();
    ArrayList<String> respostaCerta = new ArrayList<>();

    public PerguntasRespostas() {
        // Adicionando perguntas
        perguntas.add("Qual é a capital da França?");
        perguntas.add("Qual é o maior oceano do mundo?");
        perguntas.add("Quem pintou a Mona Lisa?");

        // Adicionando respostas para a primeira pergunta
        ArrayList<String> respostasPergunta1 = new ArrayList<>();
        respostasPergunta1.add("Paris");
        respostasPergunta1.add("Londres");
        respostasPergunta1.add("Roma");
        respostasPergunta1.add("Berlim");

        // Adicionando respostas para a segunda pergunta
        ArrayList<String> respostasPergunta2 = new ArrayList<>();
        respostasPergunta2.add("Oceano Atlântico");
        respostasPergunta2.add("Oceano Índico");
        respostasPergunta2.add("Oceano Pacífico");
        respostasPergunta2.add("Oceano Ártico");

        // Adicionando respostas para a terceira pergunta
        ArrayList<String> respostasPergunta3 = new ArrayList<>();
        respostasPergunta3.add("Leonardo da Vinci");
        respostasPergunta3.add("Pablo Picasso");
        respostasPergunta3.add("Vincent van Gogh");
        respostasPergunta3.add("Michelangelo");

        // Adicionando as listas de respostas à lista de respostas
        respostas.add(respostasPergunta1);
        respostas.add(respostasPergunta2);
        respostas.add(respostasPergunta3);

        // Embaralhando as respostas
        for (ArrayList<String> listaRespostas : respostas) {
            Collections.shuffle(listaRespostas);
        }

        respostaCerta.add("Paris");
        respostaCerta.add("Oceano Pacífico");
        respostaCerta.add("Leonardo da Vinci");
    }

    public void jogar() {
        Scanner input = new Scanner(System.in);

        // Exibindo as perguntas e respostas
        int pontos = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            var numeroPergunta = i+1;
            System.out.println(numeroPergunta + ") " + perguntas.get(i));
            System.out.println();

            ArrayList<String> listaRespostas = respostas.get(i);
            char letra = 'A';

            for (String resposta : listaRespostas) {
                System.out.println(letra + ") " + resposta);
                letra++;
            }
            System.out.print("\n>> ");
            String respostaUsuario = input.nextLine();
            System.out.println();

            if (respostaCerta.get(i).equalsIgnoreCase(respostaUsuario)) {
                pontos++;
            }
        }
        if(pontos == 10){
            System.out.println("Impressionante, você acertou todas as perguntas.");
            System.out.println("Você acertou: " + pontos + " questoões");

        }else if(pontos == 9){
            System.out.println("Parabéns pelo seu desempenho, faltou pouco");
            System.out.println("Você acertou: " + pontos + " questoões");
        }else if(pontos < 9){
            System.out.println("Ótimo desempenho");
            System.out.println("Você acertou: " + pontos + " questoões");
        }else if(pontos < 6){
            System.out.println("Parabéns por concluir o Quiz");
            System.out.println("Você acertou: " + pontos + " questoões");
        }

        input.nextLine();
        Menu.limpar();
    }
}
