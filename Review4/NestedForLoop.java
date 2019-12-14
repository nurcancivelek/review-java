package Review4;

public class NestedForLoop {

	public static void main(String[] args) {
		//hotel floors triangle/pyramid
		
		
		
		for(int row=1; row<=5; row++) {
			//System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
			
		}
		
		System.out.println("***************");
		
		for(int row=1; row<=5; row++) {
			//System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(2* col-1);
			}
			System.out.println();
		
	}
		
		for(int row=1; row<=5; row++) {
			//System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(col*col+ " ");
			}
			System.out.println();
	}
		
		
		
	}	
}
