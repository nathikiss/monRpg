package monRpg;

public class Personnage {
	/*attributes*/
	private String name;
	private int hp;
	private int xp;
	/*Constructor
	 * 
	 * */
	public Personnage(String n, int h, int x) {
		this.name=n;
		this.hp=h;
		this.xp=x;
		
	}
	
	/*assesseurs*/
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getXp() {
		return xp;
	}
	
	public int attack() {
		int attackDamage=7*2;//changer en force*vitesse
		return attackDamage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+"Hp = "+hp+"\n"+"Xp  = "+xp;
	}
}
