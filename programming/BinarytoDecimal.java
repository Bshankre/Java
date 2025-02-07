import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		String binary=sc.next();
		
		//method 1
//		int decimal=Integer.parseInt(binary,2);
//		System.out.println(decimal);
		
		//method2 
		int bin=Integer.parseInt(binary);
		int num=bin,pow=0;
		int number=0;
		while(num!=0) {
			int lastDigit=num%10; 
		   number+=lastDigit*Math.pow(2, pow++);
			num=num/10;
		}
		
		System.out.println(number);
	}
}
