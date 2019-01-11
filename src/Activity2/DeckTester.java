package Activity2;

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Spades"};
        String[] ranks = {"A", "B", "C"};
        int[] values = {1,2,3};
        Deck testDeck = new Deck(ranks,suits,values);
        testDeck.showCards();
        testDeck.shuffle();
        testDeck.showCards();
        testDeck.deal();
        System.out.println(testDeck.size());
    }
}

