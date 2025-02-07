import java.util.Scanner;

public class SubArray {
  public static void main(String[] args) {
	int[] B= {-5,4,6,-3,4,1};
	Scanner sc=new Scanner(System.in);
	int max=0;
	
		int sum=0;
		for(int i=0;i<B.length;i++) {
		for(int j=i;j<B.length;j++) {
			sum=sum+B[i];
		}
		if(sum>max){
			max=sum;
		}
	}
		
	System.out.println(sum);

}
}
