// public class javareturn {
//     static int myMethod(int x) {
//         return 5 + x;
//     }

//     public static void main(String[] args) {
//         System.out.println(myMethod(15));
//     }
// }

// Let's try to do it with the string type of return value in methods.

// public class javareturn {
//     static String Naam(String kam) {
//         return "Hi Buddy " + kam; 
//     }

//     public static void main(String [] args) {
        
//         System.out.println(Naam("Suraj Sah"));
//     }
// }


// Let's solve the double game - here is the question
// using a method that returns a value, to show the double of the numbers 1 through 5 (using a for loop):

public class javareturn {
    static int doublegame(int num) {
        return num * 2;
    }

    static void main(String[] args) {
        for (int i =1; i<11; i++) {
            System.out.println("Double of " + i + " is " + doublegame(i));
        }
    }
}