import java.util.Scanner;

public class RevHasNext {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    try {
    	 if(size<=0) {
    	    	System.out.println( "Invalid input");
    	    	return;
    	    }
    }catch(Exception e) {
    	System.out.println(e);
    }
   
    
    for(int i=0;i<size;i++) {
    	if(!sc.hasNext()) {
    		System.out.println("Invalid input");
    		return;
    	}
    	
    	arr[i]=sc.nextInt();
    }
    
    System.out.println("Array Elements: ");
    int[] temp=new int[size];
    int j=0;
    for(int i=arr.length-1;i>=0;i--) {
    	temp[j++]=arr[i];
    }
    for(int num:temp) {
    	System.out.println(num);
    }
    
}
}
