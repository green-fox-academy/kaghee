import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PokerTest {

    Poker pkr;
    Deck deck;

    @Before
    public void setUp() throws Exception {
        pkr = new Poker();
        deck = new Deck();
        deck.generate();
    }


    @Test
    public void generate() throws Exception {
        assertEquals(deck.deck.get(0).color, "D");
        assertEquals(deck.deck.get(0).value, "A");
    }

    @Test
    public void cardTest() throws Exception {
        assertEquals("DA", deck.deck.get(0).toString());
        assertEquals("HK", deck.deck.get(49).toString());
    }

    @Test
    public void cardTest1() throws Exception {
        assertEquals("HK", deck.deck.get(49).toString());
    }

//    @Test
//    public void dealTest() throws Exception {
//        assertEquals("[DA, CA, D2, C2, D3][HA, SA, H2, S2, H3]", deck.deal());
//    }
//
//    @Test
//    public void compareTest() throws Exception {
//        assertEquals("White wins.", pkr.compare());
//    }

    @Test
    public void compareTest1() throws Exception {
        pkr.black.add(new Card("7", "S"));
        pkr.black.add(new Card("10", "D"));
        pkr.black.add(new Card("4", "C"));
        pkr.black.add(new Card("K", "D"));
        pkr.black.add(new Card("5", "D"));

        pkr.white.add(new Card("2", "S"));
        pkr.white.add(new Card("9", "C"));
        pkr.white.add(new Card("3", "C"));
        pkr.white.add(new Card("9", "H"));
        pkr.white.add(new Card("J", "D"));

//        assertEquals("Black wins.", pkr.compare());
    }






}