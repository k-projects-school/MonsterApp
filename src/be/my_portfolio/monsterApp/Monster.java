package be.my_portfolio.monsterApp;

public abstract class Monster {
	private int hitPoints;
	private int maxHp;
	
	Monster(){
		super();
	}
	
	Monster(int maxHp){
		this.setMaxHp(maxHp);
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	/**
	 * Heal damage.
	 * 
	 * @param hp
	 */
	public void heal(int hp) {
		if (this.hitPoints - hp < 0) {
			this.setHitPoints(0);
		} else {
			this.hitPoints -= hp;
		}
	}
	
	/**
	 * Take damage.
	 * 
	 * Returns true or false whether the monster is dead or not
	 * 
	 * @param hp
	 * @return
	 */
	public boolean takeDamage(int hp) {
		this.hitPoints += hp;
		
		if (this.hitPoints >= this.maxHp) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check to see if the monster is still alive.
	 * 
	 * @return
	 */
	public boolean isAlive() {
		return this.hitPoints < this.maxHp;
	}
}
