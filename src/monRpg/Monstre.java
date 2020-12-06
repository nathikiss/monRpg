package monRpg;

import java.util.Random;

public class Monstre extends Entity {
	protected int rage=0;
	protected String roar;
	protected int xpLeft=100;
	
	public Monstre() {//MONSTRE BASE
		// TODO Auto-generated constructor stub
		super("Crapaud", 100, 8, 10);
		this.roar="Croasse";
		
	}
	public Monstre(String n, int h, int s, int sp, String r,int xpLeft) {
		// TODO Auto-generated constructor stub
		super(n, h, s, sp);
		this.roar=r;
		this.xpLeft=xpLeft;
	}
	
	public int getRage() {
		return rage;
	}
	public String getRoar() {
		return roar;
	}
	public int getXpLeft() {
		return xpLeft;
	}
	//IF RAGE = 5, MONSTRE => RAGEATTACK!!!
	public int ragePlusOne() {
		return rage+1;
	}
	public int monstreAttack() {
		Random rand = new Random();
		int dmgSimpleAttack = rand.nextInt(strength+speed);
		return dmgSimpleAttack;
	}
	public int rageAttack(int simpleAttack) {
		return (rage/2)*simpleAttack;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"|Rage = "+rage+"| XPLaiss�: "+xpLeft+"|";
	}
	public String monsterComing() {
		return "Un(e) "+name+" "+roar;
	}
}
