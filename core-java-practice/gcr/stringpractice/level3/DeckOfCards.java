import java.util.Scanner;

public class DeckOfCards {

    static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6",
                "7","8","9","10",
                "Jack","Queen",
                "King","Ace"
        };

        String[] deck =
                new String[
                        suits.length *
                                ranks.length];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    static void shuffleDeck(
            String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int random =
                    i +
                    (int)(Math.random()
                            * (n - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    static void distributeCards(
            String[] deck,
            int players,
            int cardsPerPlayer) {

        int index = 0;

        for (int i = 0;
             i < players;
             i++) {

            System.out.println(
                    "\nPlayer "
                            + (i + 1));

            for (int j = 0;
                 j < cardsPerPlayer;
                 j++) {

                System.out.println(
                        deck[index++]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck =
                initializeDeck();

        shuffleDeck(deck);

        System.out.print(
                "Number of Players: ");
        int players =
                sc.nextInt();

        System.out.print(
                "Cards Per Player: ");
        int cards =
                sc.nextInt();

        if (players * cards >
                deck.length) {

            System.out.println(
                    "Not enough cards.");
        }
        else {

            distributeCards(
                    deck,
                    players,
                    cards);
        }

        sc.close();
    }
}