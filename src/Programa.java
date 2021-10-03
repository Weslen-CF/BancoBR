import java.util.Locale;
import java.util.Scanner;

import entidade.ContaCliente;

public class Programa {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCliente conta;
        
        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char letra = sc.next().charAt(0);
        if(letra == 'y') {
        	System.out.print("Enter a deposit value: ");
        	double inicialDeposito = sc.nextDouble();
        	conta = new ContaCliente(numero, titular, inicialDeposito);
        }
        else {
        	conta = new ContaCliente(numero, titular);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositoValor = sc.nextDouble();
        System.out.println("Updated account data:");
        conta.deposito(depositoValor);
        System.out.println(conta);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println("Updated account data:");
        System.out.println(conta);
        System.out.println();
        
        
        
        sc.close();
	}

}
