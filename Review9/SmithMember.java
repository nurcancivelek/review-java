package Review9;

public class SmithMember {
	
		static String lastName;
		static int count;

		String firstName;
		char gender;
		int salary;

		public void increment() {
			count++;
		}

		public void memberInfo() {
			System.out.println(firstName + " " + lastName + " makes $" + salary + " monthly");
		}

	
}
