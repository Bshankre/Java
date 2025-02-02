import java.util.Scanner;

public class Spaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		consecutiveSpaces(s);
		
	}
    public static void consecutiveSpaces(String s) {
    	StringBuilder sb=new StringBuilder();
    	boolean spaceFound=false;
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(ch==' ') {
    			if(!spaceFound) {
    				sb.append(ch);
    				spaceFound=true;
    			}
    		}else {
    			sb.append(ch);
    			spaceFound=false;
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}
