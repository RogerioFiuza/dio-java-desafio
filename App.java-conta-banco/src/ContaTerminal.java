import java.util.Locale;
import java.util.Scanner;

// DESAFIO JAVA - DIO TRILHA JAVA BÁSICO
// Criar um projeto que receberá dados via terminal contendo as características de contas
// Dentro do projeto deve conter uma classe ContaTerminal.java para realizar a codificação
// REGRAS DAS VARIÁVEIS: 
//   - Numero -> Inteiro 
//   - Agencia -> Texto
//   - Nome Cliente -> Texto
//   - Saldo -> Decimal

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("**********************************************************");
        System.out.println("--------------- DESAFIO JAVA / CONTA BANCO ---------------");
        System.out.println("**********************************************************");

        System.out.println("                                                          ");

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("                                                          ");
         
        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("                                                          ");

        // teste resolvendo problema do nome com espaço
        scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("                                                          ");
        
        System.out.print("Digite seu o saldo desejado: ");
        Double saldo = scanner.nextDouble();

        System.out.println("                                                          ");

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. ");
        System.out.println("                                                          ");
        System.out.println("----------------------------------------------------------");
    }
}
