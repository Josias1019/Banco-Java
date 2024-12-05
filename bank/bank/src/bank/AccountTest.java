package bank;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.50);
		
		System.out.printf("%s balance: R$%.2f %n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$%.2f %n",
				account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do deposito para account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nValor adicionado %.2f para account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: R$%.2f %n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$%.2f %n",
				account2.getName(), account2.getBalance());
		
		System.out.print("Digite o valor do deposito para account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nValor adicionado %.2f para account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: R$%.2f %n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$%.2f %n",
				account2.getName(), account2.getBalance());
		
	}
	
}
