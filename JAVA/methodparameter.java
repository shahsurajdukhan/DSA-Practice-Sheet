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

import java.util.jar.Attributes.Name;

public class methodparameter {
    static void NameParameter(String firstname, int age) {
        System.out.println("Hi " + firstname + "! You are " + age + " Years old! :)");

    }

    public static void main(String[] args) {
        NameParameter("Suraj", 12);
        NameParameter("Dukhan", 54);
        NameParameter("Bhagmati", 47);

    }
}