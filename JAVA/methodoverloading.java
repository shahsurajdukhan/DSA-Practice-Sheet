public class methodoverloading {
    // method overloading means multiple methods can have same name with different parameters;
    static int PlusMethod (int x, int y) {
        return x + y;
    }
    static double PlusMethod (double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(PlusMethod(5,6));
        System.out.println("This is int wala plusmethod");
        System.out.println(PlusMethod(4.5,4.5));
        System.out.println("This the float wala plusmethod.");
    }
}


// so there is a concept of block scope which says that when the variable is declared within the block scope {};
// then it will be accessed inside that only we cannot access the variable outside the block.
// this concept is known as block scope as simple as that..


// then we have something called loop scope which says that variable declared inside the loop will only exist within the loop.
// for example what we do in for loop

// for (int i=0; i>5; i++) -> here the i variable is a loop scope , we can also say that it is a block scope but 
// when we are seeing that it's inside the for loop then why not to say as it is , hardly there is 3 loop only
// for loop, while loop and if - else condition loop.