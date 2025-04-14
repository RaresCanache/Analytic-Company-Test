package Objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String[]> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("student_info.csv")))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] nameAndId = scanner.nextLine().split(",");
                lines.add(nameAndId);
            }
        }

        lines.sort(Comparator.comparing(student -> student[1]));

        for (String[] student : lines) {
            System.out.println("ID: " + student[0] + " Name: " + student[1]);
        }
    }
}
