import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");
        try ( Scanner scanner = new Scanner( System.in ) ) {
            do {
                System.out.print( "Veuillez saisir une commande : " );
            } while (!scanner.next().equals("quit"));
        }
    }
}
