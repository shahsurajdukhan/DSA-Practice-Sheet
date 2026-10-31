
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

public class typesOfVar {

    public void pupAge() {
        int age=9;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        typesOfVar test = new typesOfVar();
        test.pupAge();
    }
}

// some important points to remeber about java Local variables

// 1. Local variables are declared in methods, constructors, or blocks.
// 2. Local variables are created when the method, constructors or block is entered
//     and the variable will be destroyed once it exits the method, constructor, or block.

// 3. Access modifiers cannot be used for local variables.
// 4. Local variables are visible only within the declared method, constructor, or block.
// 5. Local variables are implemented at stack level internally.
// 6. There is no default value for local variables, so local variables should be
//    declared and an initial value should be assigned before the first use. 