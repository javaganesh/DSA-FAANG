package com.dsa.designpaatern.Enum;

public class Card {
    private Rank rank;
    private String suit;

    public Card(Rank rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }




    public static void main(String[] args) {
        Card card=new Card(Rank.DIAMOND,"King");
        Card card2=new Card(Rank.CLUBS,"Queen");
        Card card3=new Card(Rank.HEART,"Jocker");
        Card card4=new Card(Rank.SPADES,"King");
        System.out.println(card);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);

    }

}
