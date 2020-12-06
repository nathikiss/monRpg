package monRpg;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameGrid gGrid = new GameGrid(5,5);
		Monster crapaud= new Monster();
		Knight k1= new Knight("Gideon");
		//if user select Knight p1=k1;  if user select Mage p1=m1;
		Character p1 =k1;
		//rand(nb) case nb 1:opponent = crapaud, 2: opponent=lion
		Monster opponent=crapaud;
		
		gGrid.posCharacter(2, 4, '@');
		gGrid.posCharacter(3, 4 ,'M');
		gGrid.displayGrid();
		System.out.println("    z"+"\n");
		System.out.println("q       d"+"\n");
		System.out.println("    s"+"\n");
		int i = 0;
		/*BOUCLE COMBAT 4 DIRECTION*/
		while( i <10) {
			Scanner sc1=new Scanner(System.in);//Player choose where he gonna move
			String mvtChoice=sc1.next();
			switch(mvtChoice) {
			case "z":gGrid.move("z");
			break;
			case "s":gGrid.move("s");
			break;
			case "q":gGrid.move("q");
			break;
			case "d":gGrid.move("d");
			break;
			default:
				System.out.println("ERROR");
			}
			gGrid.displayGrid();
			i++;
			System.out.println(i);
			if(i==3) {
				p1.startBattle(opponent);
			}
		}

		/* BOUCLE method MOVE
		while(i <10) {//i <10
			Scanner sc1=new Scanner(System.in);//Player choose where he gonna move
			String mvtChoice=sc1.next();
			switch(mvtChoice) {
			case "z":if(gGrid.move("z")==1) break;	
			else if(gGrid.move("z")==2) {
				p1.startBattle(opponent);
			}
			break;
			case "s":if(gGrid.move("s")==1) break;	
			else if(gGrid.move("s")==2) {
				p1.startBattle(opponent);
			}
			break;
			case "q":if(gGrid.move("q")==1) break;	
			else if(gGrid.move("q")==2) {
				p1.startBattle(opponent);
			}
			break;
			case "d":if(gGrid.move("d")==1) break;	
			else if(gGrid.move("d")==2) {
				p1.startBattle(opponent);
			}
			break;
			default:
				System.out.println("ERROR");
			}
			
			gGrid.displayGrid();
			i++;
		}
	*/
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
