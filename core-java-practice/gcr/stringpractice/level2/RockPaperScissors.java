import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice =
                (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";

        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String winner(
            String user,
            String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock")
                && computer.equals("Scissors"))
            || (user.equals("Paper")
                && computer.equals("Rock"))
            || (user.equals("Scissors")
                && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        String[] options =
                {"Rock","Paper","Scissors"};

        for (int i = 1; i <= games; i++) {

            String user =
                    options[(int)(Math.random()*3)];

            String computer =
                    computerChoice();

            String result =
                    winner(user, computer);

            System.out.println(
                    i + ". "
                    + user + " vs "
                    + computer + " -> "
                    + result);

            if (result.equals("User"))
                userWins++;

            if (result.equals("Computer"))
                computerWins++;
        }

        System.out.println("\nUser Wins = "
                + userWins);

        System.out.println(
                "Computer Wins = "
                        + computerWins);

        double userPercent =
                (userWins * 100.0) / games;

        double computerPercent =
                (computerWins * 100.0) / games;

        System.out.printf(
                "User Win %% = %.2f%n",
                userPercent);

        System.out.printf(
                "Computer Win %% = %.2f%n",
                computerPercent);

        sc.close();
    }
}