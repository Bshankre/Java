import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Absent {
	public static boolean anagram(String s1,String s2) {
		if(s1.length()==s2.length()) {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return (Arrays.equals(ch1, ch2));
		}else {
			return false;
		}
	}
      public static boolean panagram(String str) {
    	  TreeSet<Character> t1=new TreeSet<Character>();
    	  String st=str.replaceAll(" ","");
    	  char[] s=st.toCharArray();
    	  for(char ch:s) {
    		  t1.add(ch);
    	  }
    	  if(t1.size()==26) {
    		  return true;
    	  }else {
    		  return false;
    	  }
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean anastring=anagram(str1,str2);
		System.out.println(anastring);
		if(anastring) {
			if(panagram(str2)) {
				System.out.println("given String is both anagram and panagram");
			}else {
				System.out.println("given string is anagram but not panagram");
			}
		}else {
			System.out.println("given string is not panagram and anagram");
		}
        
	}

}
