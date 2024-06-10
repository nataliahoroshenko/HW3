package org.example.homework13.blackjack;

import org.example.blackjack.Card;
import org.example.blackjack.Rank;
import org.example.blackjack.Suit;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    public void testToString() {
        Card card = new Card(Suit.HEARTS, Rank.KING);
        String expectedString = "KING of HEARTS";

        assertEquals(expectedString, card.toString());
    }
}