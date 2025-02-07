import java.util.Scanner;

public class DecimaltoBin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		
/*
//		method 1
 * String bin="";
		int num=number;
		while(num!=0) {
		 bin=num%2+bin;
		 num=num/2;
		}
		
		System.out.println("binary of "+number+" is "+bin);
		*/
		
//		/*	
		
//		method 2
		String binary=Integer.toBinaryString(number);
		System.out.println(binary);
//		*/
		
	}

}
