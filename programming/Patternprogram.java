
public class Patternprogram {

	public static void main(String[] args) {
		int no=3;
		for(int i=1;i<=no;i++) {
			for(int j=no;j>=1;j--) {
				if(i>=j) {
					if(i==3 && j==2) {
						System.out.print("  ");
					}else
						System.out.print("* ");	
					
				}else {
					System.out.print(" ");
				}	
			}System.out.println();
		}
		for(int i=1;i<no;i++) {
			for(int j=1;j<no;j++) {
				if(i<=j) {
					System.out.print(" *");
				}else {
					System.out.print(" ");
				}	
			}System.out.println();
		}


	}

}
