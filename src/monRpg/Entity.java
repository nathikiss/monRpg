package monRpg;

import java.util.Random;

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
	public void death() {
		if (hp<0) {//no negative numbers allowed
			hp=0;
		}
		System.out.println(name + "est mort");
		
	}
	
	public int simpleAttack() {
		Random rand = new Random();
		int dmgSimpleAttack = rand.nextInt(strength+speed);//rand entre 0 et Strenth+speed
		return dmgSimpleAttack;
	}
	public void takeDamage(int damage) {
		System.out.println(name+" perd "+damage+" hp");
	    hp = hp-damage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":\n"+"|Hp = "+hp+"|Strength  = "+strength+"|Speed = "+speed;
	}
}
