package year2008.phase1;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        String texto = scanner.nextLine();

        for (char c : texto.toCharArray()) {
            if (c == '-') {
                stringBuilder.append('-');
            }
            else if (c == "ABC") {

            }

        }


        scanner.close();
    }
}
