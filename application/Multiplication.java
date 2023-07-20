package application;

import java.util.Scanner;

public class MultiplicacaoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int J = sc.nextInt();
		int[][] mat = new int[L][J];
		int mult = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				mult = mat[i][j] * mat[i][j];
				
				 System.out.print( mult +" " );

			}
			System.out.println();

		}

		sc.close();

	}

}
