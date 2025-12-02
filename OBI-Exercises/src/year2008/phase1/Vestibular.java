package year2008.phase1;

import java.util.Scanner;

// Link: https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/vestib/

public class Vestibular {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroQuestoes = scanner.nextInt();
        scanner.nextLine();

        String gabarito = scanner.nextLine();
        String opcoesMarcadas = scanner.nextLine();

        int acertos = 0;
        for (int i = 0; i < numeroQuestoes; i++) {
            if (gabarito.charAt(i) == opcoesMarcadas.charAt(i)) {
                acertos++;
            }
        }

        System.out.println(acertos);

        scanner.close();
    }
}
