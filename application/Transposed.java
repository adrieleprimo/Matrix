package application;

import java.util.Scanner;

public class Transposed {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		int [][] mat = new int [L][C];
		
		for (int i = 0; i<mat.length;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				
				
			}
			
		}
		for (int i = 0; i<mat.length;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				System.out.print(mat[j][i] + " ");
				
			}
			System.out.println();
			
		}
	
		
		
		
		
		sc.close();

	}

}
