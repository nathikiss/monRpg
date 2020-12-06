package monRpg;

import java.util.*;
public class WeaponStore {
	public String name = "CHEZ CID";
	public int rank=2;
	public ArrayList<Weapon>storeWeapons;

	/*Constructors*/
	public WeaponStore() {
		
	}
	public WeaponStore(List <Weapon> wps) {
		 this.storeWeapons.addAll(wps);//Add all weapons to the list
	}
	/*Assessors*/
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}
	public ArrayList<Weapon> getStoreWeapons() {
		return storeWeapons;
	}
	/*Methods*/
	public void displayAllWeapons() {
		for(int i = 0 ; i < storeWeapons.size(); i++) {
			System.out.println(i+": "+storeWeapons.get(i)+"\n");
		}
	}
	//Player choose a weapon between the list
	public Weapon selectOneWeapon() {
		for(int i = 0 ; i < storeWeapons.size(); i++) {
			System.out.println(i+": "+storeWeapons.get(i)+"\n");}
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		Weapon chosenWeapon=storeWeapons.get(choice);
		return chosenWeapon;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = "+name+" rank ="+rank;
	}
}
