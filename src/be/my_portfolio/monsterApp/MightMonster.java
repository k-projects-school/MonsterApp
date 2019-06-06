package be.my_portfolio.monsterApp;

public abstract class MightMonster extends Monster {
	
	private int ragePoints;
	private int maxRp;

	public MightMonster() {
		super();
	}

	MightMonster(int maxHp) {
		super(maxHp);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ragePoints
	 */
	public int getRagePoints() {
		return ragePoints;
	}

	/**
	 * @param ragePoints the ragePoints to set
	 */
	public void setRagePoints(int ragePoints) {
		this.ragePoints = ragePoints;
	}

	/**
	 * @return the maxRp
	 */
	public int getMaxRp() {
		return maxRp;
	}

	/**
	 * @param maxRp the maxRp to set
	 */
	public void setMaxRp(int maxRp) {
		this.maxRp = maxRp;
	}
	
	/**
	 * Restore the rage points.
	 * 
	 * @param rp
	 */
	public void restoreRp(int rp) {
		if (this.ragePoints - rp < 0) {
			this.setRagePoints(0);
		} else {
			this.ragePoints -= rp;
		}
	}
	
	/**
	 * Restore the rage points.
	 * 
	 * @param rp
	 */
	public boolean useRp(int rp) {
		if (this.ragePoints + rp > this.maxRp) {
			System.out.println("Can't use a special attack: insufficient rage points!");
			return false;
		} else {
			this.ragePoints += rp;
			return true;
		}
	}

}
