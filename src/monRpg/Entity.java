package monRpg;

public class Entity {
	/*attributes*/
	protected String name;
	protected int hp;//Health Point
	protected int strength;
	protected int speed;
	/*Constructor
	 * 
	 * */
	public Entity(String n, int h) {
		this.name=n;
		this.hp=h;

		
	}
	public Entity(String n, int h, int s, int sp) {
		this.name=n;
		this.hp=h;
		this.strength=s;
		this.speed=sp;
		
	}
	
	
	/*Assessors*/
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getSpeed() {
		return speed;
	}
	public int getStrength() {
		return strength;
	}
	
	public int simpleAttack() {
		return strength+speed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+"Hp = "+hp+"\n"+"Strength  = "+strength+"\n"+"Speed = "+speed;
	}
}
