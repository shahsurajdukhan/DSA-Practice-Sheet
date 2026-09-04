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
