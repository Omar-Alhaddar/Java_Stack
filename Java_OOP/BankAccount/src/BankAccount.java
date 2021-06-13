public class BankAccount {
	
	String AccountNumber;
	static double CheckingBalance;
	static double SavingBalance;
	
	private static int AccountsCount = 0;
	private static double TotalAmount = 0;
	
	public BankAccount() {

		AccountsCount++;
		TotalAmount = 0;
		RandomDigits(AccountNumber);
	}
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		CheckingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return SavingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		SavingBalance = savingBalance;
	}

	public static int AccountsCount() {
	       return AccountsCount;
	   }
	
	private static String RandomDigits(String AccountNumber) {
		
		
		int max=0;
		int min=10;
		
		for (int i=0 ; i<10 ; i++) {
			
			AccountNumber+=(int) Math.floor(Math.random()*(max-min+1)+min);
		}
		System.out.println(AccountNumber);
		return AccountNumber;
	}
	
	public static void deposit(double amount , String x) {
		TotalAmount+=amount;
		if(x=="Checking") {
			CheckingBalance+=amount;
		}
		else {
			SavingBalance+=amount;}
		}
		
		public static int withdraw (double amount , String x) {
			
			if(amount<TotalAmount) {
			TotalAmount-=amount;
			if(x=="Checking" && amount<CheckingBalance) {
				CheckingBalance-=amount;
			}
			else if(x=="Saving" && amount<SavingBalance) {
				SavingBalance-=amount;
			}}
			else {
				System.out.println("Fuck you u dont have any money poor guy");
			}
		
		
		
		return AccountsCount;
		
		
		
	}
		public static void print() {
			System.out.println(CheckingBalance);
			System.out.println(SavingBalance);
			System.out.println(TotalAmount);
		}
	
		public static void main(String[] args) {
			deposit(50 , "7lal");
			deposit(70 , "Checking");
			withdraw(30 , "Checking");
			withdraw(30 , "Checking");
			withdraw(90 , "Checking");
			 print();
		}

}
