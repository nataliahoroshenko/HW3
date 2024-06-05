package org.example.homework13.blackjack;

import org.example.blackjack.Card;
import org.example.blackjack.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    private Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @Test
    public void testDrawCard() {
        int initialSize = deck.size();
        Card drawnCard = deck.drawCard();

        assertNotNull(drawnCard);
        assertEquals(initialSize - 1, deck.size());
    }

    @Test
    public void testShuffle() {
        List<Card> originalCards = new ArrayList<>(deck.getCards());
        deck.shuffle();
        List<Card> shuffledCards = deck.getCards();
        assertEquals(originalCards.size(), shuffledCards.size(),
                "The size of the deck should remain unchanged");
        assertNotEquals(originalCards, shuffledCards,
                "The deck should be shuffled and not in original order");
        assertTrue(shuffledCards.containsAll(originalCards) && originalCards.containsAll(shuffledCards),
                "The shuffled deck should contain all original cards");
        Card firstCardBeforeShuffle = deck.drawCard();
        deck.shuffle();
        Card firstCardAfterShuffle = deck.drawCard();

        assertNotEquals(firstCardBeforeShuffle, firstCardAfterShuffle);
    }

    @Test
    public void testSize() {
        assertEquals(52, deck.size());
    }
}