package monRpg;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameGrid gGrid = new GameGrid(5,5);
		Monstre crapaud= new Monstre();
		Knight k1= new Knight("Gideon");
		gGrid.posCharacter(2, 2, '@');
		gGrid.posCharacter(1, 5 ,'M');
		gGrid.displayGrid();
		System.out.println("    z"+"\n");
		System.out.println("q       d"+"\n");
		System.out.println("    s"+"\n");
		int i = 0;
		while( i <10) {
			Scanner sc1=new Scanner(System.in);//Player choose where he gonna move
			String mvtChoice=sc1.next();
			switch(mvtChoice) {
			case "z":gGrid.moveUp();
			break;
			case "s":gGrid.moveDown();
			break;
			case "q":gGrid.moveLeft();
			break;
			case "d":gGrid.moveRight();
			break;
			default:
				System.out.println("ERROR");
			}
			
			gGrid.displayGrid();
			i++;
		}
	
		
		/*System.out.println(k1.toString());
		System.out.println(crapaud.toString());
		Weapon k1Weapon = new Weapon();
		crapaud.takeDamage(k1.armedAttack(crapaud.name));
		System.out.println(crapaud.toString());
		crapaud.takeDamage(k1.armedAttack(crapaud.name));
		System.out.println(crapaud.toString());
		*/
		/*gGrid.moveDown();
		gGrid.moveRight();
		gGrid.moveLeft();
		gGrid.moveUp();
		gGrid.displayGrid();
		*/
		
		
	}

}
