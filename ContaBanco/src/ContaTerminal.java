import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Bem vindo(a) a ContaTerminal! Digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Para prosseguirmos por favor, digite o número da Conta!");
        int Numero = scanner.nextInt();

        System.out.println("Agora, por favor, Digite o seu nome!");
        String NomeCliente = scanner.next();

        System.out.println("Em seguida por favor, digite o seu sobrenome!");
        String SobrenomeCliente = scanner.next();

        System.out.println("Qual seria o seu saldo em conta?");
        Double Saldo = scanner.nextDouble();

        // exibir mensagem final da conta criada
        System.out.println("Olá " + NomeCliente + " " + SobrenomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + Numero + " e seu saldo " + Saldo +
                " já está disponível para saque");

        scanner.close();
    }
}
