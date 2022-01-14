import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
  // Program that allows a player to play against a CPU which randomly places pieces
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	static boolean gameOver = true; // Was originally going to do something with this, became useless but kept it as a variable to play the game anyway
	
	public static void main(String[] args) throws InterruptedException {
		
		char[][] board = {{' ', '|', ' ', '|', ' '}, // drawing our board
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		System.out.println("Welcome to tic-tac-toe, your opponent is a CPU");
		printBoard(board);
		
		
		while(gameOver) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Your turn, enter a position (1-9)");
			
			int playerPos = scan.nextInt();
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
				System.out.println("Place taken, try again");
				playerPos = scan.nextInt();
			}
			placePiece(board, playerPos, "player");
			System.out.println(checkWin());
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(board, cpuPos, "cpu");
			printBoard(board);
			System.out.println("CPU picked position " + cpuPos);
			
			System.out.println(checkWin());
		}
	}
	
	public static void printBoard(char[][] board) { // Just draws our board so we don't have to recreate each time
		for(char[] row : board) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placePiece (char[][] board, int pos, String user) {
		
    // Placing a piece wherever the player inputs
		char symbol = ' ';
		
		if(user.equals("player")) {
			symbol = 'X';
			playerPositions.add(pos);
		} else if(user.equals("cpu")) {
			symbol = 'O';
			cpuPositions.add(pos);
		}
		
		switch(pos) {
			case 1:
				board[0][0] = symbol;
				break;
			case 2:
				board[0][2] = symbol;
				break;
			case 3:
				board[0][4] = symbol;
				break;
			case 4:
				board[2][0] = symbol;
				break;
			case 5:
				board[2][2] = symbol;
				break;
			case 6:
				board[2][4] = symbol;
				break;
			case 7:
				board[4][0] = symbol;
				break;
			case 8:
				board[4][2] = symbol;
				break;
			case 9:
				board[4][4] = symbol;
				break;
			default:
				break;
		}
	}
	
	public static String checkWin() {  // Creates lists for all possible win variations (all vertical, all horizontal, or the two diagonals)
                                     // Add all those lists to an ArrayList of lists, test our global ArrayLists to see if any fit. If they do, someone has won
		
		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> bottomRow = Arrays.asList(7, 8, 9);
		List<Integer> leftColumn = Arrays.asList(1, 4, 7);
		List<Integer> midColumn = Arrays.asList(2, 5, 8);
		List<Integer> rightColumn = Arrays.asList(3, 6, 9);
		List<Integer> diag1 = Arrays.asList(1, 5, 9);
		List<Integer> diag2 = Arrays.asList(7, 5, 3);
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(bottomRow);
		winning.add(leftColumn);
		winning.add(midColumn);
		winning.add(rightColumn);
		winning.add(diag1);
		winning.add(diag2);
		
		for(List l : winning) {
			if(playerPositions.containsAll(l)) {
				return "Player wins!";
			} else if(cpuPositions.contains(l)) {
				return "CPU wins!";
			} else if(playerPositions.size() + cpuPositions.size() == 9) {
				return "Tie!";
			}
			} return "";
	} 
}
