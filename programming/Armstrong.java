import java.util.Scanner;

public class Armstrong {

	public static int prime(int no) {
		boolean flag=true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			return no;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int Num=prime(no);
		if(Num!=0) {
			int temp=Num;
			int arm=Num;
			int rev=0;
			int count=0;
			while(Num!=0) {
				int rem=Num%10;
				count++;
				Num=Num/10;
			}
	    while(arm!=0) {
	    	int rem=arm%10;
	    	rev=(int) (rev*10+Math.pow(rem, count));
	    	arm=arm/10;
	    }
	    
	    if(temp==rev) {
	    	System.out.println("Number is prime armstrong number");
	    }else {
	    	System.out.println("Number is not prime armstrong number");
	    
		}
}else {
	System.out.println("Number is not a prime number");
}
	}

}
