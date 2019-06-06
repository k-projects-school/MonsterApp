package be.my_portfolio.monsterApp;

public class Witch extends MagicMonster {
	
	private String name;
	
	Witch(int hp){
		super(hp);
	}

	Witch(int hp, int mp) {
		super(hp, mp);
		// TODO Auto-generated constructor stub
	}
	
	Witch(String name, int hp, int mp){
		super(hp, mp);
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Cast a fire ball.
	 * 
	 * @return
	 */
	public int fireBallAttack() {
		System.out.println(this.name + " throwed a fireball and dealth 5hp damage!");
		return 5;
	}
}
