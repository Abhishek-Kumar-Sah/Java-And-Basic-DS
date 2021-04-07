package array;
import java.util.Scanner;
public class matrixAddintion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of rows");
		int i = sc.nextInt();
		System.out.println("No. of columns");
		int j = sc.nextInt();
				
		int[][] mat1 = new int[i][j];
		int[][] mat2 = new int[i][j];
		
		System.out.println("Entre matrix 1");
		
		for(int k =0 ; k<i ; k++) {
			for(int l=0 ; l<j ; l++) {
				
				mat1[k][l] = sc.nextInt();
				
			}
		}
		System.out.println("Entre matrix 2");
		
		for(int k =0 ; k<i ; k++) {
			for(int l=0 ; l<j ; l++) {
				
				mat2[k][l] = sc.nextInt();
				
			}
		}
		int[][] mat3 = new int[i][j];
		
		for(int k =0 ; k<i ; k++) {
			for(int l=0 ; l<j ; l++) {
				
				mat3[k][l] = mat2[k][l] + mat1[k][l];
				
			}
		}
		
//		for(int[][] r : mat3)
//			System.out.print(r+" ");
//		System.out.println();
		
		for(int k =0 ; k<i ; k++) {
			for(int l=0 ; l<j ; l++) {
				
			System.out.print(	mat3[k][l] +"  ");
				
			}
			System.out.println();
		}
	}

}
