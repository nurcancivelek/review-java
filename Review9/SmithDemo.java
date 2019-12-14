package Review9;

public class SmithDemo {

	public static void main(String[] args) {
		
		SmithMember member1=new SmithMember();
		member1.increment();
		member1.firstName="John";
		member1.lastName="Smith";
		member1.gender='M';
		member1.salary=5000;
		
		SmithMember member2=new SmithMember();
		member2.increment();
		member2.firstName="Jane";
		member2.lastName="Smith";
		member2.gender='F';
		member2.salary=6000;
		
		member1.memberInfo();
		member2.memberInfo();
		System.out.println("There are "+SmithMember.count+" members.");
		
//		SmithMember.lastName="Doe";
//		
//		System.out.println("Last name changed to Doe");
		member1.memberInfo();
		member2.memberInfo();
		
		System.out.println("Baby is born");
		SmithMember baby=new SmithMember();
		baby.increment();
		baby.firstName="Adam";
		//SmithMember.lastName="Smith";
		baby.gender='M';
		baby.salary =500;
		System.out.println("There are "+SmithMember.count+" members.");
		
		System.out.println();
		System.out.println("Lets create James Family Members");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
