/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 15:19:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 14:32:32
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//代码有大bug

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES, JOKER
}

enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, SMALL_JOKER, BIG_JOKER
}

class Card {
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        if (suit == Suit.JOKER) {
            return rank == Rank.BIG_JOKER ? "Big Joker" : "Small Joker";
        }
        return rank + " of " + suit;
    }
}

public class PokerGame {

    private static List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            if (suit == Suit.JOKER) continue;
            for (Rank rank : Rank.values()) {
                if (rank == Rank.SMALL_JOKER || rank == Rank.BIG_JOKER) continue;
                deck.add(new Card(suit, rank));
            }
        }
        deck.add(new Card(Suit.JOKER, Rank.SMALL_JOKER));
        deck.add(new Card(Suit.JOKER, Rank.BIG_JOKER));
        return deck;
    }

    private static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    private static void dealCards(List<Card> deck, List<Card> player1, List<Card> player2, List<Card> player3, List<Card> bottom) {
        for (int i = 0; i < deck.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(deck.get(i));
            } else if (i % 3 == 1) {
                player2.add(deck.get(i));
            } else {
                player3.add(deck.get(i));
            }
        }
        bottom.add(deck.get(deck.size() - 3));
        bottom.add(deck.get(deck.size() - 2));
        bottom.add(deck.get(deck.size() - 1));
    }

    private static void sortCards(List<Card> cards) {
        cards.sort(Comparator.comparing((Card card) -> card.rank.ordinal()).thenComparing(card -> card.suit.ordinal()));
    }

    private static void printPlayerCards(String player, List<Card> cards) {
        System.out.println(player + "'s cards:");
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Card> deck = generateDeck();
        shuffleDeck(deck);

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> bottom = new ArrayList<>();

        dealCards(deck, player1, player2, player3, bottom);

        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        sortCards(bottom);

        printPlayerCards("Player 1", player1);
        printPlayerCards("Player 2", player2);
        printPlayerCards("Player 3", player3);
        printPlayerCards("Bottom", bottom);
    }
}