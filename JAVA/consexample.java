class Student {

        String name;
        int age;

        // constructor
        Student() {
            name = "Suraj Shah";
            age = 23;
        }

        void display() {
            System.out.println(name);
            System.out.println(age);
        }
}

public class consexample {
    static void main() {
        Student s1 = new Student();
        s1.display();
    }

}


// Constructor Overloading
class Student {
    String name;
    int age;

    // no-args constructor
    Student() {
       this.name = "UNKNOWN";
       this.age = 0;
    }

    // parameterized constructor having one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // parameterized constructor having both parameters
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printDetails () {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

public class consexample {
    static void main() {
        Student std1 = new Student(); // invokes no-args constructor
        Student std2 = new Student("Saahil"); // invokes parameterized constructor
        Student std3 = new Student("Raghav" , 30); // invokes parameterized constructor

        // printing details
        System.out.println("Std 1...");
        std1.printDetails();

        System.out.println("Std 2...");
        std2.printDetails();

        System.out.println("Std 3...");
        std3.printDetails();
    }
}