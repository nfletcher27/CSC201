import java.util.Scanner;
public class TicTacToeGame {

	public static void main(String[] args) {
		
		// Horstmann Chapter 6, Project P6.25
		// This is a game of tic-tac-toe which takes advantage of arrays, methods, and some special conditions to make a nice simple game.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("The game will now begin, player one is x's and player two is o's");
		
		// Creates our board for us
		char[][] game = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				game[i][j] = '-';
			}
		}
		
		boolean gameOver = false;
		boolean playerOne = true;
		// Our boolean variables we can use later for knowing who's turn it is and if the game can finish
		
		// All our main code will be inside this loop so we can keep doing turns until a winner is decided
		while (!gameOver) {
		
			createGame(game);
			// Creates our tic-tac-toe board and fills it with blank spaces (dashes) for aesthetic purposes
		
		
			char playerIcon = ' ';
			if(playerOne) {
				playerIcon = 'x';
			} else {
				playerIcon = 'o';
			}
			// Discern who's turn it currently is
		
			if (playerOne) {
				System.out.println("Player one's turn!");
			} else {
				System.out.println("Player two's turn!");
			}
			// Let the players know who is up
		
		
			int row = 0;
			int column = 0;
			while (true) {
				System.out.println("Pick a row! (0, 1, 2)");
				row = scan.nextInt();
				System.out.println("Pick a column! (0, 1, 2)");
				column = scan.nextInt();
				// Ask the player where they would like to go on their turn
		
		
				if (row > 2 || column > 2 || row < 0 || column < 0) {
					System.out.println("This is not a valid position!");
				} else if (game[row][column] != '-') {
					System.out.println("This position has been taken!");
				} else {
					break;
					// Our special cases to ensure the player makes a valid move
				}
			}
		
			game[row][column] = playerIcon;
			// Draws our board for each turn
			
			if(victory(game) == 'x') {
				System.out.println("Player one is the winner!");
				gameOver = true;
			} else if(victory(game) == 'o') {
				System.out.println("Player two has won!");
				gameOver = true;
			} else {
				if(draw(game)) {
				System.out.println("It's a draw!");
				gameOver = true;
			} else {
				playerOne = !playerOne;
			// All our different cases of victory, or if there is a draw
			}
		}
	}	
	scan.close();
		
	}
	// Our method for printing the tic-tac-toe board each turn
	public static void createGame(char[][] game) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j]);
			}
			System.out.println();
		}
		
	}
	// Our method for determining who the winner is by running through our board numerous times checking for blank spaces in different ways
	public static char victory(char[][] game) {
		for (int i = 0; i < 3; i++) {
			if(game[i][0] == game[i][1] && game[i][1] == game[i][2] && game[i][0] != '-') {
				return game[i][0];
			}
		}
		for (int j = 0; j < 3; j++) {
			if (game[0][j] == game[1][j] && game[1][j] == game[2][j] && game[0][j] != '-') {
				return game[0][j];
			}
		}
		if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[0][0] != '-') {
			return game[0][0];
		}
		if (game[2][0] == game[1][1] && game[1][1] == game[0][2] && game[2][0] != '-') {
			return game[2][0];
		}
		return '-';
		
		
	}
	// Our method to check for a draw by testing for any blank spaces still active
	public static boolean draw(char [][] game) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (game[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
