
package ca.sheridancollege.week2.softwarefundamentals;

//Assignment 1 by 
//Name: Aleksandr Arsentev
//Student number: 991636298
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("Diamonds");
        Card tenClubs = new Card("Clubs", 10);
        System.out.println(tenClubs.getValue() + " " + tenClubs.getSuit());
        Card twoDiamonds = new Card("Diamonds", 2);
        System.out.println(twoDiamonds.getValue() + " " + twoDiamonds.getSuit());
    }
}
