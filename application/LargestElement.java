package application;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		int [][] mat = new int [L][C];
		int value = 0;
		for(int i = 0; i<mat.length;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j]>value) {
					value=mat[i][j];
				}
				
			}
		}
		System.out.println("Maior numero: " + value);
		
		
		sc.close();

	}

}
