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
		gGrid.posCharacter(3, 4 ,'S');
		gGrid.displayGrid();
		System.out.println("    z"+"\n");
		System.out.println("q       d"+"\n");
		System.out.println("    s"+"\n");
		int i = 0;
		int rand=(int)(Math.random() * 5)+1;//Random number between 1 and 5;
		System.out.println(rand);
		while( i <14) {//Limited to 14 moves for testing
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
				break;
			}
			gGrid.displayGrid();//display the Map
			i++;
			if(i==rand) {
				p1.startBattle(opponent);
			}
		}
		
		
	}

}
