// in this problem i am going to use Enum for the fixed sizes of juice cups.

class Fresh {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}


public class FreshJuice {
    public static void main(String[] args) {
        Fresh juice = new Fresh();
        juice.size = Fresh.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }
}
