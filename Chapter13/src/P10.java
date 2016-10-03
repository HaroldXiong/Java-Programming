import javax.swing.*;

/**
 * Created by xiong on 10/3/16.
 */
public class P10 {
    public static void main(String[] args) {
        try {
            int[] list = new int[20000000];
        } catch (Error ex) {
            ex.printStackTrace();
            System.out.println("You are running out of memory.");
        }

        System.out.println("GO");

        JOptionPane.showMessageDialog(null, "Wait");
    }
}
