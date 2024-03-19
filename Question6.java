package com.task1;

public class Question6 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		matrix[0][0]=5;
		matrix[0][1]=5;
		matrix[0][2]=5;
		matrix[0][3]=5;
		matrix[0][4]=5;
		matrix[1][0]=5;
		matrix[1][1]=4;
		matrix[1][2]=4;
		matrix[1][3]=4;
		matrix[1][4]=4;
		matrix[2][0]=5;
		matrix[2][1]=4;
		matrix[2][2]=3;
		matrix[2][3]=3;
		matrix[2][4]=3;
		matrix[3][0]=5;
		matrix[3][1]=4;
		matrix[3][2]=3;
		matrix[3][3]=2;
		matrix[3][4]=2;
		matrix[4][0]=5;
		matrix[4][1]=4;
		matrix[4][2]=3;
		matrix[4][3]=2;
		matrix[4][4]=1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
 