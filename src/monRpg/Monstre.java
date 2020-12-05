package monRpg;

public class Monstre extends Entity {
	protected int rage=0;
	protected String roar;
	public Monstre(String n, int h, int s, int sp, String r) {
		// TODO Auto-generated constructor stub
		super(n, h, s, sp);
		this.roar=r;
	}
	public int getRage() {
		return rage;
	}
	public String getRoar() {
		return roar;
	}
	//IF RAGE = 5, MONSTRE => RAGEATTACK!!!
	public int ragePlusOne() {
		return rage+1;
	}
	public int rageAttack(int simpleAttack) {
		return (rage/2)*simpleAttack;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String monsterComing() {
		return "Un(e) "+name+" "+roar;
	}
}
