public class surajava {
    static void main() {
       int number = 41;
       String size;

       switch (number) {
           case 20:
               size = "Small";
               break;

           case 28 :
                   size = "Medium";
                   break;


           case 40 :
                       size = "Large";
                       break;

           default:
               size = "Unknown";
               break;
       }

        System.out.println("Size is " + size );


    }
}
