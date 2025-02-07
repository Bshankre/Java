import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=reverse(size);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	public static int[] reverse(int size) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		 int[] temp=new int[size];
		 int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[j++]=arr[i];
		}
		
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i]);
//		}
//		
		return temp;
	}
	
	

}
