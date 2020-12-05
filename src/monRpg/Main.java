package monRpg;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameGrid gGrid = new GameGrid(22,40);
		Entity p1= new Entity("Java",500,25,15);
		gGrid.posCharacter(2, 2, '@');
		gGrid.posCharacter(1, 5 ,'M');
		System.out.println(p1.toString());
		gGrid.moveDown();
		gGrid.moveRight();
		gGrid.moveLeft();
		gGrid.moveUp();
		gGrid.displayGrid();
		
		
		
	}

}
