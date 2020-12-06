package monRpg;
//AJOUTER UN PRICE pour chaque Arme
public class Weapon extends WeaponAbstract {
	protected String name="poing";
	private static final double damage=4;
	public Weapon() {
		super(damage);
	}
	public Weapon(String name,double d) {
		super(d);
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public double getDamage() {
		return damage;
	}
	@Override
	public String ascii_art() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
