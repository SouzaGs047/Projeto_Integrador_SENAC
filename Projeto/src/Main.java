public class Main {
    static boolean sair;

    public static void main(String[] args) {
        do {
            Menu.inicial();
            Menu.swCase();
        } while (!sair);
    }
}