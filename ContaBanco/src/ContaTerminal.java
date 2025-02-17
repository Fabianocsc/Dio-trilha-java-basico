import java.util.Locale;
import java.util.Scanner;  // Corrigido para a classe Scanner com "S" maiúsculo

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // A forma de inicialização está correta, mas cuidado com o uso de Locale

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt(); // Leitura do número da conta

        System.out.println("Agora digite a agência");
        String agencia = scanner.next(); // Leitura da agência

        System.out.println("Digite seu nome");
        String nome = scanner.next(); // Leitura do nome

        Double saldo = 1500.0; // Saldo inicial

        // Corrigindo a saída com espaços apropriados
        System.out.println("Olá " + nome + ", obrigado por criar uma conta com nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close(); // Fechar o scanner após o uso
    }
}
