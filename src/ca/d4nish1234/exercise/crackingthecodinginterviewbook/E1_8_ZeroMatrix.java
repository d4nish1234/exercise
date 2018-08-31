package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_8_ZeroMatrix {

	public static void main(String[] args) {
		// TODO: write code such that if an element is zero in the matrix the entire row and column is set to zero
		
		int [] [] matrix1 = new int[][] {{1,2,3,0,5},{6,7,8,9,10},{11,12,13,14,0},{16,17,18,19,20},{0,22,23,24,25}};
		int [] [] matrix2 = new int[][] {{1,2,3,4},{5,0,7,8},{9,10,11,12},{0,14,15,16}};
		
		zeroMatrix(matrix1);
		
		zeroMatrix(matrix2);
	}
	
	static void zeroMatrix(int [] [] inputMatrix) {
		
		System.out.println("Before transformation");
		printMatrix(inputMatrix);
		// assuming that inputMatrix is not empty
		
		// create a boolean matrix that would keep track of original zeros
		boolean [] [] zeroTrackMatrix = new boolean[inputMatrix.length][inputMatrix[0].length];
		
		for (int i =0; i<inputMatrix.length; i++) {
			for (int j = 0; j<inputMatrix[i].length;j++) {
				if (inputMatrix[i][j] == 0) {
					zeroTrackMatrix [i][j] = true;
				}
			}
		}
		// TODO: enhancement create a set that would keep track of which columns /  rows were zeroed. 
		// use this set in the below loop to skip rows/column
		for (int i =0; i<inputMatrix.length; i++) {
			for (int j = 0; j<inputMatrix[i].length;j++) {
				if (inputMatrix[i][j] == 0 && zeroTrackMatrix[i][j]) {
					makeRowZeros(inputMatrix,i);
					makeColumnZeros(inputMatrix,j);
				}
			}
		}
		
		System.out.println("After transformation");
		printMatrix(inputMatrix);
		
	}
	static int [] [] makeRowZeros(int [] [] matrix, int row ){
		for (int i=0; i<matrix.length;i++) {
			matrix[row][i] =0;
		}
		return matrix;
	}
	static int [] [] makeColumnZeros(int [] [] matrix, int column){
		for (int i=0; i<matrix.length;i++) {
			matrix[i][column] =0;
		}
		return matrix;
	}
	static void printMatrix(int [] [] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.printf("%3d",matrix[i][j]);
			}
			System.out.println();
		}
	}
}
