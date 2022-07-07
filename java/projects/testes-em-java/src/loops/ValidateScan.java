package loops;

import java.util.Scanner;

public class ValidateScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada;
        boolean continueLoop = true;
        int number = -1;

        do {
            System.out.println("Digite um numero entre 0 e 10: ");
            entrada = scan.next();
            try {
                number = Integer.parseInt(entrada);
            } catch (Exception e) {
                System.out.println("Valor inválido!");
                continue;
            }
            if ((number>=0)&&(number<=10))
                continueLoop = false;
        } while (continueLoop);
        System.out.println("Number: "+ number);
    }
}
