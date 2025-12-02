package year2008.phase1;

import java.util.Scanner;

// Link: https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/obi/

public class OBI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int participantes = scanner.nextInt();
        int pontosMinimos = scanner.nextInt();

        int aprovados = 0;
        for (int i = 0; i < participantes; i++) {
            int nota1 = scanner.nextInt();
            int nota2 = scanner.nextInt();

            if (nota1 + nota2 >= pontosMinimos) {
                aprovados++;
            }
        }

        System.out.println(aprovados);

        scanner.close();
    }
}
