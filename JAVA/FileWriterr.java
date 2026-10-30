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
public class FileWriterr {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("\nCity : Ahmedabad");
            writer.write("\nFav : Main tera e blood goriye tu backbone jatt di");
            writer.close();
            System.out.println("Data Appended successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}