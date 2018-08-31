package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_7_RotateMatrix {

	public static void main(String[] args) {
		
		// INCOMPLETE - DOES NOT WORK
		int [] [] matrix1 = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int [] [] matrix2 = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		rotateMatrix(matrix1);
		rotateMatrix(matrix2);
	}
	static void rotateMatrix(int [] [] inputMatrix) {
		System.out.println("Before rotate:");
		printMatrix(inputMatrix);
		
		for (int i=0;i<inputMatrix.length;i++) {
			for (int j=0;j<inputMatrix[i].length;j++) {
				int temp = inputMatrix[i][j]; // make top temp
				inputMatrix [i][j] = inputMatrix [j][i];
//				inputMatrix [3][0] = inputMatrix [3][3];
//				inputMatrix [3][3] = inputMatrix [0][3];
//				inputMatrix [0][3] =temp;
			}
		}

//		int temp = inputMatrix[0][0]; // make top temp
//		inputMatrix [0][0] = inputMatrix [3][0];
//		inputMatrix [3][0] = inputMatrix [3][3];
//		inputMatrix [3][3] = inputMatrix [0][3];
//		inputMatrix [0][3] =temp;
		
		System.out.println("\nAfter rotate:");
		printMatrix(inputMatrix);
	}
	static void invertMatrixAxis() {
		
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
