package monRpg;

import java.util.Random;

public class Character extends Entity{
	protected int mp;//Magic point
	protected int magic;//Magic Power
	protected int lvl=1;
	protected int xp=0 ;
	protected int money=200;
	protected Weapon weapon = new Weapon();
	public Character(String n, int h, int s, int sp, int mp, int m) {
		// TODO Auto-generated constructor stub
		super(n, h, s, sp);
		this.mp=mp;
		this.magic=m;
	}
	
	//Assessors
	public int getMp() {
		return mp;
	}
	public int getMagic() {
		return magic;
	}
	public int getXp() {
		return xp;
	}
	public int getLvl() {
		return lvl;
	}
	
	public int getMoney() {
		return money;
	}

	
	
	//Methods
	/*This method add the xp earned after a fight to the character's xp
	 */
	public int earnedXp(int xpLeft) {
		xp+=xpLeft;
		return xp;
	}
	/*This method allows the character attack his/her opponent 
	 * we use a random value between 0 and strength+speed and we add to the result weapon's damage
	 */
	public int armedAttack(String target){//Attack with weapon on d corresponding to c1.simpleAttack()
		Random rand = new Random();
		int weaponD=(int) weapon.getDamage();//var content weapon's damages in integer
		int max = strength+speed+weaponD;//the damage Maximum will be the sum of those three values
		int dmg = rand.nextInt(max)+10;//the damages will be at last randomly select between 10 and max damages+10 
		System.out.println(name+" attaque "+target );
		System.out.println(max);

		System.out.println(target+" perd "+dmg+" hp");
		return dmg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"| MP = "+mp+"| Magic = "+magic+"| Xp = "+xp+"|";
	}
	
}
