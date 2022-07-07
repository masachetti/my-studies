package loops;

import java.util.Scanner;

public class BasicWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int idade;

        while(true){
            System.out.println("Digite o nome (0 para parar): ");
            name = scan.next();

            if (name.equals("0")){
                break;
            }
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + name + " | Idade: " + idade);
        }
    }
}
