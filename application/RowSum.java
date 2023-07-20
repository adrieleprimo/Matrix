package application;

import java.util.Scanner;

public class SomaDeLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		int [][] mat = new int [L][C];
		int sum ;
		
		for ( int i = 0; i<mat.length;i++) {
			sum = 0;
			for(int j = 0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				sum += mat[i][j];
				
				
			}
		
			System.out.print(sum);
			System.out.println();

		}

		sc.close();

	}

}
