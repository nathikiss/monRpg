package monRpg;

public class GameGrid {
	private int nbLines;
	private int nbColumns;
	private char[][] grid;

	char emptyCase = '.';

	// Map number of column and lines
	public GameGrid(int nbL, int nbC) {
		this.nbLines = nbL;
		this.nbColumns = nbC;
		this.grid = new char[nbL][nbC];
		// Create a Map with emptyCases
		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				grid[i][j] = emptyCase;
			}
		}
	}

	public char[][] getGrid() {
		return grid;
	}

	// method pour afficher la Map
	public void displayGrid() {
		System.out.println();
		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				System.out.print(" | " + grid[i][j]);
			}

			System.out.println(" | ");
		}
		System.out.println();
	}

	public char caseOccup(int l, int c) {
		return grid[l][c];

	}

	public int detectStore() {
		int detect=0;
		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				if (grid[i][j] == '@') {// We search for our character '@'
					if (grid[i - 1][j] == 'S' || grid[i + 1][j] == 'S' || grid[i][j - 1] == 'S'
							|| grid[i][j + 1] == 'S') // Test if the next case is the store
					{
						detect=1; 
					}
				}
			}
		}
		return detect;
	}

	public void posCharacter(int line, int column, char type) {// determine initial player's position
		line = line - 1;
		column = column - 1;
		if (line < 0 || column < 0 || line > nbLines || column > nbColumns) {
			System.out.println("Erreur");
			return;
		}
		if (grid[line][column] == emptyCase) {
			grid[line][column] = type;
		} else {
			System.out.println("l'espace n'est pas vide");
		}

	}

	public void move(String m) {
		char tempPos;
		// navigate in the array to find our character
		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				if (grid[i][j] == '@') {// We search for our character '@'
					switch (m) {
					case "z":
						if (i - 1 >= 0 && grid[i - 1][j] == emptyCase) {// Test if the new position is not out of bounds
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i - 1][j] = tempPos;// set the character position to the upper line i-1(line-1)
						}
						break;
					case "s":
						if (i + 1 < nbLines && grid[i + 1][j] == emptyCase) {// i cannot increment above nbLines and go
																				// // Out of bounds
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace the character with an empty case
							grid[i + 1][j] = tempPos;// set the character position to the lower line i+1(line+1)
						}
						break;
					case "q":
						if (j - 1 >= 0 && grid[i][j - 1] == emptyCase) {
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j - 1] = tempPos;// set the character's position to the next column i-1(column-1)

						}
						break;
					case "d":
						if (j + 1 < nbColumns && grid[i][j + 1] == emptyCase) {// j cannot increment above nbColumns and
																				// go Out of bounds
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j + 1] = tempPos;// set the character's position to the next column i+1(column+1)
						}
						break;
					default:
						System.out.println("ERROR");
					}

				}
			}
		}
	}
}
