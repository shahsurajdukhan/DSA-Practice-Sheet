// import java.util.Scanner;
// public class looping {
    
//     public static void main (String []args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age here: ");
//         int age = sc.nextInt();
//         if(age>=18) {
//             System.out.println("Oh! You are an adult :) ");
//         }
//         else {
//             System.out.println("OOPS! You are a Minor! j... Minorrrr! ");
//         }
//         sc.close();
//     }
// }


public class looping {
    public static void main(String []args) {
        int[] arr = {2,3,4,5,9};
        for (int x : arr) {
            System.out.println("The Number is " + x);
        }
    }
}