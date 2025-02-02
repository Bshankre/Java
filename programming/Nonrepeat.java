import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class Nonrepeat {

	public static void main(String[] args) {
		Map<Integer,Character> m1=new LinkedHashMap<Integer,Character>();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
		for(Character ch:str.toCharArray()){
			m1.put(i++, ch);
		}
        System.out.println(m1);
        
        for(Entry<Integer, Character> p:m1.entrySet()) {
        	System.out.println(p.getKey()+" "+p.getValue());
        }
	}
}
