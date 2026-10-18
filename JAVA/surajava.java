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

import java.util.Scanner;

public class surajava {
    static void main() {
        int input;
        System.out.print("Enter your number: ");
        Scanner dock = new Scanner(System.in);
        input = dock.nextInt();
        if (input % 2 == 0) {
            System.out.println("Given Number is Even in Nature");
        } else {
            System.out.println("Given number is Odd in Nature");
        }

    }


}