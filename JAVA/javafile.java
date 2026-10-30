import java.io.File;

public class javafile {
    static void main() {
        System.out.println("hi");
        File file = new File ("notes.text");

        System.out.println(file.getPath());
        System.out.println(file.exists());
    }
}
