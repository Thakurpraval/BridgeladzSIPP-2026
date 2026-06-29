import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            // true = append mode
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int marks1 = Integer.parseInt(data[1]);
                int marks2 = Integer.parseInt(data[2]);
                int marks3 = Integer.parseInt(data[3]);

                double average = (marks1 + marks2 + marks3) / 3.0;

                bw.write("Student Name : " + name);
                bw.newLine();
                bw.write("Average Marks : " + average);
                bw.newLine();
                bw.write("----------------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report Generated Successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("students.txt file not found.");

        } catch (IOException e) {

            System.out.println("Error : " + e.getMessage());

        }

    }
}