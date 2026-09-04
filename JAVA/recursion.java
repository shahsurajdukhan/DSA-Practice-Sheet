//public class recursion {
    // Recursion is the technique of making a function call itself.
    // this technique provides a way to break complicated problems into simpler problems which are easier to solve.

    // recursion may be bit difficult to understand but the best way to figure out how it works is to experiment with it.

    // public class recursion {
    //     public static int sum(int k) {
    //         if(k > 0) {
    //             return k + sum(k -1);
    //         } 
    //         else {
    //             return 0;
    //         }
    //     }

    //     public static void main(String[] args) {
    //         int result = sum(10);
    //         System.out.println(result);
    //     }
    // }

// let's do one infinite recursion problem
// public class recursion {
//     public static int sum(int start, int end) {
//         if (end > start) {
//         return end + sum(start, end -1);
//         }
//         else {
//             return end;
//         }
//     }

//     public static void main(String[] args) {
//         int result = sum(5,10);
//         System.out.println(result);
//     }
// }

// let's now solve countdown with recursion

public class recursion {
    static void countdown(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            countdown(n - 1);
        } 
    }

    public static void main(String[] args) {
        countdown(10);
    }
}