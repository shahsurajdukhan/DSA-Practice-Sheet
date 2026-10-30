import java.io.FileWriter;
import java.io.IOException;

// public class FileWriterr {
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("student.txt");

//             writer.write("Name: Suraj\n");
//             writer.write("Age: 23\n");
//             writer.write("course: Java\n");
//             writer.write("Song : Proper patola nakhra e swag");

//             writer.close();
//             System.out.println("Data Written Successfully!");
//         } catch (IOException e) {
//             System.out.println("Something went wrong.");
//         }
//     }
// }

// Now updating the file
// public class FileWriterr {

//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("student.txt", true);
//             writer.write("\nCity : Ahmedabad");
//             writer.write("\nFav : Main tera e blood goriye tu backbone jatt di");
//             writer.close();
//             System.out.println("Data Appended successfully!");
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// Reading data from a file
// import java.io.FileReader;
// import java.io.EOFException;

// public class FileWriterr {
//     public static void main(String[] args) {
//         try {
//             FileReader reader = new FileReader("student.txt");

//             int character;

//             while ((character = reader.read()) != -1) {
//                 System.out.print((char) character);
//             }

//             reader.close();
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// Reading a file using scanner class

import java.io.File;
import java.util.Scanner;

public class FileWriterr {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}