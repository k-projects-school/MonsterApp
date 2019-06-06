package be.my_portfolio.monsterApp;

public class App {

	public static void main(String[] args) {
		Witch witch = new Witch("Scarlett Witch", 100, 100);
		Bear bear = new Bear(1, 20, 500);

		while (witch.isAlive() && bear.isAlive()) {
			witch.takeDamage(bear.bearClawAttack());
			bear.takeDamage(witch.fireBallAttack());
			
			if (!witch.isAlive()) {
				System.out.println("the witch is dead!!");
			}
			
			if (!bear.isAlive()) {
				System.out.println("The bear is slain!");
			}
		}
	}

}
