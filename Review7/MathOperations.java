package Review7;

public class MathOperations {
	
	int  add(int number1, int number2, int number3) {
	// void  add(int number1, int number2, int number3) {
		int sum=number1+number2+number3;
		// System.out.println("the sum of "+number1+" and "+number2+" and "+number3+" is "+sum);
		return sum;
	}
	//int substract(int number1, int number2) {
	void substract(int number1, int number2) {
		int result=number1-number2;
		System.out.println(number1+" - "+number2+" is "+result);
		//return result
		
	}
	//double multiply(double num1, double num2) {
	void multiply(double num1, double num2) {
		double result=num1*num2;
		System.out.println("The multiplicatiom of "+num1+ " and"+num2+" is "+result);
	//return result;
	}
	
	int multiply2(double num1, double num2) {
		double result=num1*num2;
		int resultint=(int) (result);
		return resultint;
	}
	//double divide(double num1, double num2) {
	void divide(double num1, double num2) {
		//double result;
		if(num2==0) {
			System.out.println("We cannot divide by 0.");
		}else {
			double result=num1/num2;
			System.out.println("the division og "+num1+" by "+num2+" is "+result);
		}
		//return result;
	}
}
