//public class surajava {
//    static void main() {
//       int number = 41;
//       String size;
//
//       switch (number) {
//           case 20:
//               size = "Small";
//               break;
//
//           case 28 :
//                   size = "Medium";
//                   break;
//
//
//           case 40 :
//                       size = "Large";
//                       break;
//
//           default:
//               size = "Unknown";
//               break;
//       }
//
//        System.out.println("Size is " + size );
//
//
//    }
//}


// switch case statement without break;

//public class surajava {
//    static void main() {
//        int def = 30;
//        switch (def) {
//            case 30 :
//                System.out.println("case 30 running");
//
//            case 40 :
//                System.out.println("case 40 running");
//
//            case 50 :
//                System.out.println("case 50 running");
//
//            default:
//                System.out.println("default running");
//
//        }
//    }
//}


// Take a user input which is an integer. if the input value is even or odd.

//import java.util.Scanner;
//
//public class surajava {
//    static void main() {
//        int input;
//        System.out.print("Enter your number: ");
//        Scanner dock = new Scanner(System.in);
//        input = dock.nextInt();
//        if (input % 2 == 0) {
//            System.out.println("Given Number is Even in Nature");
//        } else {
//            System.out.println("Given number is Odd in Nature");
//        }
//
//    }
//
//
//}


// given the 3 angles of a triangle.
// you need to check whether
// a valid triangle can be formed from those 3 angles.

import java.util.Scanner;
public class surajava {
    static void main() {

        int angle1,angle2,angle3;
        Scanner dock = new Scanner(System.in);
        System.out.println("Enter the value of 1st angle");
        angle1 = dock.nextInt();
        System.out.println("Enter the value of 2nd angle");
        angle2 = dock.nextInt();
        System.out.println("Enter the value of 3rd angle");
        angle3 = dock.nextInt();

        int sum = angle1 + angle2 + angle3;

        // don't forget to handle the edge case where every angle should be greater than zero.

        if (sum == 180 && angle1!= 0 && angle2 !=0 && angle3 !=0 ) {
            System.out.println("Valid triangle can be formed from these 3 angles.");
        } else {
            System.out.println("Valid triangle is not valid since sum of all the angles is not 180 or anyone angle is ZERO.");
        }
    }
}