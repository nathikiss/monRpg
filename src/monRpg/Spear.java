package monRpg;

public class Spear extends Weapon {
	
	public Spear(String name,double d,int price) {
		// TODO Auto-generated constructor stub
			super(name, d, price);
		
	}
	public String ascii_art(){
		return "[]========================================>";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+"ART : "+ascii_art();
	}
}
