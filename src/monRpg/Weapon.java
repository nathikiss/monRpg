package monRpg;
public class Weapon extends WeaponAbstract {
	protected String name="poing";
	protected int price=0;
	private static final double damage=4;
	public Weapon() {
		super(damage);
	}
	public Weapon(String name,double d) {
		super(d);
		this.name=name;
	}
	public Weapon(String name,double d,int price) {
		super(d);
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}
	public double getDamage() {
		return damage;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String ascii_art(String art) {
		
		return art;
	}
	@Override
	public String ascii_art() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|"+name+super.toString()+"|price = "+price;
	}
	
}
