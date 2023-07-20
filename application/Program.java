package application;

import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int [M][N];
		for (int i = 0; i< mat.length;i++) {
			for (int  j = 0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int linha=0;
		int coluna = 0;
		int number = sc.nextInt();
		
		
		for (int i = 0; i<mat.length;i++) {
			for (int j = 0; j<mat[i].length;j++) {
				if (mat[i][j] == number) {
					linha = i;
					coluna = j;
				
					System.out.println("\nPosition " + linha + "," + coluna + ":");
					if (coluna >0 ) {
						int numeroEsquerda = mat[linha][coluna-1];
						System.out.print("Left: " + numeroEsquerda +"\n");
						
						
					}
					if(coluna < mat[linha].length -1) {
						int numeroDireita = mat[linha][coluna+1];
						System.out.print("Right: " + numeroDireita+ "\n");
					}
					
					if (linha> 0) {
						int numeroAcima = mat[linha-1][coluna];
						System.out.print("Up: " + numeroAcima + "\n");
					}
					if (linha < mat.length -1) {
						int numeroAbaixo = mat[linha+1][coluna];
						System.out.print("Down: " + numeroAbaixo + "\n");
					}
			
				}
			}

					}
					
		sc.close();
		

				
	}

}
