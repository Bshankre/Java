import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollections {
   public static void main(String[] args) {
	   Integer[] arr= {1,2,3,4,5};
	List<Integer> list=Arrays.asList(arr);
	
	Collections.reverse(list);
	
	Integer[] rev=list.toArray(new Integer[list.size()]);
	for(Integer a:rev) {
		System.out.println(a);
	}
}
}
