package application;

import java.util.Scanner;

public class NumberFound {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		int [][] mat = new int [L][C];
		int linha ;
		int coluna;
		for (int i = 0;i<mat.length;i++) {
		
			for (int j = 0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		for(int i = 0; i<mat.length;i++) {
			linha =0;
			coluna = 0;
			for(int j = 0; j<mat[i].length;j++) {
				linha = i;
				coluna = j;
				if(number == mat[i][j]) {
					System.out.println();
					System.out.print("Number found: " + linha + ", "+ coluna);
				}
				
				
			}
			
		}
		
		
		
		
		
		sc.close();

	}

}
