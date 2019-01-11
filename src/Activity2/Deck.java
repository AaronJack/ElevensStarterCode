package Activity2;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.swap;

public class Deck {

    private List<Card> cards = new ArrayList<Card>();
    private List<Card> dealt = new ArrayList<>();

    private int amount = cards.size();

    public Deck(String[] ranks, String[] suits, int[] values) {
        for(int i = 0; i < ranks.length; i++){
            for(int j = 0; j < suits.length; j++){
                cards.add(new Card(ranks[i],suits[j],values[i]));
            }
        }
    }

    public boolean isEmpty() {
        if(this.amount == 0){
            return true;
        }
        return false;
    }

    public int size() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        int rand = (int) Math.random() * (amount + 1);
        dealt.add(cards.get(rand));
        return cards.get(rand);
    }

    public void showCards(){
        for(int i = 0; i < cards.size(); i++){
            System.out.println(cards.get(i).rank() + " : " + cards.get(i).suit());
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        String rtn = "size = " + amount + "\nUndealt cards: \n";

        for (int k = amount - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((amount - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= amount; k--) {
            rtn = rtn + cards.get(k);
            if (k != amount) {
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

