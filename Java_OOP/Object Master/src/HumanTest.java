
public class HumanTest {

	public static void main(String[] args) {
		Human m = new Human();
		Human A1 = new Human();
		
		System.out.println("Human health before attack: " + A1.health);
		System.out.println("Human health after attack: "+ m.Attack(A1));

		
		
		Wizard km= new Wizard();
        Ninja kr=new Ninja();
        Samurai ki=new Samurai();
        Samurai kf=new Samurai();

        System.out.println("the heal in  wizard : "+km.heal(m));
        System.out.println("the fireball in wizard : "+km.fireball(m));
        System.out.println("the deathblow in samurai : "+ki.deathBlow(m));
        System.out.println("the health of human : "+m.health);
        System.out.println("the stealth in ninja : "+kr.steal(m));
        System.out.println("the runaway ninja : "+kr.runAway());
        System.out.println("the meditate in samurai : "+ki.meditate());
        System.out.println("the meditate in samurai2 : "+kf.meditate());
        System.out.println("how many samurai i have : "+kf.howMany());

	}

}
