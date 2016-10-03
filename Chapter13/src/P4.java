/**
 * Created by xiong on 10/3/16.
 */
public class P4 {
    public static void main(String[] args) {
        try {
            new NewLoan(7.5, 30, 100000);
            NewLoan m = new NewLoan(-1, 3, 3);
            new NewLoan(7.5, 30, 20000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("End of the program");
    }
}
