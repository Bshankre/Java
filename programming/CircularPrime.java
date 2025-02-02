import java.util.Scanner;

public class CircularPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		 if(isCircular(number)) {
			 System.out.println("is prime");
		 }else {
			 System.out.println("is not prime");
		 }
		
	}
	public static boolean isCircular(int number) {
		int count=0,temp=number;
		while(temp>0) {
			count++;
			temp/=10;
		}
		
		int num=number;
		while(isPrime(num)) {
			int rem=num%10;
			int div=num/10;
			num=(int)(Math.pow(10, count-1)*rem)+div;
			
			if(num==number) {
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean isPrime(int number) {
		boolean flag=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag) {
			return true;
		}else {
			return false;
		}
	
	}

}
