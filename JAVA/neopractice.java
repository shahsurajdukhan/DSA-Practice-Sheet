import java.util.Scanner;

public class neopractice {
    public static void main(String[] args) {
        // String name = "JaVa";

        //     System.out.println(name.toUpperCase());
        //     System.out.println(name.toLowerCase());
        //     System.out.println(name.length());
        //     System.out.println(name.charAt(2));
        // Scanner suraj = new Scanner(System.in);

        // int number = suraj.nextInt();
        // if (number > 0) {
        //     System.out.println("Positive");
        // }
        // else if (number < 0) {
        //     System.out.println("Negative");
        // }
        // else if (number == 0) {
        //     System.out.println ("Zero");
        // }
        
        for (int i=1; i<= 10; i++ ) {
            System.out.println(i);
        }


    }
}


/*
 1. basic syntax i know
 2. variables 
 3. primitive and non primitive data types
    in primitive data type we have built in data types and can contain
    only single values. ex: byte,short,int,long,flaot,double,char,boolean etc
    but in non-primitive type we have to define and it references the values not directly take it
    ex: arr, string,class, object, interface, enum, record

4. how to take input in java - Scanner 
    import java.util.Scanner;
    Scanner sc = new Scanner (system.in)

    sc.close();

    there are various types of scanner methods - 
     - nextInt()
     - nextLong()
     - nextDouble()
     - nextFloat()
     - nextBoolean()
     - next()
     -nextLine()

8.  Type casting - means the types of the variables from one type to another
    a. widening casting - from smaller to larger
    b. narrowing casting - form larger to smaller. -float x; int v = (int) x;

9. Relational - =
                !=
                >
                <
                >=
                <=

10. Logical - &&
              ||
              !

11. Ternary Operator - condition ? value1 : value2;
ex : int age = 20;
     String result = age >= 18 ? "Adult" : "Minor";


12. Enhanced for loop - also called for each loop
 for(dataType variable : collection)

 for(int x : arr) -> int [] arr = {10,20,30};

13. Multidimensional Array : int [][] matrix = {
                                            {1,2,3},
                                            {3,5,6}

                                            };
14. Multiple operations on strings
            String name = "Suraj";

            name.length();
            name.charAT(2);
            name.toUpperCase(); // doesn't change the name variable only returns the corrected value
            name.toLowerCase();
            name.equals("Suraj"); // checks the variable value along with the cases
            name.equalsIgnoreCase("Suraj");

15. String Builder - frequently used for modifying strings.
    sb.append("Hello");
    sb.append("world");

    System.out.println(sb);

            there are various methods in string builder
            1. append()
            2. insert()
            3. delete()
            4. reverse()
            5. replace()
            6. toString()



String name = "Java";

System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.lenght());
System.out.println(name.charAt(2));







*/