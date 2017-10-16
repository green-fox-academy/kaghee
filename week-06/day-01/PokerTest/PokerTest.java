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
    public void hello() throws Exception {
        assertEquals("Hello", pkr.poker());
    }

    @Test
    public void generate() throws Exception {
        assertEquals(deck.deck.get(0).color, "D");
        assertEquals(deck.deck.get(0).value, 1);
    }

    @Test
    public void cardTest() throws Exception {
        assertEquals("D1", deck.deck.get(0).toString());
        assertEquals("H13", deck.deck.get(49).toString());
    }

    @Test
    public void cardTest1() throws Exception {
        assertEquals("HK", deck.deck.get(49).toString());
    }

    @Test
    public void dealTest() throws Exception {
        assertEquals("[DA, CA, D2, C2, D3][HA, SA, H2, S2, H3]", deck.deal());
    }




}