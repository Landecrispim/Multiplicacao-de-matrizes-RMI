/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;
import java.rmi.RemoteException;
import java.util.Scanner; 

/**
 *
 * @author lander
 */
public class main {
    public static void main(String[] args) throws RemoteException {
              
        int a[][];
	 int b[][];
	 int ab[][];
	 int sm;
	 int LA,CA,LB,CB;
            
         Mult_mat c = new Mult_mat();
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o número de linhas da matriz A");
            LA = scan.nextInt();

            System.out.print("Digite o número de colunas da matriz A");
            CA = scan.nextInt();
            
            a= new int[LA][CA];
            
            //Populando Matriz A
            for(int i = 0; i < LA;i++){
                for(int j = 0; j < CA;j++){
                    System.out.println("Digite o elemento A"+'['+i+']'+'['+j+']'); 
                    a[i][j] = scan.nextInt();
                }
            }
            

              System.out.print("Digite o número de linhas da matriz B");
            LB = scan.nextInt();

            System.out.print("Digite o número de colunas da matriz B");
            CB = scan.nextInt();
            
            b= new int[LB][CB];
             
            //Populando Matriz B
            for(int i = 0; i < LA;i++){
                for(int j = 0; j < CA;j++){
                    System.out.println("Digite o elemento B"+'['+i+']'+'['+j+']'); 
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
          c.resultado();
    }
    
}
