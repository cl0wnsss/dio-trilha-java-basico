import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, informe o número da sua conta, por favor: ");
        String numero = scanner.next();

        System.out.println("Agora, informe o número da sua agência, por favor: ");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome completo, por favor: ");
        scanner.nextLine(); // consumir quebra de linha pendente
        String nome = scanner.nextLine();

        System.out.println("E para finalizarmos, informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(
    "Olá " + nome + ", obrigado por criar uma conta em nosso banco.\n" +
    "Agência: " + agencia + "\n" +
    "Conta: " + numero + "\n" +
    "Saldo: R$" + saldo + "\n" +
    "Seu saldo já está disponível para saque. Obrigado!"
);
    }
}
