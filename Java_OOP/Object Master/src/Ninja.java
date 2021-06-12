
class Ninja extends Human{
	int stealth = 10;
	
	public int steal(Human x) {
		return x.health += this.stealth -= this.health;
	}
	
	public int runAway() {
		return Ninja.health -= 10;
	}


}
