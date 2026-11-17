// import java.util.Scanner;

// public class kunaldsa {
//     public static void main(String[] args) {
//         // Q. Take input of two integers and give the sum
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number :");
//         int n1 = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter 2nd number :");
//         int n2 = sc.nextInt();

//         int sum = n1 + n2;

//         System.out.println("Sum of these two numbers are : " + sum);
        
//     }
// }

import java.util.Scanner;

public class kunaldsa {

    public static void main(String[] args) {
        for (int i = 0; i<3; i++) {
        sum();
        }
        
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 1st number :");
         int n1 = sc.nextInt();
         sc.nextLine();
        System.out.println("Enter 2nd number :");
         int n2 = sc.nextInt();
         int sum = n1 + n2;
         System.out.println("Sum of these two numbers are : " + sum);
    }

}