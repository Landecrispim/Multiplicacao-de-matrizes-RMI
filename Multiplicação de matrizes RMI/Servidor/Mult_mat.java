package Servidor;

import interfaces.matDistribuido;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author lander
 */

public class Mult_mat extends UnicastRemoteObject implements matDistribuido {

	private int a[][];
	private int b[][];
	private int ab[][];
	private int sm;
	private int LA, CA, LB, CB;

	private static final long serialVersionUID = 1L;

	protected Mult_mat() throws RemoteException {
		super();// TODO Auto-generated constructor stub
	}

	@Override
	public void setdados() throws RemoteException {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz A");
		LA = scan.nextInt();

		System.out.print("Digite o número de colunas da matriz A");
		CA = scan.nextInt();

		a = new int[LA][CA];

		// Populando Matriz A
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

		// Populando Matriz A
		for (int i = 0; i < LA; i++) {
			for (int j = 0; j < CA; j++) {
				System.out.println("Digite o elemento B" + '[' + i + ']' + '[' + j + ']');
				a[i][j] = scan.nextInt();
			}
		}

	}
	@Override
	public int[][] getAb() throws RemoteException {
		return ab;
	}

	@Override
	public void multiplicar() throws RemoteException {
		ab = new int[LA][CB];
		for (int i = 0; i < LA; i++)

		{
			for (int j = 0; j < this.CB; j++) {
				sm = 0;
				for (int k = 0; k < LA; k++) {
					sm = sm + (a[i][k] * b[k][j]);
				}
				ab[i][j] = sm;
				System.out.println(sm);
			}
		}
	}

	@Override
	public void resultado() throws RemoteException {
		System.out.println("Resultado");
		for (int i = 0; i < LA; i++) {
			for (int j = 0; j < CB; j++) {
				System.out.print(ab[i][j]);
				System.out.print("	");
			}
			System.out.println("\n");

		}
	}

	public void mostraa() throws RemoteException {
		System.out.println("A");
		for (int i = 0; i < LA; i++) {
			for (int j = 0; j < CA; j++) {
				System.out.print(a[i][j]);
				System.out.print("	");
			}
			System.out.println("\n");

		}
	}

	@Override
	public void setA(int[][] a) throws RemoteException {
		this.a = a;
	}

	@Override
	public void setB(int[][] b) throws RemoteException {
		this.b = b;
	}

	@Override
	public void setCA(int CA) throws RemoteException {
		this.CA = CA;
	}

	@Override
	public void setCB(int CB) throws RemoteException {
		this.CB = CB;
	}

	@Override
	public void setLA(int LA) throws RemoteException {
		this.LA = LA;
	}

	@Override
	public void setLB(int LB) throws RemoteException {
		this.LB = LB;
	}

}
