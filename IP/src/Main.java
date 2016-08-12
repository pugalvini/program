
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero hero = new Hero();
		Honda honda = new Honda();
		Bullet bullet = new Bullet();
		
		hero.run();
		honda.run();
		bullet.run();
		
		Bike b = new Honda();
		b.run();
		
	}

}
