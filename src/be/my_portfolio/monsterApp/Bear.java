package be.my_portfolio.monsterApp;

public class Bear extends MightMonster {
	
	private int holeNr;

	Bear(){
		super();
	}
	
	Bear(int maxHp) {
		super(maxHp);
	}
	
	Bear(int maxHp, int maxRp) {
		super(maxHp);
		this.setMaxRp(maxRp);
	}
	
	Bear(int holeNr, int maxHp, int maxRp) {
		super(maxHp);
		this.setHoleNr(holeNr);
		this.setMaxRp(maxRp);
	}

	/**
	 * @return the holeNr
	 */
	public int getHoleNr() {
		return holeNr;
	}

	/**
	 * @param holeNr the holeNr to set
	 */
	public void setHoleNr(int holeNr) {
		this.holeNr = holeNr;
	}
	
	/**
	 * Use the bear claw attack.
	 * 
	 * @return
	 */
	public int bearClawAttack() {
		System.out.println("The bear from hole " + this.holeNr + " used bear claw attack and dealth 5hp damage!");
		return 5;
	}

}
