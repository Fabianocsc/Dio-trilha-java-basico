import java.util.Locale;
import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite a agência");
        String agencia = scanner.next(); 

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        Double saldo = 1500.0;

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta com nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close(); 
    }
}
