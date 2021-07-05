package deckofcards;

public class DeckOfCards {
		// Array of String for suit 
		String[] suit = {"Clubs", "Hearts", "Diamonds", "Spade"};
		//Array of String for rank 
		String[] rank = { "Ace", "Kings", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		//2d array of String for cobination of suit and rank
		String[][] cardCombo = new String[4][13];
	
		/*Creating all possible combination for the 52 cards
		 * i ->suit 
		 * j->rank
		 */
		public  void combineDeck() {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 13; j++) {
					cardCombo[i][j] = suit[i] + rank[j];
					System.out.println(cardCombo[i][j]);
				}			
			}
		}

}
