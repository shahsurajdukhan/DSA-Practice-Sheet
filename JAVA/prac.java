import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        System.out.println("How are you");

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = sc.nextInt();
        sc.nextLine();  // consumes the leftover newline character
        System.out.println("Your School Name?");
        String school = sc.nextLine();

       
        System.out.println("Thanks for submitting the form");
         sc.close();

        System.out.println("This is the provided information ");
        System.out.println(age);
        System.out.println(school);
    }
}