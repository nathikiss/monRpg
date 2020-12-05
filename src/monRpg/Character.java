package monRpg;

public class Character extends Entity{
	protected int mp;//Magic point
	protected int magic;//Magic Power
	
	public Character(String n, int h, int s, int sp, int mp, int m) {
		// TODO Auto-generated constructor stub
		super(n, h, s, sp);
		this.mp=mp;
		this.magic=m;
	}
	
	public int getMp() {
		return mp;
	}
	public int getMagic() {
		return magic;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" MP = "+mp+"\n"+"Magic = "+magic;
	}
	
}
