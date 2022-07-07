package arrays;

import java.util.Scanner;

public class ConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String text = scanner.next();
        int counter = 0;

        for (char letter : text.toCharArray()) {
            switch (letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    counter++;
                    break;
            }
        }
        System.out.println("Numero de consoantes: " + counter);
    }
}
