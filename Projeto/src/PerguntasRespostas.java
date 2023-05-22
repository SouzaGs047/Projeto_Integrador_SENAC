import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PerguntasRespostas {
    ArrayList<String> perguntas = new ArrayList<>();
    ArrayList<ArrayList<String>> respostas = new ArrayList<>();
    ArrayList<String> respostaCerta = new ArrayList<>();

    public PerguntasRespostas() {
        // Adicionando perguntas
        perguntas.add("Qual é o nome do esporte em que os jogadores usam os pés para chutar uma bola?");
        perguntas.add("Quantos jogadores compõem uma equipe de futebol em campo?");
        perguntas.add("Quantos tempos regulamentares existem em uma partida de futebol??");
        perguntas.add("Quantos minutos dura cada tempo regulamentar em uma partida de futebol?");
        perguntas.add("Quem é o artilheiro de todos os tempos da seleção brasileira de futebol?");
        perguntas.add("Qual é o nome dado ao jogador que atua na última linha de defesa, próximo ao gol?");
        perguntas.add("Em qual país foi realizada a Copa do Mundo de 2018");
        perguntas.add("Qual é o nome do estádio de futebol localizado no Rio de Janeiro, Brasil?");
        perguntas.add("Em qual país está localizado o clube de futebol Barcelona?");
        perguntas.add("Em que ano a seleção brasileira de futebol masculino conquistou sua última medalha de ouro olímpica?");

        // Adicionando respostas para a primeira pergunta
        ArrayList<String> respostasPergunta1 = new ArrayList<>();
        respostasPergunta1.add("Futebol");
        respostasPergunta1.add("Basquete");
        respostasPergunta1.add("Tênis");
        respostasPergunta1.add("Golfe");

        // Adicionando respostas para a segunda pergunta
        ArrayList<String> respostasPergunta2 = new ArrayList<>();
        respostasPergunta2.add("10");
        respostasPergunta2.add("11");
        respostasPergunta2.add("12");
        respostasPergunta2.add("9");

        // Adicionando respostas para a terceira pergunta
        ArrayList<String> respostasPergunta3 = new ArrayList<>();
        respostasPergunta3.add("1");
        respostasPergunta3.add("2");
        respostasPergunta3.add("3");
        respostasPergunta3.add("4");

        // Adicionando respostas para a quarta pergunta
        ArrayList<String> respostasPergunta4 = new ArrayList<>();
        respostasPergunta4.add("30");
        respostasPergunta4.add("45");
        respostasPergunta4.add("60");
        respostasPergunta4.add("90");

        // Adicionando respostas para a quinta pergunta
        ArrayList<String> respostasPergunta5 = new ArrayList<>();
        respostasPergunta5.add("Romário");
        respostasPergunta5.add("Ronaldo");
        respostasPergunta5.add("Pele");
        respostasPergunta5.add("Neymar");

        // Adicionando respostas para a sexta pergunta
        ArrayList<String> respostasPergunta6 = new ArrayList<>();
        respostasPergunta6.add("Goleiro");
        respostasPergunta6.add("Zagueiro");
        respostasPergunta6.add("Lateral");
        respostasPergunta6.add("Atacante");

        // Adicionando respostas para a setima pergunta
        ArrayList<String> respostasPergunta7 = new ArrayList<>();
        respostasPergunta7.add("Brasil");
        respostasPergunta7.add("Alemanha");
        respostasPergunta7.add("Russia");
        respostasPergunta7.add("França");

        // Adicionando respostas para a oitava pergunta
        ArrayList<String> respostasPergunta8 = new ArrayList<>();
        respostasPergunta8.add("Maracana");
        respostasPergunta8.add("Camp Nou");
        respostasPergunta8.add("Santiago Bernabéu");
        respostasPergunta8.add("Old Trafford");

        // Adicionando respostas para a nona pergunta
        ArrayList<String> respostasPergunta9 = new ArrayList<>();
        respostasPergunta9.add("Espanha");
        respostasPergunta9.add("Alemanha");
        respostasPergunta9.add("Inglaterra");
        respostasPergunta9.add("Itália");

        // Adicionando respostas para a décima pergunta
        ArrayList<String> respostasPergunta10 = new ArrayList<>();
        respostasPergunta10.add("2004");
        respostasPergunta10.add("2008");
        respostasPergunta10.add("2012");
        respostasPergunta10.add("2016");

        // Adicionando as listas de respostas à lista de respostas
        respostas.add(respostasPergunta1);
        respostas.add(respostasPergunta2);
        respostas.add(respostasPergunta3);
        respostas.add(respostasPergunta4);
        respostas.add(respostasPergunta5);
        respostas.add(respostasPergunta6);
        respostas.add(respostasPergunta7);
        respostas.add(respostasPergunta8);
        respostas.add(respostasPergunta9);
        respostas.add(respostasPergunta10);

        // Embaralhando as respostas
        for (ArrayList<String> listaRespostas : respostas) {
            Collections.shuffle(listaRespostas);
        }

        respostaCerta.add("Futebol");
        respostaCerta.add("11");
        respostaCerta.add("2");
        respostaCerta.add("45");
        respostaCerta.add("Pele");
        respostaCerta.add("Goleiro");
        respostaCerta.add("Russia");
        respostaCerta.add("Maracana");
        respostaCerta.add("Espanha");
        respostaCerta.add("2016");
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
