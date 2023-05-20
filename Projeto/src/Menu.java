import java.util.Scanner;

public class Menu {
    public static void inicial() {
        limpar();
        System.out.println("""
            +------------------------+
            |         FUTIZ          |
            +------------------------+
                +----------------+    
                | 1. INSTRUÇÕES  |
                +----------------+
                | 2. CRÉDITOS    |
                +----------------+
                | 3. JOGAR       |
                +----------------+
                | 4. SAIR        |
                +----------------+
                        """);
    }

    public static void instrucoes() {
        limpar();
        System.out.println("""
                Este é um jogo de alternativas, então você irá utilizar:
                                A
                                B
                                C
                                D
                Para responder as questões, este é um jogo de pontos acumulativos.
                Você não perde pontos ao errar questões, então fique tranquilo.
                Ao final do quiz sua pontuação será exibida em sua tela, fique ligado!
                Preparado??
                                """);

        System.out.println("Enter para voltar ao menu");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

    public static void creditos() {
        limpar();
        System.out.println("""
                Integrantes:

                 * Guilherme dos Santos Soares
                 * Gustavo Souza Santana
                 * Otávio Augusto Silva Pereira
                            """);

        System.out.println("Enter para voltar ao menu");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

    public static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void swCase() {
        Scanner input = new Scanner(System.in);
        int opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1:
                limpar();
                instrucoes();
                input.nextLine();
                break;
            case 2:
                limpar();
                creditos();
                input.nextLine();
                break;
            case 3:
                limpar();
                PerguntasRespostas perguntasRespostas = new PerguntasRespostas();
                perguntasRespostas.jogar();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Digite uma opção válida!");
                try {
                    // Pausa a execução por 5 segundos (5000 milissegundos)
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                input.nextLine();
        }
    }
}
