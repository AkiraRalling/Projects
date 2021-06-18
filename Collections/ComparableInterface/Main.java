package JavaHard.Collections.ComparableInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ClassCards> deckOfCards = new ArrayList<>();

        for (ClassCards.Card cards: ClassCards.Card.values()) {
            for (ClassCards.Suit suits : ClassCards.Suit.values()) {
                deckOfCards.add(new ClassCards(cards, suits));
            }
        }
        System.out.println("Original desk of cards");
        for(int i = 0; i < deckOfCards.size();i++) {
            System.out.printf("%-20s %s",deckOfCards.get(i), (i+1)%4 == 0 ? "\n":" ");
        }

        Collections.shuffle(deckOfCards);
        System.out.println("\nShuffle deck of cards");
        for(int i = 0; i < deckOfCards.size();i++) {
            System.out.printf("%-20s %s",deckOfCards.get(i), (i+1)%4 == 0 ? "\n":" ");
        }

        Collections.sort(deckOfCards);
        System.out.println("\nSorted deck of cards");
        for(int i = 0; i < deckOfCards.size();i++) {
            System.out.printf("%-20s %s",deckOfCards.get(i), (i+1)%4 == 0 ? "\n":" ");
        }
    }

    public static class ClassCards implements Comparable<ClassCards> {

        private enum Card {Ace,Two,Four,Nine,Ten,Three,Five,Six,Seven,Eight}
        private enum Suit {Diamonds,Clubs,Hearts,Kresti}



        private Card card;
        private Suit suit;

        public ClassCards(Card card, Suit suit) {
            this.card = card;
            this.suit = suit;
        }

        public Card getCard() {
            return card;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public int compareTo(ClassCards o) {
            Card[] values = Card.values();
            List<Card> cards = Arrays.asList(values);

            if (cards.indexOf(this.card) < cards.indexOf(o.getCard())) {
                return -1;
            } else if (cards.indexOf(this.card) > cards.indexOf(o.getCard())) {
                return +1;
            } else if (cards.indexOf(this.card) == cards.indexOf(o.getCard())) {
                return String.valueOf(suit).compareTo(String.valueOf(o.getSuit()));
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return card + " of " + suit;
        }
    }
}
