package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private List<Card> cards = new ArrayList<Card>();
    private List<Card> cards = new ArrayList<~>();

    private int size = cards.size();

    public Deck(String[] ranks, String[] suits, int[] values) {
        for(int i = 0; i < ranks.length; i++){
            for(int j = 0; j < suits.length; i++){
                cards.add(new Card(ranks[i],suits[j],values[i]));
            }
        }
    }

    public boolean isEmpty() {
		if(this.size == 0){
		    return true;
        }
        return false;
    }

    public int size() {
		return this.size;
    }

    public void shuffle() {
        List<Card> list = new ArrayList<>();
        for(Card i : cards){
            list.add(i);
        }

        Collections.shuffle(cards);

        for(int i = 0; i < list.size(); i++){
            cards.set(i, list.get(i));
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
		Random r = new Random();
        r.nextInt((size - 0) + 1);
        return cards.get
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}

