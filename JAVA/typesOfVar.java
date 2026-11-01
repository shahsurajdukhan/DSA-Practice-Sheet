
// code for all the types of variables present in java

// 1. this is the Variable's local scope with initialization

// public class typesOfVar {
//     public void pupAge() {
//         int age = 0;
//         age = age + 7;
//         System.out.println("Puppy age is : " + age);

//     }
//     public static void main(String[] args) {
//         typesOfVar test = new typesOfVar();
//         test.pupAge();
//     }
// }


// 2. variable's local scope without initialization

// public class typesOfVar {

//     public void pupAge() {
//         int age=9;
//         age = age + 7;
//         System.out.println("Puppy age is : " + age);
//     }

//     public static void main(String[] args) {
//         typesOfVar test = new typesOfVar();
//         test.pupAge();
//     }
// }

// some important points to remeber about java Local variables

// 1. Local variables are declared in methods, constructors, or blocks.
// 2. Local variables are created when the method, constructors or block is entered
//     and the variable will be destroyed once it exits the method, constructor, or block.

// 3. Access modifiers cannot be used for local variables.
// 4. Local variables are visible only within the declared method, constructor, or block.
// 5. Local variables are implemented at stack level internally.
// 6. There is no default value for local variables, so local variables should be
//    declared and an initial value should be assigned before the first use. 




// Now, learning Java Instance Variables

// 1. Instace variables are declared in a class, but outside a method, constructor, or any block.


import java.io.*;

public class typesOfVar {

    public String name; // this instance variable is visible for any child class.

    private double salary; // salary variable is visible in Employee class only.

    public typesOfVar (String empName) {
        // The Name variable is assigned in the constructor.

        name = empName;
    }
        // salary variable is assigned a value
        public void setSalary(double empSal) {
            salary = empSal;
        }

        // this method prints the employee details
        public void printEmp() {
            System.out.println("name : " + name);
            System.out.println("Salary :" + salary);
        }

        public static void main (String agrs [] ) {
            typesOfVar empOne = new typesOfVar("Ransika");
            empOne.setSalary(1000);
            empOne.printEmp();

        }
    
}