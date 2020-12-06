package monRpg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character extends Entity{
	protected int mp;//Magic point
	protected int magic;//Magic Power
	protected int lvl=1;
	protected int xp=0 ;
	protected int money=200;
	protected Weapon weapon = new Weapon();
	protected ArrayList <Weapon> weaponInventory=new ArrayList<Weapon>();
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
	public Weapon getWeapon() {
		return weapon;
	}
	public ArrayList<Weapon> getWeaponInventory() {
		return weaponInventory;
	}
	
	
	//Methods
	
	public void startBattle(Monster m) {
		System.out.println("LE COMBAT SE LANCE");
		while(hp>0 && m.getHp()>0) {
			System.out.println("ATTAQUER : 1"+"\n");
			System.out.println("FUIR: 0"+"\n");
			Scanner sc2=new Scanner(System.in);//Player choose where he gonna move
			String choice=sc2.next();
			switch(choice) {
			case "1": m.takeDamage(this.armedAttack(m.getName()));//Monster gets damage from this character
			break;
			case "2":
				break;
			default:System.out.println("ERROR");
			}
			
		}
		
	}
	/*This method allows the character attack his/her opponent 
	 * we use a random value between 10 and strength+speed+weapon's damage
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
	public int flee(){
		System.out.println("Vous avez fuit...Vous perdez 10 pieces d'or");
		return money-10;
	}
	/*This method add the xp earned after a fight to the character's xp
	 */
	public int earnedXp(int xpLeft) {
		xp+=xpLeft;
		return xp;
	}
	/*This method permit changing weapon
	 */
	public void changeWeapon(Weapon w) {
		Weapon formerWeapon=this.weapon;//We collect the former weapon name
		this.weapon=w;//Replacing the former weapon with the new one
		System.out.println("Vous enlevez l'arme :"+formerWeapon.name);
		System.out.println("Vous vous equipez de l'arme :"+w.name);
		
	}
	/*This method is used in WeaponStore to add weapon to the inventory*/
	public void addInWeaponInventory(Weapon w) {
		weaponInventory.add(w);//Adding a weapon to the inventory's List
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"| MP = "+mp+"| Magic = "+magic+"| Xp = "+xp+"|";
	}
	
	
}
