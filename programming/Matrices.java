import java.util.Scanner;

public class Matrices {
	
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and cols of first matrix");
		int rowA=sc.nextInt();
	    int colA=sc.nextInt();
	    
	    int[][] A=new int[rowA][colA];
	    System.out.println("Enter the first matrix elements");
		for(int i=0;i<rowA;i++) {
			for(int j=0;j<colA;j++) {
				A[i][j]=sc.nextInt();
			}
		}
	    System.out.println("Enter the elemens of second matrix");
	    int rowB=sc.nextInt();
	    int colB=sc.nextInt();
	    int[][] B=new int[rowB][colB];
	   
		 System.out.println("Enter the second matrix elements");
       for(int i=0;i<rowB;i++) {
    	   for(int j=0;j<colB;j++) {
    		   B[i][j]=sc.nextInt();
    	   }
       }
       
       if(colA!=rowB) {
    	   System.out.println("Matrix mutiplication is not possible");
    	   return ;
       }
       int[][] result=new int[rowA][colB];
       
       for(int i=0;i<rowA;i++) {
    	   for(int j=0;j<colB;j++) {
    		   for(int k=0;k<colA;k++) {
    			   result[i][j]+=A[i][k]*B[k][j];
    		   }
    	   }
       }
       System.out.println("Resultant matrix is :");
       
       for(int i=0;i<result.length;i++) {
    	   for(int j=0;j<result[0].length;j++) {
    		   System.out.print(result[i][j]+' ');
    	   }
    	   System.out.println();
       }
       
       sc.close();
}
}
