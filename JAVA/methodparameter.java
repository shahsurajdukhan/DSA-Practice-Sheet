// public class methodparameter {
//     static void myMethod(String firstname) {
//         System.out.println(firstname + "Sah");

//     }


// public static void main(String[] args) {
//     myMethod("Suraj ");
//     myMethod("Anjana ");
//     myMethod("Balaji ");
// }

// }



// Now we are going to learn about multiple parameters in the same method it's the same with the separated comma values.

// 


// Now we are going to learn about parameters in methods with if...else condition

public class methodparameter {
    static void CheckAge(int age) {
        if (age >= 18) {
            System.out.println("You are an Adult! Hehe");
        }
        else {
            System.out.println("You are a Minor Kid! Go Study:)");
        }
    }

    public static void main(String[] args) {
        CheckAge(52);
        CheckAge(18);
        CheckAge(12);
    }
}