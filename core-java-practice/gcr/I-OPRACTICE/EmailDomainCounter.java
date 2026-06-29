import java.io.*;

public class EmailDomainCounter {

    public static void main(String[] args) {

        int gmail = 0;
        int yahoo = 0;
        int outlook = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                String domain = email.substring(email.indexOf("@") + 1);

                if (domain.equalsIgnoreCase("gmail.com")) {
                    gmail++;
                } else if (domain.equalsIgnoreCase("yahoo.com")) {
                    yahoo++;
                } else if (domain.equalsIgnoreCase("outlook.com")) {
                    outlook++;
                }
            }

            br.close();

            System.out.println("Gmail Users : " + gmail);
            System.out.println("Yahoo Users : " + yahoo);
            System.out.println("Outlook Users : " + outlook);

        } catch (IOException e) {

            System.out.println(e);

        }

    }
}