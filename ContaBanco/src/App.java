import java.util.Scanner;

import br.com.rodrigorosa.banco.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        criarConta();
    }

    private static void criarConta() {
        System.out.println("Bem-vindo ao Seu Banco Favorito!");
        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor preencha os dados abaixo para criar sua conta.");
        System.out.print("Informe o seu nome: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Informe a sua agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.print("Informe o número da sua conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Informe o saldo inicial: ");
        conta.setSaldo(scanner.nextDouble());

        scanner.close();

        System.out.println("Olá " + conta.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");
    }
}
