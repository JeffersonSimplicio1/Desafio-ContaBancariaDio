import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

	//Interação do programa com o cliente (boas vindas e solicitação do nome do cliente)
		System.out.println("Olá, Seja bem vindo!");
		System.out.println("Qual o seu nome?");
		String nomeUsuario = sc.next();
		
		System.out.println("Bem vindo a sua Conta Bancaria, " + nomeUsuario);
	
	// solicitação do numero da agencia e numero da conta
		System.out.println("Por favor, digite o numero da agencia! ");
		String agencia = sc.next();
		
		System.out.println("Digite o numero da sua conta!");
		int numeroConta = sc.nextInt();
		
	// saldo da conta pré etabelecido pelo programa.
		double saldo = 237.48;
		
	// Execução do script e finalização do programa.
		System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
