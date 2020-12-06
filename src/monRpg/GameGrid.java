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

		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				grid[i][j] = emptyCase;
			}
		}
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

	/*
	 * refaire tout en une seul fonction deplacer if up i-1, down i+1 left j-1 right
	 * j+1
	 */
	public int move(String m) {
		char tempPos;
		// navigate in the array to find our character
		for (int i = 0; i < nbLines; i++) {
			for (int j = 0; j < nbColumns; j++) {
				if (grid[i][j] == '@') {// We search for our character '@'
					switch (m) {
					case "z":
						if (i - 1 >= 0 && grid[i - 1][j] == emptyCase) {// Test if the new position is not out of bounds
							System.out.println("Pas de monstre");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i - 1][j] = tempPos;// set the character position to the upper line i-1(line-1)
							return 1;
						}
						else if (i - 1 >= 0 && grid[i - 1][j] == 'M') {// Test if the new position is not out of bounds
							System.out.println("Monstre");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i - 1][j] = tempPos;// set the character position to the upper line i-1(line-1)
							return 2;
						}

						break;
					case "s":
						if (i + 1 < nbLines && grid[i + 1][j] == emptyCase) {// i cannot increment above nbLines and go																				// Out of bounds
							System.out.println("Pas de monstre");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace the character with an empty case
							grid[i + 1][j] = tempPos;// set the character position to the lower line i+1(line+1)
							return 1;// 1 means successful movement
						}
						else if (i + 1 < nbLines && grid[i + 1][j] == 'M') {// i cannot increment above nbLines and go																				// Out of bounds
							System.out.println("monstre!!");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace the character with an empty case
							grid[i + 1][j] = tempPos;// set the character position to the lower line i+1(line+1)
							return 2;// 2 means battle
						}
						break;
					case "q":
						if (j - 1 >= 0 && grid[i][j - 1] == emptyCase) {
							System.out.println("Pas de monstre");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j - 1] = tempPos;// set the character's position to the next column i-1(column-1)
							return 1;
						}
						if (j - 1 >= 0 && grid[i][j - 1] == 'M') {
							System.out.println("monstre!!");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j - 1] = tempPos;// set the character's position to the next column i-1(column-1)
							return 2;
						}
						break;
					case "d":
						if (j + 1 < nbColumns && grid[i][j + 1] == emptyCase) {// j cannot increment above nbColumns and go Out of bounds
							System.out.println("Pas de monstre");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j + 1] = tempPos;// set the character's position to the next column i+1(column+1)
							return 1;// STOPS the loop to avoid the infinite loop
						}
						if (j + 1 < nbColumns && grid[i][j + 1] == emptyCase) {// j cannot increment above nbColumns and go Out of bounds
							System.out.println("monstre!!");
							tempPos = grid[i][j];// Copy the character's position
							grid[i][j] = emptyCase;// Replace with an empty case
							grid[i][j + 1] = tempPos;// set the character's position to the next column i+1(column+1)
							return 2;// STOPS the loop to avoid the infinite loop
						}
						break;
					default:
						System.out.println("ERROR");
					}

				}
			}
		}
		return 0;

	}
}
