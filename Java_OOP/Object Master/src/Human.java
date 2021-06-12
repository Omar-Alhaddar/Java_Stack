
public class Human {


	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	static int health = 100;
	
	public int Attack(Human x) {
		
		return x.health -=this.strength;
	}
}
