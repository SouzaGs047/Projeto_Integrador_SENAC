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
        perguntas.add("Quanto tempo dura cada tempo regulamentar em uma partida de futebol?");
        perguntas.add("Quem é o artilheiro de todos os tempos da seleção brasileira de futebol?");
        perguntas.add("Qual é o nome dado ao jogador que atua na última linha de defesa, próximo ao gol?");
        perguntas.add("Em qual país foi realizada a Copa do Mundo de 2018");
        perguntas.add("Qual é o nome do principal torneio de seleções nacionais do futebol?");
        perguntas.add("Qual é o nome do troféu concedido ao vencedor da Copa do Mundo?");
        perguntas.add("Em que ano a seleção brasileira de futebol masculino conquistou sua última medalha de ouro olímpica?");

        // Adicionando respostas para a primeira pergunta
        ArrayList<String> respostasPergunta1 = new ArrayList<>();
        respostasPergunta1.add("Futebol");
        respostasPergunta1.add("Basquete");
        respostasPergunta1.add("Tênis");
        respostasPergunta1.add("Golfe");

        // Adicionando respostas para a segunda pergunta
        ArrayList<String> respostasPergunta2 = new ArrayList<>();
        respostasPergunta2.add("10 jogadores");
        respostasPergunta2.add("11 jogadores");
        respostasPergunta2.add("12 jogadores");
        respostasPergunta2.add("9 jogadores");

        // Adicionando respostas para a terceira pergunta
        ArrayList<String> respostasPergunta3 = new ArrayList<>();
        respostasPergunta3.add("1 tempo");
        respostasPergunta3.add("2 tempo");
        respostasPergunta3.add("3 tempo");
        respostasPergunta3.add("4 tempo");

        // Adicionando respostas para a quarta pergunta
        ArrayList<String> respostasPergunta4 = new ArrayList<>();
        respostasPergunta3.add("30 minutos");
        respostasPergunta3.add("45 minutos");
        respostasPergunta3.add("60 minutos");
        respostasPergunta3.add("90 minutos");

        // Adicionando respostas para a quinta pergunta
        ArrayList<String> respostasPergunta5 = new ArrayList<>();
        respostasPergunta3.add("Romário");
        respostasPergunta3.add("Ronaldo");
        respostasPergunta3.add("Pelé");
        respostasPergunta3.add("Neymar");

        // Adicionando respostas para a sexta pergunta
        ArrayList<String> respostasPergunta6 = new ArrayList<>();
        respostasPergunta3.add("Goleiro");
        respostasPergunta3.add("Zagueiro");
        respostasPergunta3.add("Lateral");
        respostasPergunta3.add("Atacante");

        // Adicionando respostas para a setima pergunta
        ArrayList<String> respostasPergunta7 = new ArrayList<>();
        respostasPergunta3.add("Brasil");
        respostasPergunta3.add("Alemanha");
        respostasPergunta3.add("Rússia");
        respostasPergunta3.add("França");

        // Adicionando respostas para a oitava pergunta
        ArrayList<String> respostasPergunta8 = new ArrayList<>();
        respostasPergunta3.add("Copa do Mundo");
        respostasPergunta3.add("Liga dos Campeões");
        respostasPergunta3.add("Copa América");
        respostasPergunta3.add("Atacante");

        // Adicionando respostas para a nona pergunta
        ArrayList<String> respostasPergunta9 = new ArrayList<>();
        respostasPergunta3.add("Taça do Mundo");
        respostasPergunta3.add("Taça das Nações");
        respostasPergunta3.add("Taça da FIFA");
        respostasPergunta3.add("Taça Jules Rimet");

        // Adicionando respostas para a décima pergunta
        ArrayList<String> respostasPergunta10 = new ArrayList<>();
        respostasPergunta3.add("2004");
        respostasPergunta3.add("2008");
        respostasPergunta3.add("2012");
        respostasPergunta3.add("2016");

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
        respostaCerta.add("11 jogadores");
        respostaCerta.add("2 tempos");
        respostaCerta.add("45 minutos");
        respostaCerta.add("Pelé");
        respostaCerta.add("Goleiro");
        respostaCerta.add("Rússia");
        respostaCerta.add("Copa do Mundo");
        respostaCerta.add("Taça da FIFA");
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
