import java.util.ArrayList;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);

       ArrayList<Kharcha> expenses = new ArrayList<>();
       
        System.out.println("===== Expense Tracker =====");
        
        Kharcha expense = new Kharcha(250,"Food","Lunch");
        Kharcha expense2 = new Kharcha(500, "Fees", "Java Course Fees");
        
        expenses.add(expense);
        expenses.add(expense2);

        System.out.println(expense.amount);
        System.out.println(expense.category);
        System.out.println(expense.description);
        System.out.println(expense2.amount);
        System.out.println(expense2.category);
        System.out.println(expense2.description);
    
    
    }
}