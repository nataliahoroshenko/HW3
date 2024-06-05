package org.example.homework13.blackjack;

import org.example.blackjack.BlackJackHand;
import org.example.blackjack.Card;
import org.example.blackjack.Rank;
import org.example.blackjack.Suit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackHandTest {

    private BlackJackHand hand;

    @BeforeEach
    void setUp() {
        hand = new BlackJackHand();
    }

    @Test
    void testAddCard() {
        Card card = new Card(Suit.CLUBS, Rank.ACE);
        hand.addCard(card);
        assertEquals(1, hand.getCards().size());
        assertTrue(hand.getCards().contains(card));
    }

    @Test
    void testGetValue() {
        Card card1 = new Card(Suit.HEARTS, Rank.TEN);
        Card card2 = new Card(Suit.DIAMONDS, Rank.ACE);
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(21, hand.getValue());
    }

    @Test
    void testIsBusted() {
        Card card1 = new Card(Suit.SPADES, Rank.KING);
        Card card2 = new Card(Suit.CLUBS, Rank.QUEEN);
        Card card3 = new Card(Suit.HEARTS, Rank.JACK);
        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card3);
        assertTrue(hand.isBusted());
    }

    @Test
    void testIsBlackJack() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        Card card2 = new Card(Suit.CLUBS, Rank.KING);
        hand.addCard(card1);
        hand.addCard(card2);
        assertTrue(hand.isBlackJack());
    }
}