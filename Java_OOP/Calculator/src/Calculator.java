
public class Calculator{
	
	public static void main(String[] args) {
	
		getResults();
		
	}
	
	public static double setOperandOne(double x) {
		
		return x;
		
	}
	
	public static char setOperation(char y) {
		
		return y;
		
	}
	
	public static double setOperandTwo(double x) {
		
		return x;
		
	}
	
	public static double performOperation() {
		double x = 0;
		char x2 = setOperation('+');
		
		if (x2=='+') {
			x= setOperandOne(10.5) + setOperandTwo(5.2);
			

			
		}
		else if (x2=='-') {
			x= setOperandOne(10.5) - setOperandTwo(5.2);
		}
		else 
			System.out.println("wrong Operation");
		return x;
	}
	public static void getResults() {
		
		System.out.println(performOperation());
		
	}
	
	
	
	
}