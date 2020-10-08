package Cliente;

import interfaces.matDistribuido;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {

	public static void main(String args[]) throws MalformedURLException {
		try {

			int a[][];
			int b[][];
			int ab[][];
			int sm;
			int LA, CA, LB, CB;

			matDistribuido c = (matDistribuido) Naming.lookup("rmi://localhost:1099/Servico");

			Scanner scan = new Scanner(System.in);

			System.out.print("Digite o número de linhas da matriz A");
			LA = scan.nextInt();

			System.out.print("Digite o número de colunas da matriz A");
			CA = scan.nextInt();

			a = new int[LA][CA];

			for (int i = 0; i < LA; i++) {
				for (int j = 0; j < CA; j++) {
					System.out.println("Digite o elemento A" + '[' + i + ']' + '[' + j + ']');
					a[i][j] = scan.nextInt();
				}
			}

			System.out.print("Digite o número de linhas da matriz B");
			LB = scan.nextInt();

			System.out.print("Digite o número de colunas da matriz B");
			CB = scan.nextInt();

			b = new int[LB][CB];

			for (int i = 0; i < LA; i++) {
				for (int j = 0; j < CA; j++) {
					System.out.println("Digite o elemento B" + '[' + i + ']' + '[' + j + ']');
					b[i][j] = scan.nextInt();
				}
			}

			c.setA(a);
			c.setB(b);
			c.setCA(CA);
			c.setCB(CB);
			c.setLA(LA);
			c.setLB(LB);
			c.multiplicar();
			ab = c.getAb();
			System.out.println("Resultado");
			for (int i = 0; i < LA; i++) {
				for (int j = 0; j < CB; j++) {
					System.out.print(ab[i][j]);
					System.out.print("	");
				}
				System.out.println("\n");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
