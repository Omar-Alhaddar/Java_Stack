public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return super.getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
		return "unlocked";
        // your code here
    }
    @Override
    public void displayInfo() {
    	System.out.println(super.getBatteryPercentage());
    	System.out.println(super.getCarrier());
    	System.out.println(super.getRingTone());
    	System.out.println(super.getVersionNumber());
    }
}
