import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<String> personData = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String fileName;

        //Prompt user for input
        System.out.println("Enter the data for each person, one line at a time:");
        String input = sc.nextLine();
        while (!input.equals("")) {
            personData.add(input);
            input = sc.nextLine();
        }

        //Prompt user for file name
        System.out.println("Enter a file name to save the data:");
        fileName = sc.nextLine();

        //Write data to file
        try {
            FileWriter fw = new FileWriter(new File(fileName));
            for (String line : personData) {
                fw.write(line + "\n");
            }
            fw.close();
            System.out.println("Data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file " + fileName);
        }
    }
}
