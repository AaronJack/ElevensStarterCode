package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String args[]){
        Card test1 = new Card("Diamond","Nine",9);
        Card test2 = new Card("Clubs","Ace",1);
        Card test3 = new Card("Spades","Queen",12);
        System.out.println(test1.toString());
    }
}