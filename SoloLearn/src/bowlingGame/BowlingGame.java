package bowlingGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bowling {
	HashMap<String, Integer> players;
	Bowling() {
		players = new HashMap<String, Integer>();
	}
	public void addPlayer (String name, int p) {
		players.put(name, p);
	}
	
	public void getWinner() {
		int result = -1;
		int valueOne = 0; 
		int valueTwo = 0;
		int valueThree = 0;
		int loopVar = 0;
		String nameOne = "";
		String nameTwo = "";
		String nameThree = "";
		
		for(String playerId : players.keySet()) {
			
			System.out.print("Player Name: " + playerId);
			System.out.println(" Value: " + players.get(playerId));
			
			switch (loopVar) {
				case 0:
					valueOne = players.get(playerId);
					nameOne = playerId;
					break;
				case 1:
					valueTwo = players.get(playerId);
					nameTwo = playerId;
					break;
				case 2:
					valueThree = players.get(playerId);
					nameThree = playerId;
					if (valueOne < valueTwo) { 
						if (valueTwo < valueThree) { result = 2;
						} else { result = 1;}
					} else if (valueOne < valueThree) {result = 2;
					} else {result = 0;} 
					break;
			}
			
			loopVar++;
		}
		
		
		switch (result) {
			case 0:
				System.out.println(nameOne);
				break;
			case 1:
				System.out.println(nameTwo);
				break;
			case 2:
				System.out.println(nameThree);
				break;
		}
	}
}

public class BowlingGame {
	
	public static void main(String[] args) {
		
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		game.getWinner();
	}

}
