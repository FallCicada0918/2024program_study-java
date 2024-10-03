/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 15:19:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-02 20:06:02
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerGame {
    // 定义花色和数字枚举
    enum Suit {
        HEARTS("红桃"), DIAMONDS("方片"), CLUBS("梅花"), SPADES("黑桃");

        private final String symbol;

        Suit(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    enum Rank {
        TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
        JACK("J"), QUEEN("Q"), KING("K"), ACE("A"), SMALL_JOKER("小"), BIG_JOKER("大");

        private final String symbol;

        Rank(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    // 牌类
    static class Card {
        Suit suit;
        Rank rank;

        Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            if (rank == Rank.SMALL_JOKER || rank == Rank.BIG_JOKER) {
                return rank.getSymbol();
            }
            return rank.getSymbol() + " " + suit.getSymbol();
        }
    }

    // 生成一副完整的牌
    public static List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                if (rank != Rank.SMALL_JOKER && rank != Rank.BIG_JOKER) {
                    deck.add(new Card(suit, rank));
                }
            }
        }
        // 添加大小王
        deck.add(new Card(null, Rank.SMALL_JOKER));
        deck.add(new Card(null, Rank.BIG_JOKER));
        return deck;
    }

    // 洗牌
    public static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    // 发牌方法，将一副牌均匀分配给三个玩家各17张牌和底牌3张
    public static void dealCards(List<Card> deck, List<Card> player1, List<Card> player2, List<Card> player3, List<Card> bottom) {
        // 用于循环发牌的索引变量
        int index = 0;

        // 每个玩家发17张牌
        while (player1.size() < 17 && player2.size() < 17 && player3.size() < 17 && !deck.isEmpty()) {
            if (index % 3 == 0) {
                player1.add(deck.remove(0));
            } else if (index % 3 == 1) {
                player2.add(deck.remove(0));
            } else {
                player3.add(deck.remove(0));
            }
            index++;
        }

        // 给底牌发3张牌
        while (bottom.size() < 3 && !deck.isEmpty()) {
            bottom.add(deck.remove(0));
        }
    }

    // 记牌器
    public static void printCardCounter(List<Card> player1, List<Card> player2, List<Card> player3, List<Card> bottom) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Player", "Total", "Big Joker", "Small Joker", "Hearts", "Diamonds", "Clubs", "Spades");
        printPlayerCardCounter("Player1", player1);
        printPlayerCardCounter("Player2", player2);
        printPlayerCardCounter("Player3", player3);
        printPlayerCardCounter("Bottom", bottom);
    }

    private static void printPlayerCardCounter(String player, List<Card> cards) {
        long total = cards.size();
        long bigJokerCount = cards.stream().filter(card -> card.rank == Rank.BIG_JOKER).count();
        long smallJokerCount = cards.stream().filter(card -> card.rank == Rank.SMALL_JOKER).count();
        long heartsCount = cards.stream().filter(card -> card.suit == Suit.HEARTS).count();
        long diamondsCount = cards.stream().filter(card -> card.suit == Suit.DIAMONDS).count();
        long clubsCount = cards.stream().filter(card -> card.suit == Suit.CLUBS).count();
        long spadesCount = cards.stream().filter(card -> card.suit == Suit.SPADES).count();
        System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10d %-10d %-10d%n", player, total, bigJokerCount, smallJokerCount, heartsCount, diamondsCount, clubsCount, spadesCount);
    }

    public static void main(String[] args) {
        List<Card> deck = generateDeck();
        shuffleDeck(deck);

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> bottom = new ArrayList<>();

        dealCards(deck, player1, player2, player3, bottom);

        System.out.println("Player1: [" + player1.stream().map(Card::toString).collect(Collectors.joining("], [")) + "]");
        System.out.println("Player2: [" + player2.stream().map(Card::toString).collect(Collectors.joining("], [")) + "]");
        System.out.println("Player3: [" + player3.stream().map(Card::toString).collect(Collectors.joining("], [")) + "]");
        System.out.println("Bottom: [" + bottom.stream().map(Card::toString).collect(Collectors.joining("], [")) + "]");

        printCardCounter(player1, player2, player3, bottom);
    }
}
