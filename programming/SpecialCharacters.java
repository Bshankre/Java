import java.util.Scanner;

public class SpecialCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Character[] arr=new Character[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.next().charAt(0);
        }
        printString(arr);
        sc.close();
	}
	
	public static void printString(Character[] arr) {
		String str="";
		for(int i=0;i<arr.length;i++) {
			str=str+arr[i];
		}
		str = str.replaceAll("[A-Za-z0-9]", "");  
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
	
     
}
