package be.my_portfolio.monsterApp;

public abstract class MagicMonster extends Monster {
	
	private int magicPoints;
	private int maxMp;
	
	MagicMonster(int hp){
		super(hp);
	}
	
	MagicMonster(int hp, int mp){
		this.setMaxHp(hp);
		this.setMagicPoints(mp);
	}

	/**
	 * @return the magicPoints
	 */
	public int getMagicPoints() {
		return magicPoints;
	}

	/**
	 * @param magicPoints the magicPoints to set
	 */
	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	/**
	 * @return the maxMp
	 */
	public int getMaxMp() {
		return maxMp;
	}

	/**
	 * @param maxMp the maxMp to set
	 */
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}
	
	/**
	 * Restore the magic points.
	 * 
	 * @param mp - The amount of magic points to be restored
	 */
	public void restoreMp(int mp) {
		if (this.magicPoints - mp < 0) {
			this.setMagicPoints(0);
		} else {
			this.magicPoints += mp;
		}
	}
	
	public boolean useMp(int mp) {
		if (this.magicPoints + mp > this.maxMp) {
			System.out.println("Can't use a special attack: insufficient magic points!");
			return false;
		} else {
			this.magicPoints += mp;
			return true;
		}
	}

}
