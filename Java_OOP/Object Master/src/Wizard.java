
public class Wizard extends Human{
	int health = 50;
	int intelligence = 8;
	
	public int heal(Human x) {
		
		return x.health += this.intelligence;
		
	}
	
	public int fireball(Human x) {
		
		return x.health -= this.intelligence *3;
		
	}

}
