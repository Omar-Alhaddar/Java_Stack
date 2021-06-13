
public class PhoneTester {

	public static void main(String[] args) {
		
		IPhone x = new IPhone("iphonex", 97, "jawwal", "rain");
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());
		
		Galaxy y = new Galaxy("galaxy s2", 50 , "Zain" , "tamer hosney");
		y.displayInfo();
		System.out.println(y.ring());
		System.out.println(y.unlock());

	}

}
