import java.util.Scanner;

public class ValidadorEntrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = -1;

        while (idade < 0) {
            System.out.println("Digite sua idade: ");

            if (sc.hasNextInt()) {
                idade = sc.nextInt();

                if (idade < 0) {
                    System.out.println("Idade não pode ser negativa.");
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.next();
            }
        }

        System.out.println("Idade registrada com sucesso: " + idade);
        sc.close();
    }
}