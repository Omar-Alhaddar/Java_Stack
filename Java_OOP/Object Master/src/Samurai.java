
public class Samurai extends Human{
	
	static int health = 200;
	int k=0;
	
	public Samurai() {
		k++;
		
	}
	
	public int deathBlow(Human x) {
		
		x.health = 0;
		return this.health -= this.health/2;
		
	}
	
	public int meditate() {
		
		return this.health += this.health/2;
		
		
	}
	
	public int howMany() {
		return k;
		
		
	}

}
